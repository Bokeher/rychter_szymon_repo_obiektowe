class RychterSzymon{
    public static void main(String [] args){
        Sprawdzian spr = new Sprawdzian();

        spr.data = "07.04.2021";
        spr.ocena = 6;
        spr.nazwa_przedmiotu = "PROGRAMOWANIE OBIEKTOWE";

        System.out.println("\n"+spr.data+"\n"+spr.ocena+"\n"+spr.nazwa_przedmiotu+"\n");

        //2 Obiekt test
        Dane d = new Dane("Szymon", "Rychter", "20.10.2004");
        System.out.println(d.toString()+"\n");

        Tablica tab1 = new Tablica();
        Tablica tab2 = new Tablica();

        for(int i=0; i<10; i++){
            if(tab1.tab[i] > tab2.tab[i]) System.out.println(tab1.tab[i]+" > "+tab2.tab[i]);
            else if(tab1.tab[i] < tab2.tab[i]) System.out.println(tab1.tab[i]+" < "+tab2.tab[i]);
            else System.out.println(tab1.tab[i]+" = "+tab2.tab[i]);
        }
    }
}