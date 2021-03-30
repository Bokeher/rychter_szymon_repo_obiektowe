class Main{

    static Samochody samochody, samochody1, s3;
    static Klient klient;

    public static void main(String[] args){
        init();
        //System.out.println("1 \n"+samochody.toString()+"\n2 \n"+samochody1.toString());
        
    }

    private static void init(){
        klient = new Klient();
        klient.nr_klienta = 10;

        samochody = new Samochody();
        samochody.marka = "Ford";
        samochody.model = "S-Max";
        samochody.rodzajSilnika = "Diesel";
        samochody.moc = 150;
        samochody.mo_obrotowy = 246;
        samochody.pojemnosc = 1980;

        samochody1 = new Samochody();
        samochody1.marka = "Audi";
        samochody1.model = "Q5";
        samochody1.rodzajSilnika = "Diesel";
        samochody1.moc = 190;
        samochody1.mo_obrotowy = 320;
        samochody1.pojemnosc = 1980;

        s3 = new Samochody();
    }
}