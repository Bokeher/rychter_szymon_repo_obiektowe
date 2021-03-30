class CwiczenieObiektowe_1{
    public static void main(String[] args){
        MojeDane md = new MojeDane("Szymon", "Rychter", "2PTN");
        System.out.println("Imie: "+md.imie+"\nNazwisko: "+md.nazwisko+"\nKlasa: "+md.klasa);

        Logowanie log = new Logowanie();
        System.out.println("\n"+log.toString());

        Kolo k1 = new Kolo(4);
        System.out.println("\nKola\nPole kola: "+k1.pole_kola()+"\nObwod kola: "+k1.obwod_kola());

        Kolo k2 = new Kolo(20);
        System.out.println("Pole 2 kola: "+k2.pole_kola()+"\nObwod 2 kola: "+k2.obwod_kola());

        Prostokat p = new Prostokat(2, 4);
        System.out.println("\nProstokat\nPole prostokatu: "+p.poleProstokata()+"\nObwod prostokatu: "+p.obwodProstokata());

        Kwadrat k = new Kwadrat(2);
        System.out.println("\nKwadrat\nPole kwadratu: "+k.poleKwadratu()+"\nObwod kwadratu: "+k.obwodKwadratu());
    }
}