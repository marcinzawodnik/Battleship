package Test;
import Game.MoveCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoveCounterTest
{
    @Test
    void addPointTest()
    {
        MoveCounter moveCounter = new MoveCounter();
        moveCounter.addPoint();
        int result = moveCounter.getCounter();
        Assertions.assertEquals(1, result);
    }
}