package geco;

import java.util.regex.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    PasswordGeneration pwg;
    String pattern = "^[a-zA-Z0-9_]{8}$";

    @Test
    public void getRandomPassword() {
        pwg = new PasswordGeneration();
        String pwd = pwg.getRandomPassword();
        assertEquals(8,pwd.length());
        assertTrue(pwd.matches(pattern));
    }
}