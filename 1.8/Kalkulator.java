import java.util.Scanner;

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
                    String drawedFigure = "\n";
                    int area;
                    int perimeter;
                    if(chosenFigure.equals("1")){
                        System.out.print("Podaj dlugosc boku: ");
                        int length = sc.nextInt();
                        drawedFigure += drawFigure(length, length);
                        area = length*length;
                        perimeter = 4*length;
                    }else{
                        System.out.print("Podaj wysokosc boku: ");
                        int height = sc.nextInt();
                        System.out.print("Podaj szerokosc: ");
                        int width = sc.nextInt();
                        drawedFigure += drawFigure(width, height);
                        area = height*width;
                        perimeter = 2*(height+width);               
                    }
                    System.out.println(drawedFigure+"\nPole wynosi: "+area+"\nObwod wynosi: "+perimeter+"\n\n");
                }else a=0;
            }else a=0;
        }
    }

    public static String drawFigure(int x, int y){
        String figure = "";
        for(int i=0; i<y-1; i++){
            if(i==0) for(int j=0; j<x; j++) figure+="*";
            figure += "\n*";
            if(i<y-2)for(int j=0; j<x-2; j++) figure+=" ";
            if(i<y-2) figure += "*";
            else for(int j=0; j<x-1; j++) figure+="*";
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
        return sc.next();
    }
}