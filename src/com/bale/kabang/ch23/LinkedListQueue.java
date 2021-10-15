package com.bale.kabang.ch23;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main() {
        Queue<String> que = new LinkedList<>();
        que.offer( "Box" );
        que.offer( "Toy" );
        que.offer( "Robot" );

        // 무엇이 다음에 나올지 확인
        System.out.println( "next : " + que.peek() );

        // 첫번째 인스턴스 꺼내기
        System.out.println( que.poll() );

        // 두번째 인스턴스 꺼내기
        System.out.println( que.poll() );

        // 무엇이 다음에 나올지 확인
        System.out.println( "next : " + que.peek() );

        // 세번째 인스턴스 꺼내기
        System.out.println( que.poll() );

        // 무엇이 다음에 나올지 확인 ( null 예상 )
        System.out.println( "next : " + que.peek() );
    }
}
