public class LibraryApp {
    public static void main(String[] args) {
        Student student = new Student();
        Library book = new Book();
        Library journal = new Journal();
        Library audioBook = new AudioBook();

        student.borrowResource(book, "About Java");
        student.borrowResource(journal, "Nature");
        student.borrowResource(audioBook, "The Great Gatsby");
    }
}
