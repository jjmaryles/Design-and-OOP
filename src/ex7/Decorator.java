package ex7;

public abstract class Decorator implements Hamburger{
    @Override
    public abstract String serve();
    public abstract String name();
    public abstract void upDateServe(String order);
    String order = "";
}
