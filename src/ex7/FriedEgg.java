package ex7;

public class FriedEgg extends Decorator {

    @Override
    public String serve() {
        return order;
    }

    @Override
    public String name() {
        return " with fried egg";
    }
    @Override
    public void upDateServe(String order) {
        this.order = order + this.name();
    }
}
