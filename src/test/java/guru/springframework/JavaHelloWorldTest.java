package guru.springframework;
    
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JavaHelloWorldTest {

   @Test
   public void getHellow(){
      JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

      assertEquals("Hello World", javaHelloWorld.getHello());
   }

   
}
    