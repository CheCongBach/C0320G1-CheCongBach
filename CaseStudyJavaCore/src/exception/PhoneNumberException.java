package exception;

public class PhoneNumberException extends Exception {
    public PhoneNumberException(String message) {
        super(message);
    }

    public static String phoneNumberException(String phoneNumberCustomer) throws PhoneNumberException {
        String regex = "^[0-9]{10}$";
        if (phoneNumberCustomer.matches(regex)) {
            return phoneNumberCustomer;
        } else {
            throw new PhoneNumberException("The phone number you entered is not in the correct format");
        }
    }
}
