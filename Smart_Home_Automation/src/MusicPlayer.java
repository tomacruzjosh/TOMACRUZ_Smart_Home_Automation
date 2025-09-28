public class MusicPlayer implements Device {
    public void play(String playlist) {
        System.out.println("Music player is now playing: " + playlist);
    }

    public void stop() {
        System.out.println("Music player has stopped.");
    }
}
