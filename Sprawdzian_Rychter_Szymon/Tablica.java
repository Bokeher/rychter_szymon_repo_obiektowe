import java.util.Random;

class Tablica{
    public int[] tab = new int[10];
    
    public Tablica(){
        Random r = new Random();
        for(int i=0; i<10; i++) tab[i] = r.nextInt(21)-10;
    }
}