package MusicApplication;

public class RadioStationAdapter implements MusicSource{
	private String stationUrl;

    public RadioStationAdapter(String stationUrl) {
        this.stationUrl = stationUrl;
    }

    @Override
    public void play() {
        System.out.println("Playing radio station: " + stationUrl);
        // Logic to play radio station
    }

}
