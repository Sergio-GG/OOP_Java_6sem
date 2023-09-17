import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

// Класс для записи значений полей класса Order в файл
public class OrderToJson{

    public void saveToJson(){
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+order.getClientName()+"\",\n");
            writer.write("\"product\":\""+order.getProduct()+"\",\n");
            writer.write("\"qnt\":"+order.getQnt()+",\n");
            writer.write("\"price\":"+order.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
    private Order order;

    public OrderToJson(Order order) {
        this.order = order;
    }
}
