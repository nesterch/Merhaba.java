package Gun33._02_Inheritance;

public class Zoo {
    public static void main(String[] args) {
        Katze kedi1=new Katze("siyah",3, "tekir");
        System.out.println("kedi1 = " + kedi1);
        kedi1.konustu();

        Hund kopek1=new Hund("beyaz", 50,"kangal");
        kopek1.konustu();

        Schlange yilan1=new Schlange("siyah",3,"engerek", 3);
        yilan1.konustu();
        System.out.println("yilan1 = " + yilan1);

        Ente ordek1=new Ente("yeşil",3,"gövel", 90);
        ordek1.konustu();
        System.out.println("ordek1 = " + ordek1);

    }
}
