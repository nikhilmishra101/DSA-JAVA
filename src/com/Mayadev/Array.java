package com.Mayadev;


import java.util.Arrays;

public class Array {
    private int [] numbers;
    private int count = 0;
    public Array(int length)
    {
        numbers = new int[length];

    }
    public void insert(int number)
    {
        //If the Array is Full
        if(numbers.length == count)
        {
            //Create an Array twice the size of Previous Array
            int[] newnumbers = new int[count*2];
            //Copy All the existing items
            for (int i = 0; i<count;i++)
            {

                newnumbers[i] = numbers[i];
            }
            // Set "numbers" to this new array
            numbers = newnumbers;
        }
        numbers[count++] = number;
    }
    public void print(){
        for(int i = 0; i<count;i++)
        {
            System.out.println(numbers[i]);
        }
    }
    public void removeAt(int index){
        //validate the index
        if (index < 0 || index >= count)
        {
            throw new IllegalArgumentException();
        }
        //shift the items to left to fill the hole
        // [10,20,30]
        // index:1
        // 1 <- 2
        //2 <- 3
        for(int i = index; i<count; i++)
        {
            numbers[i] = numbers[i+1];
        }
        count--;

    }
    public int indexof(int element){
        for(int i = 0; i< count;i++) {
            if (numbers[i] == element) {
                return i;
            }
        }
        return -1;
    }
    public int max(){
        int largest = 0;
        for(int i=0;i<count;i++)
        {
            if(largest < numbers[i])
            {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public int intersect(){
        System.out.println("hello");
        return 1;
    }
    public void reverse(){
        int t;
        for(int i = 0;i<count/2;i++)
        {
            t = numbers[i];
            numbers[i] = numbers[count - i - 1];
            numbers[count-i-1] = t;
        }
    }
    public void insertAt(int item,int index)
    {
        numbers[index-1] = item;
    }
    public void max_min(){
        int n = count;
        int max = 0;
        int min = numbers[0];
        for(int i = 0;i<n;i++)
        {
            if(numbers[i] > max)
            {
                max = numbers[i];
            }
            else if(numbers[i] < min)
            {
                min = numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    public void k_max_min(int k){
        Arrays.sort(numbers);
        System.out.println(numbers[k-1]);
    }

    }


    //ArrayList grows 50% of it's size
    //Vectors grows 100% of it's size
    // But we do not use Vectors because they synchronize the individual operation not the whole vector instance or vector object
    //This can be dangerous because due to tight coupling or dependencies exist in code.





    // Static means that we don't need instance of that class
    // or in layman terms no object needed to create the object
    // that class.

    //Synatx of an array declaration
//	int [] numbers = new int[3];
//	numbers[0] = 10;
//	numbers[1] = 20;
//	numbers[2] = 30;
    //Shortcut
//    int [] numbers = {10,20,30};
//        System.out.println(numbers.length);
                //System.out.println(Arrays.toString(numbers));




// Dynamic Arrays

    //ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.remove(0);
//        list.indexOf(20);
//        list.contains(20);
//        list.size();
//        //convert it to regular array
//        list.toArray();
//        System.out.println(list);