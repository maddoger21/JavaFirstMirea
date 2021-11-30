package ru.mirea.task13.opt3;

public class Test {
    public static void main(String[] args){
        OwnCollect<Integer> integers = new OwnCollect<>();
        for(int i = 0; i<20;i++)
            integers.add(i);
        System.out.println(integers);
        for(int i = 5; i < 13; i++)
            integers.remove(i);
        System.out.println(integers);
        System.out.println(integers.get(5));
        System.out.println();

        OwnCollect<String> strs = new OwnCollect<>();
        System.out.println(strs);
        for (int i = 0; i < 10; i++) {
            strs.add("String number " + (i+1));
        }
        System.out.println(strs);
        System.out.println();

        OwnCollect<String> strs2 = new OwnCollect<>();
        System.out.println(strs2);
        strs2.remove(5);
        System.out.println(strs2.get(5));
        System.out.println(strs.get(5));
        System.out.println(strs2);
    }
}
