import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Zad1{
    public static void main(String []args){
        Random r = new Random();
        File f = new File("uczniowie.txt");
        
        try{
            Scanner sc = new Scanner(f);
            int ranGrade[] = new int[10];
            String data[] = new String[10];

            int i=0;
            while(sc.hasNext()){
                String line = sc.nextLine();
                data[i] = line;
                i++;
            }

            for(i=0; i<10; i++){
                ranGrade[i] = r.nextInt(6)+1;
                System.out.println(data[i]+" "+ranGrade[i]);
            }
        }catch(FileNotFoundException e){
            System.out.println(e.toString());
        }
    }
}