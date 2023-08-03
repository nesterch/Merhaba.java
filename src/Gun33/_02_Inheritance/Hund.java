package Gun33._02_Inheritance;

public class Hund extends Tiere {

    public Hund(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        //super.konustu();
        System.out.println("havladi");
    }
}
