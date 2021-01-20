import java.util.Scanner;

class Zad4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Podaj slowo: ");
        String text = sc.next();

        System.out.println("Pierwsza litera podanego slowa: "+text.substring(0, 1));
        System.out.println("Ostatnia litera podanego slowa: "+text.substring(text.length()-1));
    }
}