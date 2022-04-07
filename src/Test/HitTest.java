package Test;

import Game.Hit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HitTest
{

    @Test
    void returnRowTest()
    {
        Hit hit = new Hit();
        int result = hit.returnRow();
        Assertions.assertTrue(result >=0 && result <10);
    }

    @Test
    void returnColumnTest()
    {
        Hit hit = new Hit();
        int result = hit.returnColumn();
        Assertions.assertTrue(result >=0 && result <10);
    }
}