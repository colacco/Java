package ex4;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    public double celsiusParaFahrenheit(double celsius) {
        return  (9 * celsius / 5) + 32;
    }

    public double fahrenheitParaCelsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }
}
