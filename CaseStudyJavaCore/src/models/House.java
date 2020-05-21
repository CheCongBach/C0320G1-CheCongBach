package models;

public class House extends Services {
    private String roomStandard;
    private String houseDescription;
    private int numberOfFloors;

    public House() {
    }

    public House(String serviceName, double area, double rentalFee, int maxGuest,
                 String rentalType, String roomStandard, String houseDescription, int numberOfFloors) {
        super(serviceName, area, rentalFee, maxGuest, rentalType);
        this.roomStandard = roomStandard;
        this.houseDescription = houseDescription;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getHouseDescription() {
        return houseDescription;
    }

    public void setHouseDescription(String houseDescription) {
        this.houseDescription = houseDescription;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String showInfo() {
        return "Service Name: " + super.getServiceName() + "\n" + "Area use: " + super.getArea() + "\n" + "Rental Fee: " + super.getRentalFee()
                + "\n" + "Max Guest: " + super.getMaxGuest() + "\n" + "Rental Type: " + super.getRentalType() + "\n" + "Room Standard: " +
                this.roomStandard + "\n" + "House Description: " + this.houseDescription + "\n" + "Number Of Floors: " + this.numberOfFloors;
    }
}
