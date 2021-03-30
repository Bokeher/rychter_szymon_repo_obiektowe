class Samochody{
    public String model = "";
    public String marka = "";
    public String rodzajSilnika = "";
    public int pojemnosc = 0;
    public int moc = 0;
    public int mo_obrotowy = 0;

    @Override
    public String toString(){
        return "Samochod:\n"
        +"Marka: "+marka+"\n"
        +"Model: "+model+"\n"
        +"Rodzaj silnika: "+rodzajSilnika+"\n"
        +"Moc: "+moc+"\n"
        +"Moment obrotowy: "+mo_obrotowy+"\n"
        +"Pojemnosc: "+pojemnosc+"\n";
    }
}