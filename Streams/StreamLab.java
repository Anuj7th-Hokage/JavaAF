package Streams;import java.util.ArrayList;import java.util.Arrays;import java.util.Comparator;import java.util.List;import java.util.stream.Collectors;public class StreamLab {    public static void main(String[] args) {        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,2,5,4,6,7,4,3,2,1));        List<Integer> mul = list.stream()                .map(x->x*5)                .peek(val-> System.out.print(" use peek- "+val))                .collect(Collectors.toList());        List<Integer> ascc = list.stream()                .sorted()                .map(x->x*5)                .collect(Collectors.toList());        List<Integer> desc = list.stream()                .sorted(Comparator.reverseOrder())                .map(x->x*5)                .collect(Collectors.toList());        List<Integer>dup=list.stream().                distinct().                collect(Collectors.toList());        List<Integer>lim=list.stream().limit(3)                .collect(Collectors.toList());        List<Integer>ski=list.stream().skip(4)                .collect(Collectors.toList());        System.out.println("\nMultiply by 5- "+mul);        System.out.println("Ascending order- "+ascc);        System.out.println("Descending order- "+desc);        System.out.println("Duplicate distict use- "+dup);        System.out.println("First three by use limit- "+lim);        System.out.println("First four number skip- "+ski);    }}