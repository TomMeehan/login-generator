package geco;

import junit.framework.TestCase;

public class LoginGeneratorTest extends TestCase {

    private LoginService loginService;
    private LoginGenerator loginGenerator;

    public void setUp() throws Exception {
        super.setUp();
        loginService = new LoginService(new String[] {"JROL",
                "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);
    }

    public void testGenerateLoginForNomAndPrenom() {
        String newLogin = loginGenerator.generateLoginForNomAndPrenom("Durand","Paul");
        assertEquals("PDUR",newLogin);
        assertTrue(loginService.loginExists("PDUR"));
    }

    public void testCT2() {
        String newLogin = loginGenerator.generateLoginForNomAndPrenom("Ralling","John");
        assertEquals("JRAL2",newLogin);
        assertTrue(loginService.loginExists("JRAL2"));
    }

    public void testCT3() {
        String newLogin = loginGenerator.generateLoginForNomAndPrenom("Rolling","Jean");
        assertEquals("JROL1",newLogin);
        assertTrue(loginService.loginExists("JROL1"));
    }

    public void testCT4(){
        String newLogin = loginGenerator.generateLoginForNomAndPrenom("Dùrand","Paul");
        assertEquals("PDUR",newLogin);
        assertTrue(loginService.loginExists("PDUR"));
    }

    public void testCTShortName(){
        String newLogin = loginGenerator.generateLoginForNomAndPrenom("Du","Paul");
        assertEquals("PDU",newLogin);
    }
}