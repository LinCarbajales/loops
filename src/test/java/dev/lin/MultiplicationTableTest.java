package dev.lin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class MultiplicationTableTest {

    @Test
    void testGetTableWithFive() {
        String expected =
            "5 x 1 = 5\n" +
            "5 x 2 = 10\n" +
            "5 x 3 = 15\n" +
            "5 x 4 = 20\n" +
            "5 x 5 = 25\n" +
            "5 x 6 = 30\n" +
            "5 x 7 = 35\n" +
            "5 x 8 = 40\n" +
            "5 x 9 = 45\n" +
            "5 x 10 = 50";

        String actual = MultiplicationTable.getTable(5);
        assertEquals(expected, actual);
    }

    @Test
    void testConstructor() {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        assertNotNull(multiplicationTable);
    }
}