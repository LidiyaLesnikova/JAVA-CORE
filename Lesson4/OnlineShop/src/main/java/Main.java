import exceptions.CustomerNotExistException;
import exceptions.ProductNotExistException;
import exceptions.QuantityException;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws CustomerNotExistException, ProductNotExistException, QuantityException {
        System.out.println("online shop");

        OnlineShop.getCustomerList().add(new Customer("Ivanov Ivan", LocalDate.of(1987, 12, 9), "+9867566473", Gender.male));
        OnlineShop.getCustomerList().add(new Customer("Petrov Petr", LocalDate.of(1988, 12, 20), "+9867566475", Gender.male));
        OnlineShop.getCustomerList().add(new Customer("Holodova Alina", LocalDate.of(2000, 1, 15), "+9867566499", Gender.female));
        OnlineShop.getProductList().add(new Product("apple", BigDecimal.valueOf(10L)));
        OnlineShop.getProductList().add(new Product("pineapple", BigDecimal.valueOf(50L)));


        try {
            Order order = null;
            order = OnlineShop.buyProduct("Ivanov Ivan", "apple", "20");


            OnlineShop.getOrderList().add(order);
            System.out.println(OnlineShop.getOrderList());

            Order order2 = OnlineShop.buyProduct("Ivanov Ivan", "apple", "20");
            OnlineShop.getOrderList().add(order2);
            System.out.println(OnlineShop.getOrderList());

            Order order3 = OnlineShop.buyProduct("Petrov Petr", "pineapple", "300");
            OnlineShop.getOrderList().add(order3);
        } catch (QuantityException e) {
            OnlineShop.getOrderList().add(OnlineShop.buyProduct(e.getCustomer(), e.getProduct(), "1"));
        } catch (ProductNotExistException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw e;
        }

        System.out.println(OnlineShop.getOrderList());
        System.out.println(OnlineShop.getOrderList().size() + " orders received");

        congratulateWithHolidays();
    }

    public static void congratulateWithHolidays() {
        LocalDate today = LocalDate.now();
        if (today.getDayOfMonth()==1 && today.getMonthValue()==1) {
            OnlineShop.getCustomerList().stream().forEach(a -> System.out.println(a.getFIO()+Holidays.New_Year.getTitle()));
        } else if (today.getDayOfMonth()==8 && today.getMonthValue()==3) {
            OnlineShop.getCustomerList().stream().filter(a -> a.getGender()==Gender.female).forEach(a -> System.out.println(a.getFIO()+Holidays.March8.getTitle()));
        } else if (today.getDayOfMonth()==23 && today.getMonthValue()==2) {
            OnlineShop.getCustomerList().stream().filter(a -> a.getGender()==Gender.male).forEach(a -> System.out.println(a.getFIO()+Holidays.February23.getTitle()));
        } else {
            System.out.println(Holidays.NONE.getTitle());
        }
    }
}
