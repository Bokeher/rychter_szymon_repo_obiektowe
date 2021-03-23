class ImieNazwisko{
    public String imie = "";
    public String nazwisko = "";

    public ImieNazwisko(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void powitanie(){
        System.out.println("Witaj "+imie+" "+nazwisko);
    }
}