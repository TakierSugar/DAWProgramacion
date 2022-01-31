package POO;

public class Heater {
    double temperature;
    double min,max,increment;

    public double warmer(double warmer){

        this.temperature = temperature + increment;
            if (temperature > max) temperature = max;
        return temperature;
    }
    public double cooler(double cooler){

        this.temperature = temperature - increment;
            if (temperature < min) temperature = min;
        return temperature;
    }
    public Heater(double minimo , double maximo) {
        this.temperature = 15.0;
        this.increment = 5.0;
        this.min = minimo;
        this.max = maximo;
    }
    public double getTemperature() {
        return temperature;
    }
    public void setIncrement(double increment) {
            if (increment < 1.0)
                this.increment = 1.0;
            else if (increment > 5.0)
                this.increment = 5.0;
            else
                this.increment = increment;
            
    }

}