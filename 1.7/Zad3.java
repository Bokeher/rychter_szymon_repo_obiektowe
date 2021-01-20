import java.util.Scanner;

class Zad3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Podaj zdanie: ");
        String text = sc.nextLine();

        System.out.println("Tekst z duzymi literami: "+text.toUpperCase());
    }
}