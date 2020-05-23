package models;

public class Customer {
    private String nameCustomer;
    private String idCard;
    private String birthday;
    private String gender;
    private String cmnd;
    private String phoneNumber;
    private String email;
    private String typeCustomer;
    private String address;
    private Services services;

    public Customer() {
    }

    public Customer(String nameCustomer, String idCard, String birthday, String gender, String cmnd, String phoneNumber,
                    String email, String typeCustomer, String address, Services services) {
        this.nameCustomer = nameCustomer;
        this.idCard = idCard;
        this.birthday = birthday;
        this.gender = gender;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.services = services;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public String showInfo() {
        return "Customer information: " + "\n" + "Name: " + this.nameCustomer + "\n" + "IdCard: " + this.idCard+ "\n" + "Birthday: " + this.birthday +
                "\n" + "Gender: " + this.gender + "\n" + "Cmnd: " + this.cmnd + "\n" + "Phone Number: " + this.phoneNumber +
                "\n" + "Email: " + this.email + "\n" + "Type Customer: " + this.typeCustomer + "\n" +
                "Address: " + this.address + "\n" + "Services: " + this.services;
    }

    public int getYearBirthday() {
        String temp = "";
        for (int i = birthday.length() - 4; i < birthday.length(); i++) {
            temp += birthday.charAt(i);
        }
        return new Integer(temp);
    }
}
