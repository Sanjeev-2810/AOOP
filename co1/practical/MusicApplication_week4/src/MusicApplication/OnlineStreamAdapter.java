package MusicApplication;

public class OnlineStreamAdapter implements MusicSource {
	private String streamUrl;

    public OnlineStreamAdapter(String streamUrl) {
        this.streamUrl = streamUrl;
    }

    @Override
    public void play() {
        System.out.println("Streaming music from: " + streamUrl);
        // Logic to stream music from an online source
    }
}
