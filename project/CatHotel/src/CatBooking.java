package project.CatHotel.src;

public abstract class CatBooking implements Bookable {
    protected String catName;
    protected String phone;
    protected int days;

    public CatBooking(String catName, String phone, int days) {
        this.catName = catName;
        this.phone = phone;
        this.days = days;
    }

    public String getCatName() {
        return catName;
    }

    public String getPhone() {
        return phone;
    }

    // final: subclasses cannot override it
    @Override
    public final String getSummary() {
        return catName + " | " + getRoomDetails() + " | " + days + " days | "
                + String.format("%.0f", calculatePrice());
    }

    @Override
    public abstract double calculatePrice();

    protected abstract String getRoomDetails();
}
