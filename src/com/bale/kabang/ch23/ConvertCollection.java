package com.bale.kabang.ch23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ConvertCollection {
    public static void main() {
        List<String> lst = Arrays.asList( "Box", "Toy", "Box", "Toy" );
        ArrayList<String> list = new ArrayList<>( lst );

        for( String s : list ) {
            System.out.print( s.toString() + '\t' );
        }
        System.out.println();

        HashSet<String> set = new HashSet<>( list );

        list = new ArrayList<>( set );

        for( String s : list ) {
            System.out.print( s.toString() + '\t' );
        }
        System.out.println();
    }
}
