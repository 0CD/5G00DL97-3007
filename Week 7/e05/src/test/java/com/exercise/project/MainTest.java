import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class MainTest {
   @Test
   public void testMainMethod() {
      ByteArrayOutputStream outContent = new ByteArrayOutputStream();
      System.setOut(new PrintStream(outContent));

      Main main = new Main();
      main.main(null);

      assertEquals("Filtered People:\n40\n50\n", outContent.toString());
   }
}
