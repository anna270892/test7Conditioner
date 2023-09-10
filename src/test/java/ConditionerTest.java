import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionerTest {

    //задаем и проверяем текущую температуру кондиционера
    @Test
    public void shouldSetTemperature() {
        Conditioner cond = new Conditioner();

        cond.setCurrentTemperature(15);  //тестируемое действие поля с температурой

        int expected = 15; //ожидаемый
        int actual = cond.getCurrentTemperature(); //фактический

        Assertions.assertEquals(expected, actual);
    }

    //спрашиваем у кондиционера его максимальную температуру
    @Test
    public void shouldSetToMaxTemperature() {
        Conditioner cond = new Conditioner();

        cond.setToMaxTemperature(); //тестируемое действие

        int expected = 30; //ожидаемый
        int actual = cond.getCurrentTemperature(); //фактический, спрашиваем у кондиционера какая у него текущая температура

        Assertions.assertEquals(expected, actual);
    }

    //просим установить его 50 градусов
    @Test
    public void shouldNotSetTemperatureAboveMax() {
        Conditioner cond = new Conditioner();

        cond.setCurrentTemperature(50);

        int expected = 0;
        int actual = cond.getCurrentTemperature();

        Assertions.assertEquals(expected, actual);
    }


    //увеличение значения кондиционера в полтора раза
    @Test
    public void shouldIncreaseTemperature50p() {
        Conditioner cond = new Conditioner();
        cond.setCurrentTemperature(25); //задаем кондиционеру выставь температуру на 25 градусов

        cond.increaseTemp50p(); //тестируемое действие

        int expected = 25; // 25 потому что кондиционер не будет увеличивать температру в полтора раза, так как она превышает максимально допустимую
        int actual = cond.getCurrentTemperature();

        Assertions.assertEquals(expected, actual);
    }

}
