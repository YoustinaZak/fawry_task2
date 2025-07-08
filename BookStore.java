import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {
    ArrayList <Book> inventory = new ArrayList<>();
    public void addBook(Book b){
        inventory.add(b);
    }
    public Book checkOutDated(int years){
        for (Book n: inventory){
            if(n instanceof ConcreteEBook){
                if(2025-((ConcreteEBook)n).publishYear>years){
                    System.out.println(n.title+" is removed \n");
                inventory.remove(n);
                return n;
            }
        }
            else if(n instanceof ConcretePaperBook){
                if(2025-((ConcretePaperBook)n).publishYear>years){
                    System.out.println(n.title+" is removed \n");
                    inventory.remove(n);
                    return n;
            }
        }
        }
        return null;
    }
    public Book buy(String ISBN){
        for (Book n: inventory){
            
            if(n instanceof ConcreteEBook){
                if((n.ISBN).equals(ISBN)){
                System.out.println("Price is:"+((ConcreteEBook)n).price+"\n");
                System.out.println("Enter Shipping Email: ");
                Scanner scanner = new Scanner(System.in);
                String email = scanner.nextLine();
                ((ConcreteEBook)n).sendTo(email);
                scanner.close(); 
                return n;
            }
        }
            else if(n instanceof ConcretePaperBook){
                if((n.ISBN).equals(ISBN) && (((ConcretePaperBook)n).stock>0)){
                System.out.println("Price is:"+((ConcretePaperBook)n).price+"\n");
                System.out.println("Enter Shipping Address: ");
                Scanner scanner = new Scanner(System.in);
                String address = scanner.nextLine();
                ((ConcretePaperBook)n).shipTo(address);
                ((ConcretePaperBook)n).stock -=1;
                scanner.close(); 
                return n;
            }
            else{
                System.out.println("Book is out of stock \n");
            }
        }
            else if (n instanceof ConcreteDemoBook){
                if((n.ISBN).equals(ISBN)){
                    System.out.println("Book is still Demo \n");
                }
            }
        }
        return null;
    }
}
