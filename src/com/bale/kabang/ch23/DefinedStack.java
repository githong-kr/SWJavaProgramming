package com.bale.kabang.ch23;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

interface DIStack<E> {
    public boolean push(E e);
    public E pop();
}

class DCStack<E> implements DIStack<E> {
    private Deque<E> deq;

    public DCStack( Deque<E> deq ) {
        this.deq = deq;
    }

    public boolean push(E e) {
        return this.deq.offerFirst( e );
    }

    public E pop() {
        return this.deq.pollFirst();
    }
}

public class DefinedStack {
    public static void main() {
        DIStack<String> stk = new DCStack<>( new LinkedList<String>() );

        stk.push( "1.Box" );
        stk.push( "2.Toy" );
        stk.push( "3.Robot" );

        System.out.println( stk.pop() );
        System.out.println( stk.pop() );
        System.out.println( stk.pop() );
    }
}
