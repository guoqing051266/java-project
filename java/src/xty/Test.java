package xty;


public class Test {
    public static void main(String[] args) {
        Book book =new Book("java从入门到精通","明日科技", 60.00);
        System.out.println("书名："+book.getTitle());
        System.out.println(("作者："+book.getAuthor()));
        System.out.println("价格："+book.getePrice()+"元");
    }
}
