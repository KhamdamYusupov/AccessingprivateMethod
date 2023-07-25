import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class c = Class.forName("Abc");
        Object o = c.newInstance();
        Method m = c.getDeclaredMethod("display", null);
        m.setAccessible(true);
        m.invoke(o, null);



    }
}