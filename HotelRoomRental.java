public class HotelRoomRental {
    private String id;
    private int numDays;

    public HotelRoomRental(String id, int numDays) {
        this.id = id;
        this.numDays = numDays;
    }

    public double calculateTransaction() {
        return 1500000 * numDays;
    }

    public double calculateDiscount() {
        int discountFactor = numDays / 10;
        double discountRate = Math.min(0.3, 0.05 * discountFactor); // Up to 30%
        return calculateTransaction() * discountRate;
    }
}
