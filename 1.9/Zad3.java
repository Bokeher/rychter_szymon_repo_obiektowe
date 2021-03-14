import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Zad3{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int state = 1;
        while(state == 1){
            int choice = 0;
            while(choice < 1 || choice > 5) choice = menu();
            
            File f = new File("1.9_dane.txt");
            
            try{
                Scanner scf = new Scanner(f);
                String tempData[] = new String[16];

                int i = 0;
                while(scf.hasNext()){
                    tempData[i] = scf.nextLine().replaceAll("\\s", " ").replaceAll(",", "");
                    i++;
                }

                String data[][] = new String[16][];
                for(i=0; i<tempData.length; i++) data[i] = tempData[i].split(" ");

                switch(choice){
                    case 1:
                        for(i=0; i<tempData.length; i++) for(i=0; i<tempData.length; i++) System.out.println(tempData[i]);
                        break;
                    case 2:
                        String wojewodztwa = "";
                        for(i=0; i<16; i++){
                            wojewodztwa += (i+1)+" - "+data[i][0].toLowerCase();
                            if(i<15) wojewodztwa += ", ";
                        }

                        System.out.print("Wybierz wojewodztwo 1-16 ["+wojewodztwa+"]\nWybor: ");
                        int woj = sc.nextInt();

                        for(i=0; i<12; i++) System.out.print(data[woj-1][i]+" ");
                        break;
                    case 3:
                        System.out.println("-=-=--=-=- 2009r. -=-=--=-=-");
                        for(i=0; i<16; i++) System.out.println(data[i][0]+": "+data[i][3]+" ");

                        System.out.println("\n-=-=--=-=- 2010r. -=-=--=-=-");
                        for(i=0; i<16; i++) System.out.println(data[i][0]+": "+data[i][4]+" ");
                        break;
                    case 4:
                        System.out.println("-=-=--=-=- 2009r. -=-=--=-=-");
                        for(i=0; i<16; i++) System.out.println(data[i][0]+": "+data[i][5]+" ");

                        System.out.println("\n-=-=--=-=- 2010r. -=-=--=-=-");
                        for(i=0; i<16; i++) System.out.println(data[i][0]+": "+data[i][6]+" ");
                        break;
                    case 5:
                        state = 0;
                        break;
                }
            }catch(FileNotFoundException e){
                System.out.println(e.toString());
            }
        }
    }

    private static int menu(){
        Scanner sc = new Scanner(System.in);
        String menu[] = {
            "\n-=-=--=-=- Menu -=-=--=-=-\n",
            "1 - pokaz wszystkie dane\n",
            "2 - pokaz dane z jednego wojewodztwa\n",
            "3 - pokaz wartosc [w zl] jelenia w roku 2009 i 2010 we wszystkich wojewodztwach\n",
            "4 - pokaz ilosc sarn w roku 2009 i 2010 we wszystkich wojewodztwach [+]\n",
            "5 - zakoncz program\n",
            "Wybor: "
        };

        for(int i=0; i<7; i++) System.out.print(menu[i]);
        return sc.nextInt();
    }
}