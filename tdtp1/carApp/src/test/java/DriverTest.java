import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DriverTest {

    private Driver driver;

    @BeforeEach
    public void setUp() {
        driver = new Driver("John", 20);
    }

    @Test
    public void testIsAdult() {
        assertThat(driver.isAdult()).isTrue();
    }

    @Test
    public void testStartCar() {
        Car car = new Car("Sedan", "Bleu");
        car.startCar(driver);
        // How to assert that the demarrerVoiture method was called?
    }

    @Test
    public void testStopCar() {
        Car car = new Car("Sedan", "Bleu");
        car.stopCar(driver);
        // How to assert that the arreterVoiture method was called?
    }

    @Test
    public void testChangeGear() {
        Car car = new Car("Sedan", "Bleu");

        car.changeGear(80, driver);
        assertThat(car.getSpeed()).isEqualTo(80);
    }
}
