package models;

import java.util.Objects;

public class Room extends Services {
    private String externalServices;

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            Room room = (Room) o;
            return this.externalServices.equals(room.externalServices);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), externalServices);
    }

    public Room() {
    }

    public Room(String id, String serviceName, double area, double rentalFee,
                int maxGuest, String rentalType, String externalServices) {
        super(id, serviceName, area, rentalFee, maxGuest, rentalType);
        this.externalServices = externalServices;
    }

    public String getExternalServices() {
        return externalServices;
    }

    public void setExternalServices(String externalServices) {
        this.externalServices = externalServices;
    }

    @Override
    public String showInfo() {
        return "Id: " + super.getId() + "\n" + "Service Name: " + super.getServiceName() + "\n" + "Area use: " + super.getArea() + "\n" + "Rental Fee: " + super.getRentalFee()
                + "\n" + "Max Guest: " + super.getMaxGuest() + "\n" + "Rental Type: " + super.getRentalType() + "\n" +
                "External Services: " + this.externalServices;
    }
}
