package enumTest;

import java.io.*;
import java.util.Objects;

/**
 * @author siliang.zheng
 * Date : 2018/6/5
 * Describle
 */
public class SingletonTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
//        Singleton singleton = Singleton.getSingleton();
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("tempFile"));
//        objectOutputStream.writeObject(singleton);
//        objectOutputStream.close();
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("tempFile"));
//        Singleton read = (Singleton) objectInputStream.readObject();
//        objectInputStream.close();
//        System.out.println(Objects.equals(read, singleton));
        Class<Singleton> clazz=Singleton.class;
        Singleton singleton = clazz.newInstance();
        System.out.println(Objects.equals(singleton,Singleton.getSingleton()));

    }
}
