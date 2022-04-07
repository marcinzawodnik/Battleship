package Test;

import Game.Sea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeaTest
{

    @Test
    void getFieldTest1()
    {
        Sea sea = new Sea();
        char field[][] = sea.getField();
        boolean result = field[0][0] == '~' || (field[0][0] == '0');
        Assertions.assertEquals(true, result);
    }
    @Test
    void getFieldTest2()
    {
        Sea sea = new Sea();
        char field[][] = sea.getField();
        int result = field.length;
        Assertions.assertEquals(10, result);
    }

}