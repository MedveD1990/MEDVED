package homeWork16;
import java.util.List;
import java.util.Random;

import java.util.stream.Stream;

public class StreamClassDemo {
    static Random ran = new Random();
    public static void main(String[] args) {

//        Stream.generate(() -> random.nextInt(1, 50));

        List<Integer> list = Stream.generate(() -> ran.nextInt(1, 50)).limit(20).toList();
        System.out.println(list.toString());
         list.stream()
                    .limit(20)
                    .map(integer -> integer*2)
                    .distinct()
                    .sorted()
                    .toList()
                .forEach(str -> System.out.print(str + " "));





//        Runnable runnable = () -> random.nextInt(0, 20);
//        System.out.println(runnable.toString());

    }
//    public static List<Integer> randomList(int min, int max, int count) {
//        return new Random()
//                .ints(min, max)
//                .limit(count)
//                .distinct()
//                .boxed()
//                .collect(Collectors.toList());

}
// try with resources использует autocloseble интерфейс.
/*
неучную takeWhile- берет значение, удовлетворяющее условию , dropWhile пропускает пока длина меньше условия,
 iterate -генерирует бесконечную последовательность(счечтие for-цикла).
*/

