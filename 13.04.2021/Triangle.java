class Triangle{
    public Triangle(int a){
        System.out.println(((a*a)*Math.sqrt(3))/4);
    }
    
    public Triangle(int a, int h){
        System.out.println((a*h)/2);
    }

    public Triangle(int a, int b, int gamma){
        System.out.println(0.5*a*b*Math.sin(gamma));
    }

    public Triangle(int a, int alfa, int beta, int gamma){
        System.out.println(0.5*(a*a)*((Math.sin(beta)*Math.sin(gamma))/Math.sin(alfa)));
    }

    // Nie mozna bo juz jest taki konstruktor
    // public Triangle(int a, int b, int c, int R){
    //     System.out.println((a*b*c)/(4*R));
    // }

    // public Triangle(int r, int p){
    //     System.out.println(r*p);
    // }

    // public Triangle(int R, int alfa, int beta, int gamma){
    //     System.out.println((2*(R*R))*Math.sin(alfa)*Math.sin(beta)*Math.sin(gamma));
    // }

    // public Triangle(int p, int a, int b, int c){
    //     System.out.println(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    // }
}