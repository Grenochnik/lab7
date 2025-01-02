public class Book {
    private String tittle;
    private String author;
    private int year;

    //Блок Геттеров
    public String getTittle(){
        return tittle;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    //Блок сеттеров
    public void setTittle(String newtittle){
        tittle = newtittle;
    }

    public void setAuthor(String newauthor) {
        author = newauthor;
    }

    public void setYear(int newyear) {
        year = newyear;
    }
    // Конструктор класса
    public Book(String tittle, String author, int year){
        this.tittle = tittle;
        this.author = author;
        this.year = year;
    }

    public String toString(){
        return "Название " + tittle + ". Автор " + author + ". Год написания " + year;
    }
}
