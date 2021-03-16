class DaneOsobowe{
    private String pesel = "12345678901";
    public int wiek = 20;
    public int wzrost = 177;
    public int waga = 88;
    
    public String miejsowosc = "Nowa Sol";
    public String ulica = "Bezludna";
    public int nrDomu = 3;
    public String kodPocztowy = "67-100";

    public double myBmi(){
        System.out.println("Pesel: "+pesel);
        return waga/((double)wzrost/100 * (double)wzrost/100);
    }

    public String adres(){
        return miejsowosc+" "+ulica+" "+nrDomu+" "+kodPocztowy;
    }
}