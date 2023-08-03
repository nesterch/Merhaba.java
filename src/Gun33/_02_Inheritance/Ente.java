package Gun33._02_Inheritance;

public class Ente extends Tiere {
    private double kanatAcikligi;

    public Ente(String renk, int kilo, String cinsi, double kanatAcikligi) {
        super(renk, kilo, cinsi);
        setKanatAcikligi(kanatAcikligi);
    }

    @Override
    public void konustu() {
        System.out.println("Ördek işlemleri");
        super.konustu();
        System.out.println("vak vak");
    }

    @Override
    public String toString() {
        return super.toString()+
                ", kanat açikliği= "+this.kanatAcikligi;
    }

    public double getKanatAcikligi() {
        return kanatAcikligi;
    }

    public void setKanatAcikligi(double kanatAcikligi) {
        this.kanatAcikligi = kanatAcikligi;
    }
}
