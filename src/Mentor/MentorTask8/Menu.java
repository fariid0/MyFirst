package src.Mentor.MentorTask8;

public class Menu {
    Kabab kabab;
    Meze meze;
    Icki icki;

    public Menu(Kabab kabab, Meze meze, Icki icki) {
        this.kabab = kabab;
        this.meze = meze;
        this.icki = icki;
    }

    public Menu() {
    }

    @Override
    public String toString() {
        return "\n" + "      MENU" + "\n" +
                 kabab + " \n" +
                 meze + " \n" +
                 icki;
    }
    public void getTotal(){
        return;
    }

    public void cem(){
        kabab.getPrice1();
        kabab.getPrice2();
        kabab.getPrice3();
        icki.getPrice1();
        icki.getPrice2();
        icki.getPrice3();
        meze.getPrice1();
        meze.getPrice2();
        meze.getPrice3();
    }
}
