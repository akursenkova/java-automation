import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test

    /* public void testGetLocalNumber() {

        int a = this.getLocalNumber();
        if (a == 14) {
            System.out.println("True");
        } else {
            System.out.println("Number 'a' doesn't equals 14");
        }
    } */

    public void testGetClassNumber() {
        if (getClassNumber() > 45) {
            System.out.println("True");
        } else {
            System.out.println("Your number is less than 45");
        }
    }
}