class Osoba {
    private String imie = "Joe";
    private String nazwisko = "Hoe";
    private int waga = 0;
    private int wzrost = 0;

    //Nie znamy imienia, nazwiska   Konstruktor1
    public Osoba(int wzrost, int waga){
        this.wzrost = wzrost;
        this.waga = waga;
    }


    //Nie znamy wzrostu, wagi     Konstruktor2
    public Osoba(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Osoba(String imie, String nazwisko, int wzrost, int waga){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wzrost = wzrost;
        this.waga = waga;
    }

    @Override
    public String toString(){
        return imie+" "+nazwisko+" \n"+waga+"kg \n"+wzrost+"cm ";
    }
}