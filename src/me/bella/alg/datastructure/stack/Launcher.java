package me.bella.alg.datastructure.stack;

public class Launcher {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.printStack();
        System.out.println();

        stack.pop();
        stack.pop();
        stack.push(6);
        stack.push(7);
        stack.printStack();
        System.out.println();

        stack.pop();
        stack.printStack();
        System.out.println();

    }

}
