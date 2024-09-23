package MusicApplication;

public class VolumeControlDecorator extends MusicSourceDecorator {

    public VolumeControlDecorator(MusicSource decoratedMusicSource) {
        super(decoratedMusicSource);
    }

    @Override
    public void play() {
        super.play();
        adjustVolume();
    }

    private void adjustVolume() {
        System.out.println("Volume adjusted.");
        // Logic to adjust volume
    }
}