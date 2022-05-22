package ex7;


public class HamburgerFactory {
    public static Hamburger createHamburger(String code){
        /*      cl: classic
                sp: spicy
                la: lamb
                hm: homemade */
        Hamburger hamburgerChoose;
        switch (code){
            case "cl":
                hamburgerChoose = new ClassicHamburger();
                break;
            case "sp":
                hamburgerChoose = new SpicyHamburger();
                break;
            case "la":
                hamburgerChoose = new LambHamburger();
                break;
            case "hm":
                hamburgerChoose = new HomemadeHamburger();
                break;
            default:
                throw new RuntimeException("wrong Hamburger");
        }
        return hamburgerChoose;
    }
}

