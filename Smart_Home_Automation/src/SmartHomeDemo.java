public class SmartHomeDemo {
    public static void main(String[] args) {
        // Create devices
        Light livingRoomLight = new Light("Living Room");
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        // Create a remote control
        RemoteControl remote = new RemoteControl();

        // --- Control the Living Room Light ---
        // Create command objects for the light
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Turn the light on
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn the light off
        remote.setCommand(lightOff);
        remote.pressButton();

        System.out.println("\n----------------------------------\n");

        // --- Control the Thermostat ---
        // Create command objects for the thermostat
        Command tempUp = new ThermostatIncreaseTemperatureCommand(thermostat);
        Command tempDown = new ThermostatDecreaseTemperatureCommand(thermostat);

        // Increase the temperature
        remote.setCommand(tempUp);
        remote.pressButton();

        // Decrease the temperature
        remote.setCommand(tempDown);
        remote.pressButton();

        System.out.println("\n----------------------------------\n");

        // --- Control the Music Player ---
        // Create command objects for the music player
        Command playMusic = new MusicPlayerPlayCommand(musicPlayer, "Classic Rock Hits");
        Command stopMusic = new MusicPlayerStopCommand(musicPlayer);

        // Play music
        remote.setCommand(playMusic);
        remote.pressButton();

        // Stop music
        remote.setCommand(stopMusic);
        remote.pressButton();
    }
}