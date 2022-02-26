package ru.job4j.tracker;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsNull;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.InputStream;
import java.sql.*;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SqlTrackerTest {

    private static Connection connection;

    @BeforeClass
    public static void initConnection() {
        try (InputStream in = SqlTrackerTest.class.getClassLoader()
                .getResourceAsStream("src/main/resources/test.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            connection = DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")

            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @AfterClass
    public static void closeConnection() throws SQLException {
        connection.close();
    }

    @After
    public void wipeTable() throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement("delete from items")) {
            statement.execute();
        }
    }

    @Test
    public void whenSaveItemAndFindByGeneratedIdThenMustBeTheSame() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = new Item("item");
        tracker.add(item);
        assertThat(tracker.findById(item.getId()), is(item));
    }

    @Test
    public void whenSaveItemAndReplace() {
        SqlTracker tracker = new SqlTracker(connection);
        Item bug = new Item("Bug");
        tracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        assertTrue(tracker.replace(id, bugWithDesc));
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenSaveItemAndReplaceButNotFound() {
        SqlTracker tracker = new SqlTracker(connection);
        Item bug = new Item("Bug");
        tracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        assertFalse(tracker.replace(id + 1, bugWithDesc));
        assertThat(tracker.findById(id).getName(), is("Bug"));
    }

    @Test
    public void whenDelete() {
        SqlTracker tracker = new SqlTracker(connection);
        Item bug = new Item("Bug");
        tracker.add(bug);
        int id = bug.getId();
        assertTrue(tracker.delete(id));
        assertThat(tracker.findById(id), is(IsNull.nullValue()));
    }

    @Test
    public void whenDeleteButNotFound() {
        SqlTracker tracker = new SqlTracker(connection);
        Item bug = new Item("Bug");
        tracker.add(bug);
        int id = bug.getId();
        assertFalse(tracker.delete(id + 1));
        assertThat(tracker.findById(id), is(bug));
    }

    @Test
    public void whenFindById() {
        SqlTracker tracker = new SqlTracker(connection);
        Item bug = new Item("Bug");
        tracker.add(bug);
        int id = bug.getId();
        assertThat(tracker.findById(id), is(bug));
    }

    @Test
    public void whenFindByIdButNotFound() {
        SqlTracker tracker = new SqlTracker(connection);
        Item bug = new Item("Bug");
        tracker.add(bug);
        int id = bug.getId();
        assertThat(tracker.findById(id + 1), is(IsNull.nullValue()));
    }

    @Test
    public void whenFindAll() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item1 = tracker.add(new Item("first"));
        Item item2 = tracker.add(new Item("second"));
        List<Item> rsl = tracker.findAll();
        List<Item> expect = List.of(item1, item2);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenFindByName() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item1 = tracker.add(new Item("first"));
        Item item2 = tracker.add(new Item("second"));
        Item item3 = tracker.add(new Item("first"));
        List<Item> rsl = tracker.findByName("first");
        List<Item> expect = List.of(item1, item3);
        assertThat(rsl, is(expect));
    }
}