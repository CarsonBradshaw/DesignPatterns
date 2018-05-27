package bridge.view;

import bridge.resource.Resource;

public class LongFormView implements View {
    private Resource resource;

    public LongFormView(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void display() {
        resource.getInfo();
    }
}
