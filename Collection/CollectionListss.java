package Collection;import java.util.Stack;import java.util.Vector;import java.util.LinkedList;public class CollectionListss {        public static void main(String[] args)        {            System.out.println("Vector-----------");            Vector vec=new Vector();            vec.addElement(1);            vec.addElement(2);            vec.addElement(3);            for (Object i : vec) {                System.out.println(i);            }            System.out.println("LinkList-----------");           LinkedList l=new LinkedList();            l.add("One");            l.add("Two");            l.add("Three");            l.add("Four");            l.add("Five");            for (Object p : l) {                System.out.println(p);            }            System.out.println("Stack-----------");            Stack s=new Stack();            s.push(1);            s.push(2);            s.push(3);            s.push(4);            for (Object p : s) {                System.out.println(p);            }            System.out.println("After pop......");            s.pop();            for (Object p : s) {                System.out.println(p);            }            System.out.println("peek ......");            System.out.println(s.peek());        }}