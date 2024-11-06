//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Book b=new Book("نظرية الفستق",16.99,"فهد عامر الأحمدي");
        System.out.println("The name book :"+b.getName());
        System.out.println("The Price book :"+b.getPrice());
        System.out.println("The Author :"+b.getAuthor());
        System.out.println("Price after 10% discount :"+ b.getDiscount(10));
        System.out.println("-----------------");




        Movie m=new Movie("ساق البامبو",14.99,"سعود السنعوسي");
        System.out.println("The name book :"+m.getName());
        System.out.println("The Price book :"+m.getPrice());
        System.out.println("The Author :"+m.getDirectot());
        System.out.println("Price after 10% discount :"+ m.getDiscount(10));

    }
}