package bridge.resource;

public class ArtistResource implements Resource {
    private String artist;

    public ArtistResource(String artist) {
        this.artist = artist;
    }

    @Override
    public void getInfo() {
        System.out.println(artist);
    }
}
