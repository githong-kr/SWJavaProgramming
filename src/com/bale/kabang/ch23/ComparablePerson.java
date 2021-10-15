package com.bale.kabang.ch23;

import java.util.Comparator;
import java.util.TreeSet;

class PersonTwo implements Comparable<PersonTwo> {
    String name;
    int age;

    public PersonTwo( String name, int age ) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.age;
    }

    @Override
    public int compareTo( PersonTwo p ) {
        return this.age - p.age;
    }
}

class PersonComparator implements Comparator<PersonTwo> {
    @Override
    public int compare( PersonTwo p1, PersonTwo p2 ) {
        return p2.age - p1.age;
    }
}

public class ComparablePerson {
    public static void main() {
        //TreeSet<PersonTwo> set = new TreeSet<>();
        TreeSet<PersonTwo> set = new TreeSet<>( new PersonComparator() );
        set.add( new PersonTwo( "kihong", 29 ) );
        set.add( new PersonTwo( "bale", 30 ) );
        set.add( new PersonTwo( "miri", 27 ) );

        for( PersonTwo p : set ) {
            System.out.print( p.toString() + '\t' );
        }
        System.out.println();
    }
}
