public class Conditioner {

    public int currentTemperature; //поле с текущей температурой

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    //подходит ли это значение прежде чем его присваивать
    public void setCurrentTemperature(int newCurrentTemperature) {
        if (newCurrentTemperature < 0) { //если температура меньше нуля то мы не можем ее поставить
            return;
        }
        if (newCurrentTemperature > 30) { //новая температура больше максиамальной уходим из метода
            return;
        }
        currentTemperature = newCurrentTemperature;
    }

    //увеличение значения кондиционера в полтора раза
    public void increaseTemp50p() {
        int target = currentTemperature * 3 / 2; //currentTemperature - текущая температура
        setCurrentTemperature(target); //вызываем готовый сетер, для проверки превышения максимально допустимого значения
    }

    public void setToMaxTemperature() {    //функция не будет ни чег возвращать, кондиционер просто меняет внутри температуру и не сообщает нам ни чего
//кондиционер знает какая у него текущая температруа и какая максимальная
        currentTemperature = 30;
    }
}
