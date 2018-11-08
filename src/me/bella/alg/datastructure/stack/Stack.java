package me.bella.alg.datastructure.stack;

public class Stack<T> {

    private int size;
    private StackElem<T> top;

    public Stack() {

    }

    /**
     * Push the data to the stack
     *
     * @param data the data to push
     */
    public void push(T data) {
        top = new StackElem<>(data, top);
        size++;
    }

    /**
     * Pop the data from the stack
     *
     * @return the popped data
     */
    public T pop() {
        T r = top.getData();
        top = top.getBottom();
        size--;
        return r;
    }

    /**
     * Print the data in the stack from the top
     */
    public void printStack() {
        StackElem<T> c = top;
        while (c != null) {
            System.out.println("| " + c.getData() + " |");
            c = c.getBottom();
        }
    }

    /**
     * Return the size of the stack
     *
     * @return the size of the stack
     */
    public int size() {
        return size;
    }

}
