package com.bale.kabang.ch23;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {
    public static void main() {
        // 유일한 변화
        List<String> list = new LinkedList<>();

        list.add( "Toy" );
        list.add( "Box" );
        list.add( "Robot" );

        for( String node : list ) {
            System.out.print( node + '\t' );
        }
        System.out.println();

        list.remove( 0 );

        for( String node : list ) {
            System.out.print( node + '\t' );
        }
        System.out.println();
    }
}
