/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import pl.bitethebet.model.UserAccount;

/**
 *
 * @author mrowkam
 */
public class UserAccountValidator implements Validator{

    @Override
    public boolean supports(Class<?> clazz) {
        return UserAccount.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "username", "error.username.required");
        ValidationUtils.rejectIfEmpty(errors, "password", "error.password.required");
        UserAccount userAccount = (UserAccount) obj;
        if (!userAccount.getPassword().equals(userAccount.getConfirmPassword())) {
            errors.rejectValue("confirmPassword", "error.password.matching");
        }
    }
    
}
