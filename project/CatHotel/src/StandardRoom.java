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
        switch (roomSize) {
            case "S":
                return 300 * days;
            case "M":
                return 400 * days;
            case "L":
                return 450 * days;
            default:
                throw new IllegalArgumentException("Invalid room size.");
        }
    }

    @Override
    protected String getRoomDetails() {
        return "Standard (" + roomSize + ")";
    }
}
