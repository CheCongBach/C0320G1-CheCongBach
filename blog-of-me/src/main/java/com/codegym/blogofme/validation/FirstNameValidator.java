package com.codegym.blogofme.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FirstNameValidator implements ConstraintValidator<FirstNameValid, String> {
   public FirstNameValidator() {
   }

   public void initialize(FirstNameValid constraint) {
   }

   public boolean isValid(String contactField, ConstraintValidatorContext ctx) {
      return contactField != null && contactField.matches("[a-zA-Z]+") && contactField.length() > 2 && contactField.length() < 10;
   }
}
