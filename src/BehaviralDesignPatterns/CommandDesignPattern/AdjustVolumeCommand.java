package BehaviralDesignPatterns.CommandDesignPattern;

public class AdjustVolumeCommand implements Command{
    @Override
    public void execute() {
        stereo.adjustVolume();
    }

    private Stereo stereo;

    public AdjustVolumeCommand(Stereo stereo) {
        this.stereo = stereo;
    }
}
