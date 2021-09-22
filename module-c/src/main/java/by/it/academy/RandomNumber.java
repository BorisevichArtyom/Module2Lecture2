package by.it.academy;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumber {
    private StringRandomizer stringRandomizer = new StringRandomizer();

    public List<Integer> randomIntsGenerator() {
        return new Random()
                .ints(1000, 1, 100_000)
                .boxed()
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "WebLogic{" +
                "stringRandomizer=" + stringRandomizer +
                '}';
    }

    public static void main(String[] args) {
        RandomNumber task = new RandomNumber();
        List<Integer> list = task.randomIntsGenerator();

        System.out.println(list);


    }
}
