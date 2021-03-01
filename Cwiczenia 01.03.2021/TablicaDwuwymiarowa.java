class TablicaDwuwymiarowa{
    public static void main(String[] args){
        
    }

    private static void arr2dFirst(){
        int [][] arr2d = new int [5][2];
        arr2d[0][1] = 50;
        arr2d[2][1] = -200;
        arr2d[4][0] = 444;

        for(int i=0; i<arr2d.length; i++){
            for(int j=0; j<arr2d[i].length; j++) 
                System.out.print(arr2d[i][j]+" ");
            System.out.println("");
        } 
    }

    private static void przypomnienieTablicJednowymiarowych(){
        int [] arr = new int[5];
        arr[0] = 40;
        for(int i=0; i<arr.length; i++) System.out.println(arr[i]);
    }
} 