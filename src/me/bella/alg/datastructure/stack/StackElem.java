package me.bella.alg.datastructure.stack;

public class StackElem<T> {

    private T data;
    private StackElem<T> bottom;

    public StackElem(T data, StackElem<T> bottom) {
        this.data = data;
        this.bottom = bottom;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public StackElem<T> getBottom() {
        return bottom;
    }

    public void setBottom(StackElem<T> bottom) {
        this.bottom = bottom;
    }

}
