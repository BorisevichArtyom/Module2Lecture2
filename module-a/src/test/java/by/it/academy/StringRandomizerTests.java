package by.it.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class StringRandomizerTests {

    @Test
    void EmptyString(){
        StringRandomizer moduleTemp=new StringRandomizer();
        Assertions.assertNotNull(moduleTemp.randomString());
    }

}
