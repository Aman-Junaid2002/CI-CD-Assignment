import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoginAppTest {

    private LoginApp loginApp;

    @BeforeEach
    void setUp() {
        loginApp = new LoginApp();
    }

    @Test
    void testAuthenticateUserWithValidCredentials() {
        String email = "aman@example.com";
        String password = "aman";
        String expectedName = "Aman";

        String actualName = loginApp.authenticateUser(email, password);
        assertEquals(expectedName, actualName, "User should be authenticated with valid credentials.");
    }

    @Test
    void testAuthenticateUserWithInvalidEmail() {
        String email = "amann@example.com";
        String password = "aman";

        String actualName = loginApp.authenticateUser(email, password);
        assertNull(actualName, "Authentication should fail with an invalid email.");
    }

    @Test
    void testAuthenticateUserWithInvalidPassword() {
        String email = "aman@example.com";
        String password = "iamc";

        String actualName = loginApp.authenticateUser(email, password);
        assertNull(actualName, "Authentication should fail with an invalid password.");
    }

    @Test
    void testAuthenticateUserWithEmptyEmail() {
        String email = "";
        String password = "aman";

        String actualName = loginApp.authenticateUser(email, password);
        assertNull(actualName, "Authentication should fail with an empty email.");
    }

    @Test
    void testAuthenticateUserWithEmptyPassword() {
        String email = "aman@example.com";
        String password = "";

        String actualName = loginApp.authenticateUser(email, password);
        assertNull(actualName, "Authentication should fail with an empty password.");
    }
}
