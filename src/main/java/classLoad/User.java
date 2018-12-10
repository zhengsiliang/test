package classLoad;

/**
 * @author siliang.zheng
 * Date : 2018/5/29
 * Describle
 */
public class User {
    private int age;
    private String name;

    private Gum gum;

    public User(int age, Gum gum) {
        this.age = age;
        this.gum = gum;
    }

    public Gum getGum() {
        return gum;
    }

    public void setGum(Gum gum) {
        this.gum = gum;
    }

    public User(int age) {
        this.age = 10;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gum=" + gum +
                '}';
    }
}
