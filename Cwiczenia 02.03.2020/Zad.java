class Zad{
    public static void main(String[]args){
        array2x2();
    }

    private static void array2x2(){
        int [][] arr2x2 = new int [2][2];
        arr2x2[0][0] = 1;
        arr2x2[0][1] = 2;
        arr2x2[1][0] = 3;
        arr2x2[1][1] = 4;

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.println(arr2x2[i][j]);
            }
        }
        
        //System.out.println(arr2x2[0][0]+"\n"+arr2x2[0][1]+"\n"+arr2x2[1][0]+"\n"+arr2x2[1][1]);
    }
}