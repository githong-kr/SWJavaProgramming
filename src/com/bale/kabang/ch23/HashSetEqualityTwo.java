package com.bale.kabang.ch23;

import java.util.HashSet;

class NumModifed {
    private int num;

    public NumModifed( int num ) {
        this.num = num;
    }

    @Override
    public String toString() {
        return String.valueOf( this.num );
    }

    @Override
    public int hashCode() {
        return (this.num % 3);
    }

    @Override
    public boolean equals( Object obj ) {
        if( this.num == ((NumModifed)obj).num ) {
            return true;
        } else {
            return false;
        }
    }
}

public class HashSetEqualityTwo {
    public static void main() {
        HashSet<NumModifed> set = new HashSet<>();

        set.add( new NumModifed(7799) );
        set.add( new NumModifed(9955) );
        set.add( new NumModifed(7799) );
        System.out.println( "인스턴스 수 : " + set.size() );

        for( NumModifed n : set ) {
            System.out.print( n.toString() + '\t' );
        }
        System.out.println();
    }
}
