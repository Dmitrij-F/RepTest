import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Bro on 06.10.15.
 */
public class TraceHandler implements InvocationHandler {

    private Object target;

    public TraceHandler(Object t) {
        target = t;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.print(target);
        System.out.print("." + method.getName() + "(");
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.print(i);
                if (i < args.length - 1) System.out.print(", ");
            }
        }
        System.out.print(")");
        return method.invoke(target, args);
    }

}
