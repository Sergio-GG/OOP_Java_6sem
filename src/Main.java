import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");

        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();

        OrderToJson orderToJson = new OrderToJson(order);
        orderToJson.saveToJson();
    }
}