import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ReflectionDemo2 {
    public static void main(String[] args) {
        try {
            File configFile = new File("1.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(configFile);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("bean");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String id = element.getAttribute("id");
                    String className = element.getAttribute("class");

                    if ("paymentProcessor".equals(id)) {
                        Order order = new Order(123, 100.0); // 创建 Order 对象
                        Class<?> clazz = Class.forName(className);
                        PaymentProcessor paymentProcessor = (PaymentProcessor) clazz.getConstructor(Order.class).newInstance(order);

                        paymentProcessor.processPayment();//执行支付
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
