package design.patterns.java.behavioral.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorClient {
    public static void main(String[] args) {

        /*ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(27);
        numbers.add(2);
        numbers.add(1);*/

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(7, 27,7,1));

        Iterator<Integer> numbersIterator = numbers.iterator();

        while (numbersIterator.hasNext()) {
            int number = numbersIterator.next();
            System.out.println(number);
            numbersIterator.remove();
        }
        System.out.println("List" + numbers);
        System.out.println("Iterator List:" + numbersIterator);
    }
}
