package exception;

public class IdCardException extends Exception {
    public IdCardException(String message) {
        super(message);
    }

    public static String idCardException(String idCardCustomer) throws IdCardException {
        String regex = "^(\\d{3}\\s?){3}$";
        if (idCardCustomer.matches(regex)) {
            return idCardCustomer;
        } else {
            throw new IdCardException("The id you entered is not in the correct format");
        }
    }
}
