import java.util.Scanner;

class Password{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        final String password = "haslo123";

        System.out.print("Wprowadz haslo: ");
        String enteredPassword = sc.next();

        if(enteredPassword.equals(password)) System.out.println("Wprowadzono prawidlowe haslo");
        else System.out.println("Wprowadzono nieprawidlowe haslo");
    }
}