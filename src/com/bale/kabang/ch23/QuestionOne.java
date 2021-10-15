package com.bale.kabang.ch23;

/*
* Question 1. 다음 클래스의 인스턴스가 HashSet<Person> 컬렉션 인스턴스에 저장될 때,
* 이름과 나이가 같으면 동일 인스턴스로 판단이 되도록 hashCode와 equals 메소드를 오버라이딩 해보자.
* */

import java.util.HashSet;
import java.util.Objects;

class Person {
    private String name;
    private int age;

    public Person( String name, int age ) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "(" + age + "세)";
    }

    @Override
    public int hashCode() {
        return Objects.hash( name, age );
    }

    @Override
    public boolean equals( Object obj ) {
        if( obj instanceof Person ) {
            if( this.name.equals(((Person)obj).name) &&
                this.age == ((Person)obj).age ) {
                return true;
            }
        }

        return false;
    }
}
public class QuestionOne {
    public static void main() {
        HashSet<Person> set = new HashSet<>();
        set.add( new Person( "kihong", 29 ) );
        set.add( new Person( "kihong", 28 ) );
        set.add( new Person( "bale", 29 ) );
        set.add( new Person( "kihong", 29 ) );

        for( Person p : set ) {
            System.out.print( p.toString() + '\t' );
        }
        System.out.println();

    }
}
