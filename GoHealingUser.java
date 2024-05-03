import java.util.ArrayList;

public class GoHealingUser {
    private String username;
    private ArrayList<Object> orderList = new ArrayList<>(); // Generic object, replace with specific order type

    public GoHealingUser(String username) {
        this.username = username;
    }

    public void goHealingOrder(String order) {
        System.out.println("Placing order: " + order);
    }

    public void addOrder(Object order) {
        orderList.add(order);
    }

    public void removeOrder(int index) {
        if (index >= 0 && index < orderList.size()) {
            orderList.remove(index);
        }
    }

    public ArrayList<Object> getOrderList() {
        return new ArrayList<>(orderList);
    }

    public double calculateAllTransactions() {
        double total = 0;
        for (Object order : orderList) {
            if (order instanceof PlaneTicket) {
                total += ((PlaneTicket) order).calculateTransaction() - ((PlaneTicket) order).calculateDiscount();
            } else if (order instanceof TrainTicket) {
                total += ((TrainTicket) order).calculateTransaction() - ((TrainTicket) order).calculateDiscount();
            } else if (order instanceof HotelRoomRental) {
                total += ((HotelRoomRental) order).calculateTransaction() - ((HotelRoomRental) order).calculateDiscount();
            } else if (order instanceof CarRental) {
                total += ((CarRental) order).calculateTransaction() - ((CarRental) order).calculateDiscount();
            }
        }
        return total;
    }
}
