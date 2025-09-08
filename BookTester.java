public class BookTester {
    public static void main(String[] args) {
        Book myBook = new Book("The Lord of the Rings", 1954, 25.50);
        myBook.print();
        
        System.out.println("\n--- Updating book details ---");
        myBook.setPrice(30.00);
        myBook.setYear(1965);
        myBook.print();
    }
    
}
