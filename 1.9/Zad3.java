import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Zad3{
    public static void main(String []args){
        File f = new File("1.9_dane.txt");
        
        try{
            Scanner sc = new Scanner(f);

            String data[] = new String[16];

            int i = 0;
            while(sc.hasNext()){
                data[i] = sc.nextLine();
                i++;
            }

            for(i=0; i<data.length; i++){
                while(data[i].contains("\t") == false){
                    data[i].replaceAll("\t", " ");
                } 
            }

            System.out.println(data[0]+"\n");
        }catch(FileNotFoundException e){
            System.out.println(e.toString());
        }
        
    }
}