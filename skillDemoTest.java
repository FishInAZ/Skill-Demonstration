import java.beans.Transient;

import static org.junit.Assert.*;
import org.junit.*;

public class skillDemoTest {
   @Test
   public void minus(){
       assertEquals(2,skillDemo.minus(2,1));
   }
}
