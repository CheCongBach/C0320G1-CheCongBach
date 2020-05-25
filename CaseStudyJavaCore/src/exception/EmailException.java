package exception;

public class EmailException extends Exception {
    public EmailException(String message) {
        super(message);
    }

    public static String emailException(String emailCustomer) throws EmailException {
        String regex = "\\S+@\\S+\\.\\S+";
        if (emailCustomer.matches(regex)) {
            return emailCustomer;
        } else {
            throw new EmailException("The email you entered is not in the correct format");
        }
    }
}
