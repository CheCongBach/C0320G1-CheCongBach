package exception;

public class GenderException extends Exception {
    GenderException(String message) {
        super(message);
    }

    public static String genderException(String genderCustomer) throws GenderException {
        String regex = "^Male$|^Female$|^Unknow$";
        //genderCustomer = genderCustomer.trim().toLowerCase();
        if (genderCustomer.matches(regex)) {
//            char[] characters = genderCustomer.toCharArray();
//            characters[0] = Character.toUpperCase(characters[0]);
//            genderCustomer = new String(characters);
            return genderCustomer;
        } else {
            throw new GenderException("The gender you entered is invalid");
        }
    }
}
