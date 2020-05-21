package models;

public class Room extends Services {
    private String externalServices;

    public Room() {
    }

    public Room(String serviceName, double area, double rentalFee,
                int maxGuest, String rentalType, String externalServices) {
        super(serviceName, area, rentalFee, maxGuest, rentalType);
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
        return "Service Name: " + super.getServiceName() + "\n" + "Area use: " + super.getArea() + "\n" + "Rental Fee: " + super.getRentalFee()
                + "\n" + "Max Guest: " + super.getMaxGuest() + "\n" + "Rental Type: " + super.getRentalType() + "\n" +
                "External Services: " + this.externalServices;
    }
}
