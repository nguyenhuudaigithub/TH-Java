package com.example.NguyenHuuDai.Validator;

import com.example.NguyenHuuDai.Validator.annotation.ValidUserId;
import com.example.NguyenHuuDai.entity.User;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {

    @Override
    public boolean isValid(User user, ConstraintValidatorContext context) {
        if (user == null)
            return true;
        return user.getId() !=null;
    }
}
