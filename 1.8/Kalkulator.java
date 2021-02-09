import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Kalkulator{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 1;

        while(a == 1){
            String chosenFigure = showMenu();
            if(!chosenFigure.toLowerCase().equals("exit")){
                while(!chosenFigure.equals("1") && !chosenFigure.equals("2") && !chosenFigure.toLowerCase().equals("exit")){
                    System.out.println("\nWybrano niewlasciwa opcje");
                    chosenFigure = showMenu();
                    System.out.println();
                }
                if(!chosenFigure.toLowerCase().equals("exit")){
                    String drawnFigure = "";
                    int area;
                    int perimeter;

                    if(chosenFigure.equals("1")){
                        System.out.print("Podaj dlugosc boku: ");
                        int length = sc.nextInt();

                        drawnFigure = drawFigure(length, length);
                        area = length*length;
                        perimeter = 4*length;

                        try{
                            FileWriter squareFileWr = new FileWriter("kwadrat.txt", true);
                            squareFileWr.write(drawnFigure+"\n"+length+";"+area+";"+perimeter+"\n");
                            squareFileWr.close();
                        }catch(Exception e){
                            System.out.println(e.toString());
                        }
                    }else{
                        System.out.print("Podaj szerokosc: ");
                        int width = sc.nextInt();
                        System.out.print("Podaj wysokosc: ");
                        int height = sc.nextInt();

                        drawnFigure = drawFigure(width, height);
                        area = height*width;
                        perimeter = 2*(height+width);

                        try{
                            FileWriter rectangleFileWr = new FileWriter("prostokat.txt", true);   
                            rectangleFileWr.write(""+drawnFigure+"\n"+width+";"+height+";"+area+";"+perimeter+"\n");
                            rectangleFileWr.close();  
                        }catch(Exception e){
                            System.out.println(e.toString());
                        }
                    }
                    System.out.println("\n"+drawnFigure+"\n\nPole wynosi: "+area+"\nObwod wynosi: "+perimeter+"\n");
                }else a=0;
            }else a=0;
        }
    }

    public static String drawFigure(int x, int y){
        String figure = "";
        if(x==1 && y==1) return "*";
        else if(x<2 || y<2){
            for(int i=0; i<y; i++){
                for(int j=0; j<x; j++) figure += "*";
                figure+="\n";
            }
        }else{
            for(int i=0; i<y-1; i++){
                if(i==0) for(int j=0; j<x; j++) figure+="*";
                figure += "\n*";
                if(i<y-2){
                    for(int j=0; j<x-2; j++) figure+=" ";
                    figure += "*";
                }else for(int j=0; j<x-1; j++) figure+="*";
            }
        }
        return figure;
    }

    public static String showMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n-=-=-=-Menu-=-=-=-");
        System.out.println("1 - Kwadrat");
        System.out.println("2 - Prostokat");
        System.out.println("EXIT - Wyjscie");
        System.out.print("Wybor: ");
        String chosen = sc.next();
        System.out.println("-=-=-=-=-=-=-=-=-=");
        return chosen;
    }
}