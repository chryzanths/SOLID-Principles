public class Journal implements Library{
    @Override
    public void borrow(String title) {
        System.out.println("Borrowing e-journal: " + title);
    }
}
