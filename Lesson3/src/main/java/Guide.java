import java.math.BigDecimal;
import java.time.LocalDate;

public class Guide extends Employee {
    public Guide(String FIO, String position, String phone, BigDecimal salary, LocalDate birthDate) {
        super(FIO, position, phone, salary, birthDate);
    }

    @Override
    public void increaseSalary(int value) {
        //super.increaseSalary(value);
    }
}
