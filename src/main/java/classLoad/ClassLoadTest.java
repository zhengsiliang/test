package classLoad;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author siliang.zheng
 * Date : 2018/5/24
 * Describle
 */
public class ClassLoadTest {
    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        print("inside main");
        new Candy();
        print("After creating Candy");
        Class clazz = Gum.class;
        print("After refer Gum.class");
        try {
            Class.forName("classLoad.Gum");
        } catch (ClassNotFoundException e) {
            print("Couldn't find Gum");
        }
        print("After Class.forName(\"classLoad.Gum\")");
        new Cookie();
        print("After creating Cookie");
        //Class<Number> numberClass=Integer.class;
        Class<? extends Number> numberClass=Integer.class;
        //Class<? extends Number> numberClass = Number.class;

//        Class<User> clazz=User.class;
        Class<User> userClazz = User.class;

        try {
            Constructor<User> constructor = userClazz.getConstructor(int.class,Gum.class);
            for (int i = 0; i < constructor.getGenericParameterTypes().length; i++) {
                System.out.println(constructor.getGenericParameterTypes()[i]);
            }
            for (int i = 0; i < constructor.getParameterTypes().length; i++) {
                System.out.println(constructor.getParameterTypes()[i]);
            }
            System.out.println(constructor.getName());
            User user = constructor.newInstance(10,null);
            System.out.println(user);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
