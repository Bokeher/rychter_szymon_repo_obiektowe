import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Zad2{
    public static void main(String []args){
        Random r = new Random();
        File f1 = new File("czylosowac.txt");
        File f2 = new File("ileliczb.txt");
        
        try{
            Scanner sc = new Scanner(f1);
            String tab[] = sc.nextLine().split(" ");
            
            Scanner sc2 = new Scanner(f2);
            String tab2[] = new String[tab.length];
            int i = 0;
            while(sc2.hasNext()){
                tab2[i] = sc2.nextLine();
                i++;
            }
            for(i=0; i<tab.length; i++){
                if(tab[i].equals("0")) System.out.print("Wczytalem liczbe 0 - nie losuje liczb");
                else for(int j=0; j<Integer.parseInt(tab2[i]); j++) System.out.print(r.nextInt(80)+1+" ");
                System.out.print("\n");
            }
        }catch(FileNotFoundException e){
            System.out.println(e.toString());
        }
    }
}