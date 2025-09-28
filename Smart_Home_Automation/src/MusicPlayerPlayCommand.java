public class MusicPlayerPlayCommand implements Command {
    private MusicPlayer musicPlayer;
    private String playlist;

    public MusicPlayerPlayCommand(MusicPlayer musicPlayer, String playlist) {
        this.musicPlayer = musicPlayer;
        this.playlist = playlist;
    }

    @Override
    public void execute() {
        musicPlayer.play(playlist);
    }
}
