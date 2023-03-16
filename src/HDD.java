public class HDD extends Hattertar {
    protected int rpm;

    public HDD() {
    }

    public HDD(String nev, int kapacitas, int szabad, int rpm) {
        super(nev, kapacitas, szabad);
        this.rpm = rpm;
    }

    @Override
    public void kiir() {
        super.kiir();
        System.out.println("rpm: " + rpm);
    }

    @Override
    public double getRandomAccessTime() {
        return (5 + (6000 / (double) rpm / 2));
    }

}
