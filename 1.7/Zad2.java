import java.util.Scanner;

class Zad2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Podaj imie: ");
        String frstName = sc.next();
        System.out.print("Podaj nazwisko: ");
        String lstName = sc.next();

        System.out.println("Imie ma: "+frstName.length()+" a Nazwisko ma: "+lstName.length()+" znakow");
    }
}