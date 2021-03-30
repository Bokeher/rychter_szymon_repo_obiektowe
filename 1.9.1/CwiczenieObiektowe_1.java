class CwiczenieObiektowe_1{
    public static void main(String[] args){
        MojeDane md = new MojeDane("Szymon", "Rychter", "2PTN");
        System.out.println("Imie: "+md.imie+"\nNazwisko: "+md.nazwisko+"\nKlasa: "+md.klasa);

        Logowanie log = new Logowanie();
        System.out.println("\n"+log.toString());

        Kolo k1 = new Kolo();
        k1.setRadius(4);
        System.out.println("Pole: "+k1.pole_kola()+"\nObwod: "+k1.obwod_kola());

        Kolo k2 = new Kolo();
        k2.setRadius(20);
        System.out.println("Pole: "+k2.pole_kola()+"\nObwod: "+k2.obwod_kola());
    }
}