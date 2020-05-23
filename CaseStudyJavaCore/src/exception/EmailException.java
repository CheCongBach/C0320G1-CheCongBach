package exception;

public class EmailException extends Exception {
    public EmailException(String message) {
        super(message);
    }

    public static String emailException(String emailCustomer) throws EmailException {
        String regex = "^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$";
        if (emailCustomer.matches(regex)) {
            return emailCustomer;
        } else {
            throw new EmailException("The email you entered is not in the correct format");
        }
    }
}
