package bridge.view;

import bridge.resource.Resource;

public class ShortFormView implements View {
    private Resource resource;

    public ShortFormView(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void display() {
        resource.getInfo();
    }
}
