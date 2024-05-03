public class CarRental {
    private String id;
    private int numDays;

    public CarRental(String id, int numDays) {
        this.id = id;
        this.numDays = numDays;
    }

    public double calculateTransaction() {
        return 500000 * numDays;
    }

    public double calculateDiscount() {
        if (numDays >= 3 && numDays <= 7) {
            return calculateTransaction() * 0.15; // 15% discount
        }
        return 0;
    }
}
