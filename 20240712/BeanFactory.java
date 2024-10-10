import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class BeanFactory {
    public ProtoType createBean(Class<? extends ProtoType> clazz) {
        try {
            CreationType creationType = clazz.getAnnotation(CreationType.class);

            if (creationType != null) {
                String type = creationType.type();

                if (type.equals("Singleton")) {
                    // For Singleton, return the single instance
                    Method getInstanceMethod = clazz.getMethod("getInstance");
                    return (ProtoType) getInstanceMethod.invoke(null);
                } else if (type.equals("ProtoType")) {
                    // For ProtoType, create a new instance using the default constructor
                    Constructor<? extends ProtoType> constructor = clazz.getDeclaredConstructor();
                    return constructor.newInstance();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
