import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan Petrov",
                "devops",
                "+79765463452",
                BigDecimal.valueOf(100000),
                LocalDate.of(1976, 4, 1));

        Employee employee2 = new Employee("Vasiliy Petrov",
                "programmer",
                "+79765463452",
                BigDecimal.valueOf(200000),
                LocalDate.of(1985, 5, 1));

        Employee employee3 = new Employee("Ivan Ivanov",
                "engineer",
                "+79765463452",
                BigDecimal.valueOf(60000),
                LocalDate.of(1970, 1, 1));

        Employee employee4 = new Employee("Ivan Sidorov",
                "analyst",
                "+79765463452",
                BigDecimal.valueOf(50000),
                LocalDate.of(1999, 2, 1));

        Guide employee5 = new Guide("Petr Petrov",
                "team lead",
                "+79765463452",
                BigDecimal.valueOf(300000),
                LocalDate.of(1975, 1, 1));


        List<Employee> employees = new ArrayList<>(Arrays.asList(employee1, employee2, employee3, employee4, employee5));
        employees.stream().forEach(System.out::println);

        salaryIncreaseForEmployees(employees, 0, 5000); //всем сотрудникам
        Collections.sort(employees);
        System.out.println();
        employees.stream().forEach(employee -> employee.printInfo());

//        System.out.println();
//        System.out.println(getAverageSalaryAndAge(employees));
        System.out.println();
        System.out.println(getAverage(employees));
    }

    public static void salaryIncreaseForEmployees(List<Employee> employees, int ageOlder, int bonusValue) {
        for (Employee employee : employees) {
            if (employee.getAge() > ageOlder) {
                employee.increaseSalary(bonusValue);
            }
        }
    }

//    public static String getAverageSalaryAndAge(List<Employee> employees) {
//        double averageSalaries = employees.stream().mapToDouble(x -> x.getSalary().doubleValue()).average().orElseThrow();
//        double averageAge = employees.stream().mapToDouble(x -> (double) x.getAge()).average().orElseThrow();
//
//        return String.format("Average salary - %s, age - %s", averageSalaries, averageAge);
//
//    }

    public static AverageResponseDTO getAverage(List<Employee> employees) {
        return AverageResponseDTO.builder()
                .averageAge(employees.stream().mapToDouble(x -> (double) x.getAge()).average().orElseThrow())
                .averageSalary(employees.stream().mapToDouble(x -> x.getSalary().doubleValue()).average().orElseThrow())
                .averageLettersInFIO((int) employees.stream().mapToInt(x -> x.getFIO().length()).average().orElseThrow())
                .build();
    }
}
