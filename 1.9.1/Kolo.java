class Kolo{
    private double pi = 3.1415;
    private double radius = 0;

    public Kolo(double radius){
        this.radius = radius;
    }

    public double pole_kola(){
        return pi*Math.pow(radius, 2);
    }

    public double obwod_kola(){
        return 2*pi*radius;
    }
}