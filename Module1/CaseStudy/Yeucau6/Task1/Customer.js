let Customer = function () {
    this.setName = function (name) {
        this.name = name;
    }
    this.getName = function () {
        return this.name;
    }
    this.setCmnd = function (cmnd) {
        this.cmnd = cmnd;
    }
    this.getCmnd = function () {
        return this.cmnd;
    }
    this.setBirthday = function (birthday) {
        this.birthday = birthday;
    }
    this.getBirthday = function () {
        return this.birthday;
    }
    this.setEmail = function (email) {
        this.email = email;
    }
    this.getEmail = function () {
        return this.email;
    }
    this.setAddress = function (address) {
        this.address = address;
    }
    this.getAddress = function () {
        return this.address;
    }
    this.settypeCustomer = function (typeCustomer) {
        this.typeCustomer = typeCustomer;
    }
    this.gettypeCustomer = function () {
        return this.typeCustomer;
    }
    this.setdiscount = function (discount) {
        this.discount = discount;
    }
    this.getdiscount = function () {
        return this.discount;
    }
    this.setsoluongdikem = function (soluongdikem) {
        this.soluongdikem = soluongdikem;
    }
    this.getsoluongdikem = function () {
        return this.soluongdikem;
    }
    this.setrentDay = function (rentDay) {
        this.rentDay = rentDay;
    }
    this.getrentDay = function () {
        return this.rentDay;
    }
    this.settypeService = function (typeService) {
        this.typeService = typeService;
    }
    this.gettypeService = function () {
        return this.typeService;
    }
    this.settypeRoom = function (typeRoom) {
        this.typeRoom = typeRoom;
    }
    this.gettypeRoom = function () {
        return this.typeRoom;
    }
    this.totalPay = function () {
        let money = 0;
        if (this.typeService === "Villa") {
            money = 500;
        } else if (this.typeService === "House") {
            money = 300;
        } else if (this.typeService === "Room") {
            money = 200;
        }
        let totalPayy = this.rentDay * money * (1 - this.discount / 100);
        return totalPayy;
    }
}