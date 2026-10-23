public class Book {
    //data
    String title;
    String author;
    int pages;
    //constructor
    Book(String bTitle, String bAuthor, int bPages )
    {
        title = bTitle; author = bAuthor; pages = bPages;
    }

    //method
    void describe(){
        System.out.println(title + " :  "   +  author + "  " + pages );
    }

}
