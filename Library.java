import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void addbook(Book book){
        books.add(book);
    }

    public void removebook(String title){
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getTittle().equals(title)){
                books.remove(i);
                break;
            }
        }
    }

    public ArrayList<Book> findBookByAuthor(String author){
        ArrayList<Book> authorB = new ArrayList<>();
        for (Book book : books){
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())){
                authorB.add(book);
            }
            System.out.println("Книги Автора" + authorB);
        }
        return authorB;
    }
    public void printAllBooks(){
        if (books.isEmpty()){
            System.out.println("Библиотека пуста");
        }
        else{
            System.out.println("Следующие книги в наличии");
            for (Book book : books){
                System.out.println(book);
            }
        }
    }
}

