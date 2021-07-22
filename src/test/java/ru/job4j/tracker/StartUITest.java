package ru.job4j.tracker;

import org.junit.Test;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Output output = new ConsoleOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output output = new ConsoleOutput();
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Replaced item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new EditItem(output),
                new ExitAction(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output output = new ConsoleOutput();
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Deleted item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteItem(output),
                new ExitAction(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() + "0. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenShowAll() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
       Item item = tracker.add(new Item("New item"));
        Input in = new StubInput(
                new String[] {"0", "1"}
        );

        UserAction[] actions = {
                new ShowAllItems(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat((out.toString()), is("Menu."
                + System.lineSeparator() + "0. Show all items"
                + System.lineSeparator() + "1. Exit"
                + System.lineSeparator()
                + "===Show all items==="
                + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. Show all items"
                + System.lineSeparator()
                + "1. Exit" + System.lineSeparator()));
    }

    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("New item name"));
        String name = "New item name";
        Input in = new StubInput(
                new String[]{"0", name, "1"}
        );

        UserAction[] actions = {
                new FindItemsByName(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat((out.toString()), is("Menu."
                + System.lineSeparator()
                + "0. Find items by name"
                + System.lineSeparator()
                + "1. Exit"
                + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. Find items by name"
                + System.lineSeparator()
                + "1. Exit" + System.lineSeparator()));
    }

    @Test
    public void whenFindByID() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("New item name"));
        int  id = item.getId();
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );

        UserAction[] actions = {
                new FindItemByID(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat((out.toString()), is("Menu."
                + System.lineSeparator()
                + "0. Find item by id"
                + System.lineSeparator()
                + "1. Exit"
                + System.lineSeparator()
                + "=== Find item by id ===="
                + System.lineSeparator()
                + item + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. Find item by id"
                + System.lineSeparator()
                + "1. Exit" + System.lineSeparator()));
    }

    }
