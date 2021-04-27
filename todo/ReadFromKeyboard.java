import java.util.Scanner;

class ReadFromKeyboard{
    public ToDo readOneToDo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj tytul: ");
        String title = sc.nextLine();
        System.out.println("Podaj tresc notatki: ");
        String content = sc.nextLine(); 
        System.out.println("Podaj autora lub nacisnij ETNER: ");
        String author = sc.nextLine(); 
        if(author.length()<1) return new ToDo(title, content);
        else return new ToDo(title, content, author); 
    }
}