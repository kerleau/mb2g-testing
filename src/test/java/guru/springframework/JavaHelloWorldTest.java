package guru.springframework;
    
import static org.junit.Assert.*;

import org.junit.Test;

public class JavaHelloWorldTest {

   @Test
   public void getHellow(){
      JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

      assertEquals("Hello World", javaHelloWorld.getHello());

   }

   
}
    