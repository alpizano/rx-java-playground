package org.example;

import io.reactivex.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Operators transform one observable into another
        // map, filter etc
        Observable.just("Hello world.").subscribe(line -> System.out.println(line));

        Observable.range(0,5).map(index -> "Hello World....").subscribe(line -> System.out.println(line));

    }
}
