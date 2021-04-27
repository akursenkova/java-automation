import org.junit.Assert;
import org.junit.Test;
import java.util.Locale;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassString() {
        Assert.assertTrue("String doesn't contain \"hello\" or \"Hello\" words", this.getClassString().contains("hello") || this.getClassString().contains("Hello"));
    }
}