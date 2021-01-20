import java.util.Scanner;

class BMI{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj imie: ");
        String frstName = sc.next();
        System.out.print("Podaj nazwisko: ");
        String lstName = sc.next();
        System.out.print("Podaj wiek: ");
        int age = sc.nextInt();
        System.out.print("Podaj wage [kg]: ");
        int weight = sc.nextInt();
        System.out.print("Podaj wzrost [cm]: ");
        int height = sc.nextInt();
        
        String state = "";
        height /= 100;
        float bmi = weight /(float)(height*height);
        bmi = Math.round(bmi*100)/100;

        if(bmi<16) state = "wyglodzenie";
        else if(bmi<16.99) state = "wychudzenie";
        else if(bmi<18.49) state = "niedowage";
        else if(bmi<24.99) state = "pozadana mase ciala";
        else if(bmi<29.99) state = "nadwage";
        else if(bmi<34.99) state = "otylosc I stopnia";
        else if(bmi<39.99) state = "otylosc II stopnia (duza)";
        else state = "otylosc III stopnia (chorobliwa)";

        System.out.println("Twoje BMI wynosi: "+bmi+" i oznacza "+state);
    }
}