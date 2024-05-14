public class EJournal implements Library{
    @Override
    public void borrow(String title) {
        System.out.println("Borrowing e-journal: " + title);
    }
}
