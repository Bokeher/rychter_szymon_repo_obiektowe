class Rekurencja{
    public static void main(String[] args){
        //rekurencja(5);
        //System.out.println(zwracamJedynke());
        //System.out.println(zwracamTekst());
        //System.out.println(zwracamPotegeWprowadzonejLiczby(5));
        System.out.println(sumaDwochNajwiekszycLiczb(5, 6, 3));
        System.out.println(sumaDwochNajwiekszycLiczb(7, 6, 9));
        System.out.println(sumaDwochNajwiekszycLiczb(5, 6, 6));
    }

    private static int sumaDwochNajwiekszychLiczb(int a, int b, int c){
        int suma = 0;

        if(a>b && b>c) suma = a+b;
        else if(a>b && c>b) suma = c+b;
        else if(b>a && c>a) suma = b+c;
        
        return suma;
    }

    private static int zwracamKwadratWprowadzonejLiczby(int liczba){
        return liczba*liczba;
    }

    private static int zwracamJedynke(){
        return 1;
    } 

    private static String zwracamNapis(){
        return "Zwracam String'a";
    } 

    private static int rekurencja(int i){
        if(i>0){
            System.out.println("rekurencja "+i);
            i--;
        }else return 0;
        
        rekurencja(i);
        return -1;
    }
}