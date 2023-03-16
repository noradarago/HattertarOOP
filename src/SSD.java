public class SSD extends Hattertar {
    protected int irasSzam;

    public SSD() {
    }

    public SSD(int irasSzam) {
        this.irasSzam = irasSzam;
    }

    public SSD(String nev, int kapacitas, int szabad, int irasSzam) {
        super(nev, kapacitas, szabad);
        this.irasSzam = irasSzam;
    }

    @Override
    public double getRandomAccessTime() {
        if (irasSzam > 0) {
            return 0.1;
        } else {
            return -1;
        }
    }

    @Override
    public void write(int helyIgeny) {
        super.write(helyIgeny);
        irasSzam--;
    }

    @Override
    public void kiir() {
        super.kiir();
        System.out.println(irasSzam + " alkalommal írható még");

    }

    public int getIrasSzam() {
        return irasSzam;
    }

    public void setIrasSzam(int irasSzam) {
        this.irasSzam = irasSzam;
    }
}
