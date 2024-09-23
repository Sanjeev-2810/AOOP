package MusicApplication;

public class MusicStreamingApp {

	public static void main(String[] args) {
		MusicSource localFile = new LocalFileAdapter("song.mp3");
        MusicSource decoratedLocalFile = new EqualizerDecorator(new VolumeControlDecorator(localFile));
        decoratedLocalFile.play();

        // Stream online music with equalizer
        MusicSource onlineStream = new OnlineStreamAdapter("http://example.com/stream");
        MusicSource decoratedOnlineStream = new EqualizerDecorator(onlineStream);
        decoratedOnlineStream.play();

        // Play a radio station with volume control
        MusicSource radioStation = new RadioStationAdapter("http://example.com/radio");
        MusicSource decoratedRadioStation = new VolumeControlDecorator(radioStation);
        decoratedRadioStation.play();
    }
}
