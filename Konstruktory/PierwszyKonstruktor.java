import java.util.Scanner;
import java.util.InputMismatchException;

class PierwszyKonstruktor{
    public static void main(String[] args){
        obliczanieBMI();
    }

    public static void obliczanieBMI(){
        
        int wzrost = 0;
        int waga = 0;

        boolean flag = true;
        while(flag){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print("Program oblicza BMI dla podanego wzrostu w cm i wagi w kg\n"
                + "0 - zakoncz\n"
                + "1 - oblicz\n"
                + "Wybor: ");
                int zakoncz = sc.nextInt();
                while(zakoncz != 0){
                    System.out.print("Podaj wzrost w cm: ");
                    wzrost = sc.nextInt();

                    System.out.print("Podaj wage w kg: ");
                    waga = sc.nextInt();

                    MojeBMI mb = new MojeBMI(wzrost, waga);
                    System.out.println("BMI = "+mb.mojeBMI());

                    System.out.println("Obliczyc ponownie BMI? \n0 - zakoncz\n Dowolna inna cyfra - oblicz ponownie");
                    zakoncz = sc.nextInt();
                }
                flag = false; 
            }catch(InputMismatchException e){
                System.out.println(e.toString());
                zakoncz = 0;
            } 
        }
    }

    private void testowanie(){
        // MojeBMI mb = new MojeBMI();
        // mb.wzrost = 160;
        // mb.waga = 80;

        MojeBMI mb = new MojeBMI(160, 86);
        double wynik = mb.mojeBMI();
        ImieNazwisko im = new ImieNazwisko("Szymon", "Rychter");

        im.powitanie();

        mb.setWaga(65);
        mb.setWzrost(178);
        System.out.println("BMI = "+mb.mojeBMI());
        // System.out.println(im.imie+" "+im.nazwisko);
        // System.out.println(wynik);
    }
}