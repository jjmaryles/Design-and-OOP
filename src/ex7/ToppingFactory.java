package ex7;

public class ToppingFactory {
    public static Decorator addToppings(String code,Hamburger burger){
        Decorator dec = null;
        switch (code){
            case "ch":
                dec = new Chips();
                break;
            case "or":
                dec = new OnionRings();
                break;
            case "sa":
                dec = new Salad();
                break;
            case "fe":
                dec = new FriedEgg();
                break;
            default:
                throw new RuntimeException("wrong Side");
        }
        dec.upDateServe(burger.serve());
        return dec;
    }
}

