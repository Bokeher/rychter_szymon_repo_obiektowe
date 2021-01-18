import java.util.Scanner;

class NumberOfCharacters{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Wprowadz tekst: ");
        String text = sc.nextLine();
        int length = text.length();

        System.out.print("Wprowadzony tekst ma "+length+" znakow");
    }
}