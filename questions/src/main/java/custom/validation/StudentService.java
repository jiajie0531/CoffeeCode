package custom.validation;

/**
 * @author jay
 */
public class StudentService {
    public boolean isPasswordConfirmPasswordMatched(StudentCO studentCO) {
        return (studentCO.getPassword() != null
                && studentCO.getConfirmPassword() != null
                && studentCO.getPassword().equals(studentCO.getConfirmPassword()));
    }
}
