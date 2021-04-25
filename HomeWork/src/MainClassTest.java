import org.junit.Assert;
import org.junit.Test;
import java.util.Locale;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassString() {
        Assert.assertTrue("String doesn't contain word hello", this.getClassString().toLowerCase(Locale.ROOT).contains("hello"));
    }
}