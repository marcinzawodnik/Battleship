package Test;

import Game.HitCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HitCounterTest
{

    @Test
    void addHit()
    {
        HitCounter hitCounter = new HitCounter();
        hitCounter.addHit();
        int result = hitCounter.getHits();
        Assertions.assertEquals(1, result);
    }
}