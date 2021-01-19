import java.util.Scanner;

class Kalkulataor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj pierwsza liczbe: ");
        int frst = sc.nextInt();
        System.out.print("Podaj druga liczbe: ");
        int scnd = sc.nextInt();
        System.out.print("Podaj znak dzialania [+, -, *, /]: ");
        String sign = sc.next();

        if(sign.equals("+")) System.out.println(frst+sign+scnd+"="+(frst+scnd));
        else if(sign.equals("-")) System.out.println(frst+sign+scnd+"="+(frst-scnd));
        else if(sign.equals("*")) System.out.println(frst+sign+scnd+"="+(frst*scnd));
        else if(sign.equals("/")) {
            if(scnd == 0) System.out.println("Nie wolno dzielic przez zero!");
            else System.out.println(frst+sign+scnd+"="+(frst/scnd));
        }
    }
}