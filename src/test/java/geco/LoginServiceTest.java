package geco;

import junit.framework.TestCase;

import java.util.List;

public class LoginServiceTest extends TestCase {

    private LoginService loginService;


    public void setUp() throws Exception {
        super.setUp();
        String[] logins = {"login1","login2","login3"};
        loginService = new LoginService(logins);
    }

    public void testLoginExists() {
        assertTrue(loginService.loginExists("login1"));
        assertFalse(loginService.loginExists("login4"));
    }

    public void testAddLogin() {
        loginService.addLogin("login4");
        assertTrue(loginService.loginExists("login4"));
    }

    public void testFindAllLoginsStartingWith() {
        assertTrue(loginService.findAllLoginsStartingWith("nigol").isEmpty());
        assertFalse(loginService.findAllLoginsStartingWith("log").isEmpty());
    }

    public void testFindAllLogins() {
        List<String> logins = loginService.findAllLogins();
        assertFalse(logins.isEmpty());
        assertEquals("login1",logins.get(0));
    }
}