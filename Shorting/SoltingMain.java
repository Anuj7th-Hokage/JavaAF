package Shorting;public class SoltingMain {        public static void main(String[] args) {            int[] arr = {1,2,9,77,66};            Sortable bubbleSort = new BubbleSort();            bubbleSort.sort(arr);            System.out.print("Bubble Sort ");            for (int num : arr) {                System.out.print(num+" ");            }            System.out.println();            int[] arr2 = {1,2,77,9,66};            Sortable selectionSort = new SelectionSort();            selectionSort.sort(arr2);            System.out.print("Selection Sort ");            for (int num : arr2) {                System.out.print(num +" ");            }        }}