package custom.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author jay
 */
public class ConfirmPasswordValidator implements ConstraintValidator<ConfirmPassword, StudentCO> {

    private StudentService studentService;

    @Override
    public boolean isValid(StudentCO studentCO, ConstraintValidatorContext constraintValidatorContext) {
        return studentService.isPasswordConfirmPasswordMatched( studentCO);
    }
}
