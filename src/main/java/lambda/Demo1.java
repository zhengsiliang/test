package lambda;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author siliang.zheng
 * Date : 2018/2/12
 * Describle
 */
public class Demo1 {
    public static int addUp(Stream<Integer> numbers) {
        return numbers.reduce(0, (acc, element) -> acc + element);
    }

    public static <I,O> List<O> map(Stream<I> stream, Function<I, O> mapper) {
        return stream.reduce(new ArrayList<O>(), (acc, x) -> {

            List<O> newAcc = new ArrayList<>(acc);
            newAcc.add(mapper.apply(x));
            return newAcc;
        }, (List<O> left, List<O> right) -> {
            // We are copying left to new list to avoid mutating it.
            List<O> newLeft = new ArrayList<>(left);
            newLeft.addAll(right);
            return newLeft;
        });
    }



    public static void main(String[] args) {
//        List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7);
//        list.stream().filter(item -> {
//            System.out.println(item);
//            return item > 2;
//        });
//        System.out.println(addUp(list.stream()));
    }
}
