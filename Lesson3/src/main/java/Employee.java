import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
//@Getter
//@Setter
@AllArgsConstructor
//@EqualsAndHashCode
//@ToString
@Data
public class Employee implements Comparable<Employee> {
    private String FIO;
    private String position;
    private String phone;
    private BigDecimal salary;
    private LocalDate birthDate;


    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

    public void printInfo() {
        System.out.println(String.format("%s - %s , phone - %s ,salary - %s, age - %s", FIO, position, phone, salary, this.getAge()));
    }

    public void increaseSalary(int value) {
        this.salary = salary.add(BigDecimal.valueOf(value));
    }

    @Override
    public int compareTo(Employee o) {
        return this.birthDate.compareTo(o.birthDate);
    }
}
