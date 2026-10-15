package project.CatHotel.src;

public class VipRoom extends CatBooking {
    private static final double PRICE_PER_DAY = 500;
    private String specialCare;

    public VipRoom(String catName, String phone, int days, String specialCare) {
        super(catName, phone, days);
        this.specialCare = specialCare;
    }

    public String getSpecialCare() {
        return specialCare;
    }

    @Override
    public double calculatePrice() {
        return PRICE_PER_DAY * days;
    }

    @Override
    protected String getRoomDetails() {
        if (specialCare == null || specialCare.equals("-")) {
            return "VIP";
        }
        return "VIP (" + specialCare + ")";
    }
}
