public class AudioBook implements Library {
    @Override
    public void borrow(String title) {
        System.out.println("Borrowing audio book: " + title);
    }
}
