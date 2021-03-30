class Prostokat{
    private double a = 0;
    private double b = 0;

    public Prostokat(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double poleProstokata(){
        return a*b;
    }

    public double obwodProstokata(){
        return 2*(a+b);
    }
}

