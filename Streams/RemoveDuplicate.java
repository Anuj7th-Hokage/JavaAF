package Streams;import java.util.ArrayList;import java.util.Arrays;import java.util.List;import java.util.stream.Collectors;public class RemoveDuplicate {    public static void main(String[] args) {        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,4,8,9,2,3,6,1,2,9));        List<Integer>dup=list.stream().distinct().collect(Collectors.toList());        System.out.println(dup);    }}