package me.bella.alg.datastructure.singlelinkedlist;

public class ListElem<T> {

    private T data;
    private int index;
    private ListElem<T> nextNode;

    public ListElem(T data, int index) {
        this.data = data;
        this.index = index;
    }

    public ListElem(T data, int index, ListElem<T> nextNode) {
        this.data = data;
        this.index = index;
        this.nextNode = nextNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ListElem<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListElem<T> nextNode) {
        this.nextNode = nextNode;
    }

}
