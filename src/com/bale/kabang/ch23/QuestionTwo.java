package com.bale.kabang.ch23;

import java.util.Comparator;
import java.util.TreeSet;

class ComparatorInteger implements Comparator<Integer> {
    @Override
    public int compare( Integer n1, Integer n2 ) {
        return n2 - n1;
    }
}

public class QuestionTwo {
    public static void main() {
        TreeSet<Integer> set = new TreeSet<>( new ComparatorInteger() );
        set.add(30);
        set.add(20);
        set.add(10);

        System.out.println( set );
    }
}
