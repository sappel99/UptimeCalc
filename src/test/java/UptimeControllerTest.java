import at.sappel.UptimeController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UptimeControllerTest {

    @Test
    public void test_calculateUptimeCorrectly(){

        //Arrange
        UptimeController controller = new UptimeController();

        //Act
        String actualValue = controller.calculateUptime(99.95);
        actualValue = actualValue.replace(',','.');
        //Assert
        Assertions.assertEquals("43178.40", actualValue);

    }
}
