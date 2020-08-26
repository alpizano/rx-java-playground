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

        // map
        Observable.range(0,5).map(index -> "Hello World....").subscribe(line -> System.out.println(line));

        // filter
        Observable.just(1, 3, 4, 7, 10, 12, 13, 11, 15).filter(val -> val % 2 == 0).subscribe(line -> System.out.println(line));

    }
}
