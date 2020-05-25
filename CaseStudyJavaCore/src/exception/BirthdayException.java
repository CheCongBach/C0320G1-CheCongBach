package exception;

import java.time.LocalDate;
import java.time.Period;

public class BirthdayException extends Exception {
    public BirthdayException(String message) {
        super(message);
    }

    public static String birthdayException(String birthdayCustomer) throws BirthdayException {
        String regex = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
        LocalDate date = LocalDate.now();
        if (birthdayCustomer.matches(regex)) {
            String[] birthday = birthdayCustomer.split("/");
            if (!((Integer.parseInt(birthday[2]) % 4 == 0 && Integer.parseInt(birthday[2]) % 100 != 0) || Integer.parseInt(birthday[2]) % 400 == 0)) {
                if (Integer.parseInt(birthday[0]) == 29 && Integer.parseInt(birthday[1]) == 2) {
                    throw new BirthdayException("Customer birthday is invalid due to the 29th of february of the normal year");
                }
            }
            LocalDate date2 = LocalDate.of(Integer.parseInt(birthday[2]),Integer.parseInt(birthday[1]),Integer.parseInt(birthday[0]));
            Period period = Period.between(date2,date);
            if (period.getYears() >= 18 && Integer.parseInt(birthday[2]) > 1900) {
                return birthdayCustomer;
            } else {
                throw new BirthdayException("Your birth year must be greater than 1900 and 18 years younger than the current year");
            }
        } else {
            throw new BirthdayException("Your birthday is not in the right format");
        }
    }
}
