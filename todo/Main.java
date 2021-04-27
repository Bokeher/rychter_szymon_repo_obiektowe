class Main{
    public static void main(String[] args){
        testSaveToFile();
    }

    private static void testSaveToFile(){
        FileUtils fu = new FileUtils();
        fu.saveToFile(new ToDo("Pierwszy zapis", "Tresc tego"));
        fu.readFromFile();
    }

    private static void testReadFromKeyboard(){
        ReadFromKeyboard rfk = new ReadFromKeyboard();
        ToDo td = rfk.readOneToDo();
        System.out.println(td);
    }

    private static void test(){
        ToDo td1 = new ToDo("Pierwsza", "To jest pierwsza notatka");
        ToDo td2 = new ToDo("Druga", "To jest druga notatka z autorem", "adams");
    
        System.out.println(td1);
        System.out.println(td2);
    }
}