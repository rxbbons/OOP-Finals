public class PlaneTicket {
    private String id;
    private double distance;

    public PlaneTicket(String id, double distance) {
        this.id = id;
        this.distance = distance;
    }

    public double calculateTransaction() {
        return 4000 * distance;
    }

    public double calculateDiscount() {
        return 0; // No discount for plane tickets
    }
}
