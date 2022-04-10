package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishop = new BishopBlack(Cell.C8);
        assertEquals(Cell.C8, bishop.position());
    }

    @Test
    public void wayWhenC1ThenG5() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell[] result = bishop.way(Cell.G5);
        Cell[] expected = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void copy() {
        BishopBlack bishop = new BishopBlack(Cell.C8);
        assertEquals(Cell.F5, bishop.copy(Cell.F5).position());
    }

    @Test(expected = ImpossibleMoveException.class)
    public void testWayWhenC1ToG4ThenException() {
        BishopBlack start = new BishopBlack(Cell.C1);
        Cell[] cells = start.way(Cell.G4);
    }
}