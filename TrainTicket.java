public class TrainTicket {
    private String id;
    private double distance;

    public TrainTicket(String id, double distance) {
        this.id = id;
        this.distance = distance;
    }

    public double calculateTransaction() {
        return 750 * distance;
    }

    public double calculateDiscount() {
        if (distance < 100) {
            return calculateTransaction() * 0.1; // 10% discount
        }
        return 0;
    }
}
