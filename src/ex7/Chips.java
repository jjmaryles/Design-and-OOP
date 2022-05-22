package ex7;

public class Chips extends Decorator {
    @Override
    public String serve() {
        return order;
    }

    @Override
    public String name() {
        return " with chips";
    }

    @Override
    public void upDateServe(String order) {
        this.order = order + this.name();
    }
}
