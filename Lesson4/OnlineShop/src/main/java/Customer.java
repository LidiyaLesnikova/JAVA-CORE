import lombok.Data;

import java.time.LocalDate;
@Data
public class Customer {
    private String FIO;
    private LocalDate dateOfBirth;
    private String phone;
    private Enum gender;

    public Customer(String FIO, LocalDate dateOfBirth, String phone, Enum gender) {
        this.FIO = FIO;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.gender = gender;
    }
}
