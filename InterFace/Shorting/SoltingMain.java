package InterFace.Shorting;public class SoltingMain {        public static void main(String[] args) {            int[] arr={1,2,9,77,66};            Sortable bs=new BubbleSort();            bs.sort(arr);            System.out.print("bubble Sort ");            for (int num:arr) {                System.out.print(num+" ");            }            System.out.println();            int[] arr2={1,2,77,9,66};            Sortable ss = new SelectionSort();            ss.sort(arr2);            System.out.print("selection Sort ");            for (int num : arr2) {                System.out.print(num +" ");            }        }}