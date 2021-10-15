package com.bale.kabang.ch23;

import java.util.HashSet;

class Num {
    private int num;

    public Num( int num ) {
        this.num = num;
    }

    @Override
    public String toString() {
        return String.valueOf( this.num );
    }

}

public class HashSetEqualityOne {
    public static void main() {
        HashSet<Num> set = new HashSet<>();

        set.add( new Num(7799) );
        set.add( new Num(9955) );
        set.add( new Num(7799) );
        System.out.println( "인스턴스 수 : " + set.size() );

        for( Num n : set ) {
            System.out.print( n.toString() + '\t' );
        }
        System.out.println();
    }
}
