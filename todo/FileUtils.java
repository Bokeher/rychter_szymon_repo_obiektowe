import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

class FileUtils{
    /*
    * Save ToDo to filename alltodo.csv like:
    * title;content;author;date
    * @param ToDo - out note
    * */
    public void saveToFile(ToDo td){
        try{
            File f = new File("alltodo.csv");
            FileWriter fw = new FileWriter(f, true);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
            fw.write(td.getTitle()+";"+td.getContent()+";"+td.getAuthor()+";"+dtf.format(td.getDate())+"\n");
            fw.close();
        } catch(IOException e){
            System.out.println(e.toString());
        }
    }

    public ArrayList<ToDo> readFromFile(){
        ArrayList<ToDo> list = new ArrayList<>();
        try{
            File f = new File("alltodo.csv");
            Scanner sc = new Scanner(f);
            while(sc.hasNext()) {
                String temp = sc.nextLine();
                String []ttemp = temp.split(";");
                ToDo td = new ToDo(ttemp[0], ttemp[1], ttemp[2], LocalDateTime.parse(ttemp[3]));
            }
        }catch(FileNotFoundException e){
            System.out.println(e.toString());
        }
        return list;
    }
}