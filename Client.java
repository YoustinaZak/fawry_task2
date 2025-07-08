public class Client {
    public static void main(String[] args){
        System.out.print("Trial \n");
        BookStore library = new BookStore();

        BookFactory eBookFactory1 = new EBookFactory();
        Book ebook1 = eBookFactory1.createBook("Life of Pi","Mark","Dewan","B1");
        ((ConcreteEBook)ebook1).setPrice(50);
        ((ConcreteEBook)ebook1).setPublishYear(1900);
        ((ConcreteEBook)ebook1).setFileType("PDF");

        BookFactory pBookFactory1 = new PaperBookFactory();
        Book pBook1 = pBookFactory1.createBook("Titanic","Kate","Dewan","B2");
        ((ConcretePaperBook)pBook1).stock=1;
        ((ConcretePaperBook)pBook1).setPrice(60);
        ((ConcretePaperBook)pBook1).setPublishYear(2001);

        BookFactory dBookFactory1 = new DemoBookFactory();
        Book dbook1 = dBookFactory1.createBook("X","James","Unk","B3");

        library.addBook(ebook1);
        library.addBook(pBook1);
        library.addBook(dbook1);

        library.checkOutDated(50);

        library.buy("B2");
        library.buy("B2");
        library.buy("B1");
    }
}
