/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import pl.bitethebet.model.UserAccount;
import pl.bitethebet.repository.UserAccountRepository;

/**
 *
 * @author mrowkam
 */
@Component
public class UserAccountValidator implements Validator {

    @Autowired
    UserAccountRepository userAccountRepository;

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
        if (doesUserExist(userAccount)) {
            errors.rejectValue("username", "error.userExist");
        }
    }

    private boolean doesUserExist(UserAccount userAccount) {
        return userAccountRepository.findByUsername(userAccount.getUsername()) != null || userAccount.getUsername().equals("admin");
    }
}
