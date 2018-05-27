package bridge;

import bridge.resource.ArtistResource;
import bridge.resource.BookResource;
import bridge.view.LongFormView;
import bridge.view.ShortFormView;
import bridge.view.View;

public class App {
    public static void main(String[] args) {
        View view = new LongFormView(new BookResource("Harry Potter"));
        view.display();
        System.out.println();

        view = new LongFormView(new ArtistResource("Led Zeppelin"));
        view.display();
        System.out.println();

        view = new ShortFormView(new BookResource("Harry Potter"));
        view.display();
        System.out.println();
    }
}
