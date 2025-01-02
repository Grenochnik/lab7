public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
         Book book1 = new Book("Собачье сердце","Булгаков",1925);
         Book book2 = new Book("Идиот","Достоевский",1867);
         Book book3 = new Book("Преступление и наказание","Достоевский",1865);
         Book book4 = new Book("Война и мир","",1863);
         lib.addbook(book1);
         lib.addbook(book2);
         lib.addbook(book3);
         lib.addbook(book4);

         lib.printAllBooks();

         lib.findBookByAuthor("Достоевский");

         lib.removebook("Война и мир");

         lib.printAllBooks();
    }
}