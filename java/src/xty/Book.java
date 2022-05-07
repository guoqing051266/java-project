package xty;

public class Book {
    private String title;
    private String author;
    private double price;
    public Book(String title1, String author1, double price1){
        this.title=title1;
        this.author=author1;
        this.price=price1;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
        }
    public double getePrice(){
        return price;
    }
    public Book getBook(){
        return this;
    }
    private String name2;
    public String getName(){
        int id=0;
        //setName("Java");
        return id+this.name2;
    }
    private void setName(String name1){
        this.name2=name1;
    }
    public static void main(String[] args) {
        Book a=new Book("authorr", "authorr", 123);
        System.out.println(a.title +" "+a.author+" "+a.price  );
        System.out.println(a.getTitle()+" "+a.getAuthor()+" "+a.getePrice());
        System.out.println(a.getBook().getAuthor());
        a.setName("ronaldo");
        System.out.println(a.getName());

    }
}

