public class Main {


    public static void main(String[] args) {
        Hattertar[] tarak = new Hattertar[4];
        tarak[0] = new SSD("ssd1", 500, 200, 3);
        tarak[1] = new SSD("ssd2", 1000, 500, 6);
        tarak[2] = new HDD("hdd1", 500, 200, 50000);
        tarak[3] = new HDD("hdd2", 500, 200, 100000);


        //    for (Hattertar h : tarak) {
        //      h.kiir();
        //}//mndegyiket kiir
        int osszKapacitas = 0;
        int osszSzabad = 0;
        for (Hattertar h : tarak) {//összeszámol összkapacitás
            osszKapacitas += h.getKapacitas();
            osszSzabad += h.getSzabad();
        }

        System.out.println("Összes kapacitás: " + osszKapacitas + ", Szabad kapacitás: " + osszSzabad);

        tarak[0].write(25);
        tarak[1].write(12);
        tarak[2].write(-15);


        for (Hattertar h : tarak) {
            h.kiir();
        }
        osszKapacitas = 0;
        osszSzabad = 0;
        for (Hattertar h : tarak) {//összeszámol összkapacitás
            osszKapacitas += h.getKapacitas();
            osszSzabad += h.getSzabad();
        }
        System.out.println("Összes kapacitás: " + osszKapacitas + ", Szabad kapacitás: " + osszSzabad);
        tarak[0].kiir();
    }
}