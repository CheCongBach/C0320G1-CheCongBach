package models;

public class Villa extends Services {
    private String roomStandard;
    private String villaDescription;
    private int numberOfFloors;
    private double poolArea;

    public Villa() {
    }

    public Villa(String serviceName, double area, double rentalFee, int maxGuest, String rentalType,
                 String roomStandard, String villaDescription, int numberOfFloors, double poolArea) {
        super(serviceName, area, rentalFee, maxGuest, rentalType);
        this.roomStandard = roomStandard;
        this.villaDescription = villaDescription;
        this.numberOfFloors = numberOfFloors;
        this.poolArea = poolArea;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getVillaDescription() {
        return villaDescription;
    }

    public void setVillaDescription(String villaDescription) {
        this.villaDescription = villaDescription;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public String showInfo() {
        return  "Service Name: " + super.getServiceName() + "\n" + "Area use: " + super.getArea() + "\n" + "Rental Fee: " + super.getRentalFee()
                + "\n" + "Max Guest: " + super.getMaxGuest() + "\n" + "Rental Type: " + super.getRentalType() + "\n" + "Room standard: " + this.roomStandard
                + "\n" + "Villa Description: " + this.villaDescription + "\n" + "Number Of Floors: " + this.numberOfFloors + "\n" +
                "Pool Area: " + this.poolArea;
    }
}
