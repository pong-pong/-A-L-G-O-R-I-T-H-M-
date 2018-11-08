package me.bella.alg.datastructure.doublelinkedlist;

public class ListElem<T> {

    int index;
    ListElem<T> previousNode;
    T data;
    ListElem<T> nextNode;

    public ListElem(T t, int i) {
        this.data = t;
        this.index = i;
    }

    public ListElem(ListElem<T> p, T t, int i) {
        this.previousNode = p;
        this.data = t;
        this.index = i;
    }

    public ListElem(ListElem<T> p, T t, ListElem<T> n, int i) {
        this.previousNode = p;
        this.data = t;
        this.nextNode = n;
        this.index = i;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ListElem<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(ListElem<T> previousNode) {
        this.previousNode = previousNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListElem<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListElem<T> nextNode) {
        this.nextNode = nextNode;
    }

}
