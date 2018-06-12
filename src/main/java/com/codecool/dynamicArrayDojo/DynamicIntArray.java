package com.codecool.dynamicArrayDojo;

// put your code here!
public class DynamicIntArray {
    public static int index = 0;
    public static int[] myArray;
    public DynamicIntArray(){}

    public DynamicIntArray(int len) {
        myArray = new int[len];
    }

    public void add(int number){
        if (myArray.length -1 == index){
            int[] newArray = new int[myArray.length*2];
            for (int i = 0; i < myArray.length; i++) {
                newArray[i] = myArray[i];

            }
            myArray = newArray;
            }
        myArray[index] = number;
        index++;

        }
    public void remove(int number){}
    public void insert(int index,int number){}

}
