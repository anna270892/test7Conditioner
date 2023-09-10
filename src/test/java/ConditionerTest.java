import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionerTest {

    //задаем и проверяем текущую температуру кондиционера
    @Test
    public void shouldSetTemperature() {
        Conditioner cond = new Conditioner();

        cond.currentTemperature = 15; //тестируемое действие поля с температурой

        int expected = 15; //ожидаемый
        int actual = cond.currentTemperature; //фактический

        Assertions.assertEquals(expected, actual);
    }

    //спрашиваем у кондиционера его максимальную температуру
    @Test
    public void shouldSetToMaxTemperature() {
        Conditioner cond = new Conditioner();

        cond.setToMaxTemperature(); //тестируемое действие

        int expected = 30; //ожидаемый
        int actual = cond.currentTemperature; //фактический, спрашиваем у кондиционера какая у него текущая температура

        Assertions.assertEquals(expected, actual);
    }
}