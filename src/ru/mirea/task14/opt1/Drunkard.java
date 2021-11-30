package ru.mirea.task14.opt1;

import java.util.Stack;

public class Drunkard {
    Stack <Integer> firstPlayer;
    Stack <Integer> secondPlayer;
    public Drunkard(String firstPlayer, String secondPlayer){
        this.firstPlayer = new Stack<>();
        this.secondPlayer = new Stack<>();
        for (int i = 4; i >= 0;i--){
            this.firstPlayer.push(Integer.parseInt(firstPlayer.substring(i, i + 1)));
            this.secondPlayer.push(Integer.parseInt(secondPlayer.substring(i, i + 1)));
        }
    }
    private void pushBack( Stack<Integer> s, Integer item) {
        Stack<Integer> ns = new Stack<>();
        while (!s.isEmpty())
            ns.push(s.pop());
        s.push(item);
        while (!ns.isEmpty())
            s.push(ns.pop());
    }
    public String play(){
        int count = 0;
        String res = "";
        while(!firstPlayer.isEmpty() && !secondPlayer.isEmpty() && count <= 106){
            if(firstPlayer.peek() > secondPlayer.peek() && secondPlayer.peek() != 0){
                pushBack(firstPlayer, firstPlayer.pop());
                pushBack(firstPlayer, secondPlayer.pop());
            }else{
                pushBack(secondPlayer, firstPlayer.pop());
                pushBack(secondPlayer, secondPlayer.pop());
            }
            if(count >= 106) {
                res += "botva ";
                //return res;
            }
            count++;
        }
        if(firstPlayer.isEmpty()) res += "second ";
        else res += "first ";
        res += count;
        return res;
    }
    public static void main(String[] args) {
        System.out.println(new Drunkard("13579", "24680").play());
        System.out.println(new Drunkard("67890", "12345").play());
        System.out.println(new Drunkard("13029", "42685").play());
    }
}
