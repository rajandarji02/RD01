package TestNG;
import Page_Object_FW.Hooks;
import Page_Object_FW.Login;
import Page_Object_FW.Register;
import Page_Object_FW.Wish;
import org.testng.annotations.Test;
import java.io.IOException;

    public class TestRun extends Hooks {
        @Test
        public static void reg() throws InterruptedException, IOException {
            Register register = new Register();
            register.RegisterPage();
        }

        @Test
        public static void log() throws InterruptedException, IOException {
            Login login = new Login();
            login.loginPage();
        }

        @Test
        public static void wish() throws InterruptedException, IOException {
            Wish WISH = new Wish();
            WISH.WishListPage();
        }
    }