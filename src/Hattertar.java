public abstract class Hattertar {
    private String nev;
    private int kapacitas;
    private int szabad;

    public Hattertar() {
    }

    public Hattertar(String nev, int kapacitas, int szabad) {
        this.nev = nev;
        this.kapacitas = kapacitas;
        this.szabad = szabad;
    }
    //konstruktorok

    public void kiir() {
        System.out.println(nev + " kapacitása: " + kapacitas + " GB, szabad kapacitása: " + szabad + " GB, seek time: " + getRandomAccessTime() + " ms");
    }

    public void write(int helyIgeny) {
        this.szabad -= helyIgeny;
    }

    public abstract double getRandomAccessTime();


    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKapacitas() {
        return kapacitas;
    }

    public void setKapacitas(int kapacitas) {
        this.kapacitas = kapacitas;
    }

    public int getSzabad() {
        return szabad;
    }

    public void setSzabad(int szabad) {
        this.szabad = szabad;
    }

}


