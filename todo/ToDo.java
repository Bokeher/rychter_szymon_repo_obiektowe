import java.time.LocalDateTime;


class ToDo{
    private String title = "";
    private String content = "";
    private String author = "Anonymous";
    private LocalDateTime date;

    //constructor author unknown
    public ToDo(String title, String content){
        this.title = title;
        this.content = content;
        date = LocalDateTime.now();
    }

    //constructor author known
    public ToDo(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
        date = LocalDateTime.now();
    }

    public ToDo(String title, String content, String author, LocalDateTime date){
        this.title = title;
        this.content = content;
        this.author = author;
        this.date = date;
    }

    @Override
    public String toString(){
        return "Title: "+title+"\n"
            +"Content: "+content+"\n"
            +"Author: "+author+"\n"
            +"Data: "+date+"\n";
    }

    public String getContent(){
        return content;
    }

    public LocalDateTime getDate(){
        return date;
    }

    public String getTitle(){
        return title;
    }    

    public String getAuthor(){
        return author;
    }
}