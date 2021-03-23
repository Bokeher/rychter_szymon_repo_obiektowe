class PierwszyKonstruktor{
    public static void main(String[] args){
        // MojeBMI mb = new MojeBMI();
        // mb.wzrost = 160;
        // mb.waga = 80;

        MojeBMI mb = new MojeBMI(160, 86);
        double wynik = mb.mojeBMI();
        ImieNazwisko im = new ImieNazwisko("Szymon", "Rychter");

        im.powitanie();

        // System.out.println(im.imie+" "+im.nazwisko);
        // System.out.println(wynik);
    }
}