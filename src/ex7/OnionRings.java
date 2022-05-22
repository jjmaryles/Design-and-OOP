package ex7;

public class OnionRings extends Decorator {
    @Override
    public String serve() {
        return order;
    }

    @Override
    public String name() {
        return " with onion rings";
    }

    @Override
    public void upDateServe(String order) {
        this.order = order + this.name();
    }
}

