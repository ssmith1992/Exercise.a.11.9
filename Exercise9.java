package Chapter11;

import java.util.HashSet;
import java.util.Set;

/*
Write a method hasEven that accepts a set of integers as a parameter and returns true if the set contains at least
one even integer and false otherwise. If passed the empty set, your method should return false.
 */
public class Exercise9 {
    public static void main(String[] args)
    {
        Set<Integer> list = new HashSet<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(2);

        Exercise9 exercise9 = new Exercise9();
        boolean isOdd = exercise9.hasOdd(list);
        System.out.println(isOdd);
    }

    public boolean hasOdd(Set<Integer> list)
    {
        if (list.size() == 0) return false;

        boolean isOdd = false;
        for (int value: list)
        {
            if (value % 2 != 0) isOdd = true;
        }
        return isOdd;
    }
}
