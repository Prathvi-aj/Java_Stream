package streamInCollection.createStream;

import java.util.List;
import java.util.stream.Stream;

public class StreamInList {
    public static void main(String[] args){
        List<Integer> list= List.of(1,2,3,4,5,6,7);
//        List<String> list= List.of("Hi","Hello","I am Abhishek","Java Developer");
        Stream<Integer> stream1=list.stream();
        Stream<List<Integer>> stream2=Stream.of(list);


        stream1.forEach(System.out::println);
        stream2.forEach(x->x.stream().forEach(System.out::println));

        /*//print
        list.stream().forEach(System.out::println);

        //filter
        list.stream().filter(x->x%2==0).forEach(System.out::println);
//        list.stream().filter(x->x.startsWith("J")).forEach(System.out::println);

        //map
        list.stream().map(x->x*x).forEach(System.out::println);
//        list.stream().map(z->"L"+z).forEach(System.out::println);

        list.stream().map(x->x*x).filter(x->x%2==0).forEach(System.out::println);*/
    }

}
