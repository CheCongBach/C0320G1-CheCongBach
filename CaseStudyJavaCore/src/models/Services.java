package models;

import java.util.Objects;

public abstract class Services {
    private String id;
    private String serviceName;
    private double area;
    private double rentalFee;
    private int maxGuest;
    private String rentalType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Services services = (Services) o;
        return Double.compare(services.area, this.area) == 0 &&
                Double.compare(services.rentalFee, this.rentalFee) == 0 &&
                this.maxGuest == services.maxGuest &&
                this.id.equals(services.id) &&
                this.serviceName.equals(services.serviceName) &&
                this.rentalType.equals(services.rentalType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serviceName, area, rentalFee, maxGuest, rentalType);
    }

    public Services() {
    }

    public Services(String id, String serviceName, double area, double rentalFee, int maxGuest, String rentalType) {
        this.id = id;
        this.serviceName = serviceName;
        this.area = area;
        this.rentalFee = rentalFee;
        this.maxGuest = maxGuest;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }

    public int getMaxGuest() {
        return maxGuest;
    }

    public void setMaxGuest(int maxGuest) {
        this.maxGuest = maxGuest;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public abstract String showInfo();
}
