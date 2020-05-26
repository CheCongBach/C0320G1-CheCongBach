package exception;

public class CmndException extends Exception {
    public CmndException(String message) {
        super(message);
    }

    public static String cmndException(String cmndCustomer) throws CmndException {
        String regex = "^[\\d]{8,8}$";
        if (cmndCustomer.matches(regex)) {
            return cmndCustomer;
        } else {
            throw new CmndException("The cmnd you entered is not in the correct format");
        }
    }
}
