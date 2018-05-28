package chain_of_responsibility.handlers;

import chain_of_responsibility.request.Request;

public class HamHandler extends RequestHandlerChain {
    @Override
    protected boolean handleRequest(Request request) {
        if(request.getType().equals("ham")) {
            System.out.println(request.getBody());
            return true;
        }

        return false;
    }

    public HamHandler(RequestHandlerChain nextChain){
        super(nextChain);
    }
}
