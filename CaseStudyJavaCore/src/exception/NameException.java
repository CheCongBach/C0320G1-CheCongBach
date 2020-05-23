package exception;

public class NameException extends Exception {
    public NameException(String message) {
        super(message);
    }

    public static String nameException(String nameCustomer) throws NameException {
        String regex = "^([A-Z][a-z]+\\s{0,1})+$";
        if (nameCustomer.matches(regex)) {
            return nameCustomer;
        } else {
            throw new NameException("The name entered is not in the correct format");
        }
    }
}
