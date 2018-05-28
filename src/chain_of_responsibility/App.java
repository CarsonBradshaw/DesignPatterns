package chain_of_responsibility;

import chain_of_responsibility.handlers.BaconHandler;
import chain_of_responsibility.handlers.HamHandler;
import chain_of_responsibility.handlers.RequestHandlerChain;
import chain_of_responsibility.handlers.TurkeyHandler;
import chain_of_responsibility.request.BaconRequest;
import chain_of_responsibility.request.HamRequest;
import chain_of_responsibility.request.Request;
import chain_of_responsibility.request.TurkeyRequest;

public class App {
    public static void main(String[] args) {
        Request request1 = new BaconRequest();
        Request request2 = new HamRequest();
        Request request3 = new TurkeyRequest();

        RequestHandlerChain rhc1 = new BaconHandler(new HamHandler(null));

        rhc1.handleRequestOrElseDelegate(request1);
        rhc1.handleRequestOrElseDelegate(request2);
        rhc1.handleRequestOrElseDelegate(request3);

    }
}
