class Zad1{
    public static void main(String[] args){
        String[] square = {
            "  *****  ",
            "  *   *  ",
            "  *   *  ",
            "  *   *  ",
            "  *****  "
        };
        printFigure(square);

        String[] circle = {
            "   ***   ",
            "  *   *  ",
            " *     * ",
            "  *   *  ",
            "   ***   ",
        };
        printFigure(circle);

        String[] triangle = {
            "    *    ",
            "   * *   ",
            "  *   *  ",
            " *     * ",
            "*********",
        };

        printFigure(triangle);
    }
    public static void printFigure(String[]tab){
        for(int i=0; i<tab.length; i++) System.out.println(tab[i]);
        System.out.println("");
    }
}