public class Comp {
    private Power power = new Power();
    private DVD dvd = new DVD();
    private HDD hdd = new HDD();

    public void copy() {
        power.on();
        dvd.load();
        hdd.copyFromDVD(dvd);
    }
}
