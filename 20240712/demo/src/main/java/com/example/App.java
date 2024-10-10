package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Student s = Student.builder().no(1).name("Celine").department("CE").build();
    }
}
