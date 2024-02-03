package StructuralDesignPatterns.FacadeDesignPattern.Example01;

public class MultimediaFacade {

    private final AudioPlayer audioPlayer;
    private final VideoPlayer videoPlayer;
    private final Projector projector;

    public MultimediaFacade() {

        this.audioPlayer = new AudioPlayer();
        this.videoPlayer = new VideoPlayer();
        this.projector = new Projector();
    }

    public void playAudio(String audio){

        audioPlayer.turnOn();;
        audioPlayer.play(audio);
        audioPlayer.turnOff();

    }
    public void playVideo(String video){

        videoPlayer.turnOn();
        videoPlayer.play(video);
        videoPlayer.turnOff();
    }
    public void projectOnScreen(){

        projector.turnOn();
        projector.projectOnScreen();
        projector.turnOff();

    }
}
