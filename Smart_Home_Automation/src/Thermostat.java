public class Thermostat implements Device {
    private int temperature = 70;

    public void increaseTemperature() {
        temperature++;
        System.out.println("Thermostat temperature increased to " + temperature + " degrees.");
    }

    public void decreaseTemperature() {
        temperature--;
        System.out.println("Thermostat temperature decreased to " + temperature + " degrees.");
    }
}
