class PierwszyObiekt{
    public static void main(String[]args){
        ObiektPudelko op = new ObiektPudelko();
        System.out.println("Domyslna wartosc: "+op.wysokosc);

        op.wysokosc = 100;
        System.out.println("Wartosc po zmianie: "+op.wysokosc);

        Osoba os = new Osoba();
        System.out.println("Imie: "+os.imie+"\nNazwisko: "+os.nazwisko);
    }
}