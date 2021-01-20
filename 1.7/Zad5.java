import java.util.Scanner;

class Zad5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Podaj zdanie: ");
        String text = sc.nextLine();

        for(int i=0; i<text.length(); i++) System.out.println(text.substring(i, i+1));
    }
}