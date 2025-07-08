public class Client {
    public static void main(String[] args){
        System.out.print("Trial");
        BookFactory eBookFactory1 = new EBookFactory();
        Book ebook1 = eBookFactory1.createBook("Life of Pi","Mark","Dewan","B1");
    }
}
