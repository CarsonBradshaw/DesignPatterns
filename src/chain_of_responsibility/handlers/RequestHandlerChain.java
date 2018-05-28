package chain_of_responsibility.handlers;

import chain_of_responsibility.request.Request;

public abstract class RequestHandlerChain {
    private RequestHandlerChain nextChain;
    public RequestHandlerChain(RequestHandlerChain nextChain){
        this.nextChain = nextChain;
    }
    protected RequestHandlerChain(){

    }

    protected abstract boolean handleRequest(Request request);

    public void handleRequestOrElseDelegate(Request request){
        if(handleRequest(request))
            return;

        if(nextChain != null)
            nextChain.handleRequestOrElseDelegate(request);

        else
            System.out.println("Request was not handled: " + request);
    }
}
