public class DemoBookFactory implements BookFactory {
    public Book createBook(){
        return new ConcreteDemoBook();
    }
}
