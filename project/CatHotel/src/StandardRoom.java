package project.CatHotel.src;

public class StandardRoom extends CatBooking {
    private static final double PRICE_PER_DAY = 300;
    private String roomSize;

    public StandardRoom(String catName, String phone, int days, String roomSize) {
        super(catName, phone, days);
        this.roomSize = roomSize;
    }

    public String getRoomSize() {
        return roomSize;
    }

    @Override
    public double calculatePrice() {
        return PRICE_PER_DAY * days;
    }

    @Override
    protected String getRoomDetails() {
        return "Standard (" + roomSize + ")";
    }
}
