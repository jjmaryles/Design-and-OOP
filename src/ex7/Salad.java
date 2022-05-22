package ex7;

public class Salad extends Decorator {
    @Override
    public String serve() {
        return order;
    }

    @Override
    public String name() {
        return " with salad";
    }

    @Override
    public void upDateServe(String order) {
        this.order = order + this.name();
    }
}
