package Shorting;public class SelectionSort implements Sortable {    public void sort(int arr[]) {        int total=arr.length;        for(int i=0;i<total-1;i++){            int temp=0;            for(int j=i+1;j<total;j++){                if(arr[i]<arr[j]){                    temp=arr[i];                    arr[i]=temp;                }            }        }    }}