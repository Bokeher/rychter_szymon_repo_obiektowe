class Rekurencja2{
    public static void main(String[] args){
        // int liczba = sumaKolejnychLiczb(5);
        // System.out.println("Wynik: "+liczba);
        // long liczba = obliczanieSilni(5);
        // System.out.println("Silnia: "+liczba);
        String wyraz = wyswietlanieWyrazu("Anna");
    }

    private static int sumaKolejnychLiczb(int liczba){
        if(liczba>0) return liczba+sumaKolejnychLiczb(liczba-1);
        return 0;
    }

    private static int obliczanieSilni(int liczba){
        if(liczba>1) return liczba*obliczanieSilni(liczba-1);
        return 1;
    }

    private static String wyswietlanieWyrazu(String wyraz){
        int len = wyraz.length();
        if(len>1){
            System.out.println(wyraz);
            return wyswietlanieWyrazu(wyraz.substring(0, len-1));
        }
        return ""; 
    }
}