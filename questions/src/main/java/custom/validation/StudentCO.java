package custom.validation;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * @author jay
 */
@Data
@NoArgsConstructor
@ConfirmPassword(message = "validation.student.password.match")
public class StudentCO {
    @NotEmpty(message = "validation.student.firstName.empty")
    private String firstName;
    private String middleName;
    @NotEmpty(message = "validation.student.lastName.empty")
    private String lastName;
    private String dateOfBirth;
    @NotEmpty(message = "validation.student.emailAddress.empty")
    @Email(message = "validation.student.emailAddress.valid")
    private String emailAddress;
    private String confirmPassword;
    private String password;
}
