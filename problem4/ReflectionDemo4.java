import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo4 {

    public static void processAnnotations(Object obj) {
        Class<?> clazz = obj.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Annotation.class)) //查找带有注解的方法
            {
                Annotation annotation = method.getAnnotation(Annotation.class);
                String value = annotation.value();

                System.out.println("找到注解方法: " + method.getName());
                System.out.println("Value: " + value);

                try {
                    method.invoke(obj);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
