import java.util.Scanner;

class BMI{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // int [][] bmiBasedOnAge = {
        //     {20, 25, 30, 40};
        //     {21, 26, 31, 41};
        //     {22, 27, 32, 42};
        //     {23, 28, 33, 43};
        //     {24, 29, 34, 44};
        //     {25, 30, 35, 45};
        // }

        System.out.print("Podaj imie: ");
        String frstName = sc.next();
        System.out.print("Podaj nazwisko: ");
        String lstName = sc.next();
        System.out.print("Podaj wiek: ");
        int age = sc.nextInt();
        System.out.print("Podaj wage: ");
        float weigth = sc.nextFloat();
        System.out.print("Podaj wzrost: ");
        float heigth = sc.nextFloat();
        

    }
}