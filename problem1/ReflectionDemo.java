import java.lang.reflect.*;

public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            Class<?> myClass = quarters.class;

            System.out.println("类的名称：" + myClass.getName());

            Method[] methods = myClass.getMethods();
            System.out.println("类的所有方法：");
            for (Method method : methods) {
                System.out.println(method.getName());
            }

            Object myObject = myClass.newInstance();

            Field field = myClass.getDeclaredField("quearters1");
            field.setAccessible(true);
            field.set(myObject, "this is a quearters");

            Method sayHelloMethod = myClass.getMethod("fourquarters");
            sayHelloMethod.invoke(myObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class quarters {
    private String quearters1;

    public void fourquarters() {
        System.out.println("这是一个季度" + quearters1);
    }
}
