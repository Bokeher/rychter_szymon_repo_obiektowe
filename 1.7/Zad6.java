import java.util.Scanner;
import java.util.Random;

class Zad6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Podaj dlugosc hasla: ");
        int len = sc.nextInt();

        System.out.println("Wybierz z czego ma sie skladac haslo [domyslnie same litery]: ");
        System.out.println("1 - same litery");
        System.out.println("2 - litery i liczby");
        System.out.println("3 - litery, liczby i znaki specjalne");
        System.out.print("Wybor: ");
        int type = sc.nextInt();

        String typeOfCharacters = "abcdefghijklmnopqrstuvwxyz";
        if(type == 2){
            typeOfCharacters += "1234567890";
        }else if(type == 3){
            typeOfCharacters += "!@#$%^&*()";
        }

        String password = ""; 
        for(int i=0; i<len; i++){
            int randNumb = rand.nextInt(typeOfCharacters.length());
            password += typeOfCharacters.substring(randNumb, randNumb+1);
        }
        
        System.out.println(password);
    }
}