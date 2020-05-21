package models;

public abstract class Services {
    private String serviceName;
    private double area;
    private double rentalFee;
    private int maxGuest;
    private String rentalType;

    public Services() {
    }

    public Services(String serviceName, double area, double rentalFee, int maxGuest, String rentalType) {
        this.serviceName = serviceName;
        this.area = area;
        this.rentalFee = rentalFee;
        this.maxGuest = maxGuest;
        this.rentalType = rentalType;
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
