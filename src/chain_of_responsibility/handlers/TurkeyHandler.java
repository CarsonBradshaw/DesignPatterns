package chain_of_responsibility.handlers;

import chain_of_responsibility.request.Request;

public class TurkeyHandler extends RequestHandlerChain {
    @Override
    protected boolean handleRequest(Request request) {
        if(request.getType().equals("turkey")) {
            System.out.println(request.getBody());
            return true;
        }

        return false;
    }

    public TurkeyHandler(RequestHandlerChain nextChain){
        super(nextChain);
    }
}
