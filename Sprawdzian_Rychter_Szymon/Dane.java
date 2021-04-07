class Dane{
    private String imie = "";
    private String nazwisko = "";
    private String data_urodzenia = "";

    public Dane(String imie, String nazwisko, String data_urodzenia){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_urodzenia = data_urodzenia;
    }

    @Override
    public String toString(){
        return imie+" "+nazwisko+" urodzony "+data_urodzenia;
    }
}