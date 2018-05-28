package chain_of_responsibility.handlers;

import chain_of_responsibility.request.Request;

public class BaconHandler extends RequestHandlerChain {
    @Override
    protected boolean handleRequest(Request request) {
        if(request.getType().equals("bacon")) {
            System.out.println(request.getBody());
            return true;
        }

        return false;
    }

    public BaconHandler(RequestHandlerChain nextChain){
        super(nextChain);
    }
}
