class MojeBMI{
    private int wzrost = 0;
    private int waga = 0;

    public MojeBMI(int wzrost, int waga){
        this.wzrost = wzrost;
        this.waga = waga;
    }

    public double mojeBMI(){
        return waga / ((double) wzrost/100 * (double) wzrost/100);
    }

    public void setWzrost(int wzrost){
        this.wzrost = wzrost;
    }
    
    public void setWaga(int waga){
        this.waga = waga;
    }

    public int getWzrost(){
        return wzrost;
    }

    public int getWaga(){
        return waga;
    }
}