package ru.job4j.stream;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void testConvertMatrixToList() {
        Integer[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        List<Integer> fromMatrix = Matrix.convertMatrixToList(matrix);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertThat(fromMatrix, is(expected));
    }
}