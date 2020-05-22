package models;

import java.util.Objects;

public class House extends Services {
    private String roomStandard;
    private String houseDescription;
    private int numberOfFloors;

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            House house = (House) o;
            return this.numberOfFloors == house.numberOfFloors &&
                    this.roomStandard.equals(house.roomStandard) &&
                    this.houseDescription.equals(house.houseDescription);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), roomStandard, houseDescription, numberOfFloors);
    }

    public House() {
    }

    public House(String id, String serviceName, double area, double rentalFee, int maxGuest,
                 String rentalType, String roomStandard, String houseDescription, int numberOfFloors) {
        super(id, serviceName, area, rentalFee, maxGuest, rentalType);
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
        return "Id: " + super.getId() + "\n" + "Service Name: " + super.getServiceName() + "\n" + "Area use: " + super.getArea() + "\n" + "Rental Fee: " + super.getRentalFee()
                + "\n" + "Max Guest: " + super.getMaxGuest() + "\n" + "Rental Type: " + super.getRentalType() + "\n" + "Room Standard: " +
                this.roomStandard + "\n" + "House Description: " + this.houseDescription + "\n" + "Number Of Floors: " + this.numberOfFloors;
    }
}
