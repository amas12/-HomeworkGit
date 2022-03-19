package qa.guru.owner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SimpleTest {
    @Test
    void assertTrue(){
        Assertions.assertTrue(3>2);
    }
}
