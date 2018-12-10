package enumTest;

import java.util.Arrays;

/**
 * @author siliang.zheng
 * Date : 2018/6/4
 * Describle
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(Day.FRIDAY.compareTo(Day.MONDAY));
        System.out.println(Day.FRIDAY.ordinal());
        System.out.println(Day.SUNDAY.ordinal());
        System.out.println(Day.FRIDAY.name());
        System.out.println(Arrays.toString(Day.values()));
        System.out.println(Enum.valueOf(Day.class,"FRIDAY"));
        Enum e=Day.MONDAY;
        Class declaringClass = e.getDeclaringClass();
        System.out.println(declaringClass);
        System.out.println(Arrays.toString(declaringClass.getEnumConstants()));
    }
}
