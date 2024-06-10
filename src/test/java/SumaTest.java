import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumaTest {

    Sumar miSuma = new Sumar();

    int num1 = 5;
    int num2 = 6;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test

    //Test valido
     void sumarTest() {
        int result = miSuma.suma(num1,num2);
        Assertions.assertEquals(11,result);
    } 
}