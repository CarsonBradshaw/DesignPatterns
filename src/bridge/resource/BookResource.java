package bridge.resource;

public class BookResource implements Resource {
    private String title;

    public BookResource(String title) {
        this.title = title;
    }

    @Override
    public void getInfo() {
        System.out.println(title);
    }
}
