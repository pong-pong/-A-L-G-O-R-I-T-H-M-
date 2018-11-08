package me.bella.alg.datastructure.singlelinkedlist;

public class LinkedList<T> {

    private int index = 0;
    private ListElem<T> firstNode;
    private ListElem<T> lastNode;

    public LinkedList() {

    }

    /**
     * Add the data to the linked list
     *
     * @param t the data to add
     */
    public void add(T t) {
        ListElem<T> elem = new ListElem<>(t, index++);
        if (firstNode == null) firstNode = elem;
        else lastNode.setNextNode(elem);
        lastNode = elem;
    }

    /**
     * Add the data to the next of the index to the linked list
     *
     * @param i the previous index of the data
     * @param t the data to add
     */
    public void addNext(int i, T t) {
        ListElem<T> before = find(i);
        ListElem<T> next = find(i + 1);
        ListElem<T> elem = new ListElem<>(t, i + 1, next);
        before.setNextNode(elem);
        increaseIndex(next);
        index++;
    }

    /**
     * Add the data to the before of the index to the linked list
     *
     * @param i the next index of the data
     * @param t the data to add
     */
    public void addBefore(int i, T t) {
        ListElem<T> before = find(i - 1);
        ListElem<T> next = find(i);
        ListElem<T> elem = new ListElem<>(t, i, next);
        before.setNextNode(elem);
        increaseIndex(next);
        index++;
    }

    /**
     * Remove the data from the linked list
     *
     * @param i the data to remove
     */
    public void remove(int i) {
        if (firstNode == lastNode) {
            firstNode = null;
            lastNode = null;
        } else {
            if (i == firstNode.getIndex()) {
                ListElem<T> next = find(i + 1);
                firstNode = next;
                decreaseIndex(next);
            } else if (i == lastNode.getIndex()) {
                ListElem<T> before = find(i - 1);
                before.setNextNode(null);
                lastNode = before;
            } else {
                ListElem<T> before = find(i - 1);
                ListElem<T> next = find(i + 1);
                before.setNextNode(next);
                decreaseIndex(next);
            }
        }
        index--;
    }

    /**
     * Get a first index of the data in the linked list
     *
     * @param t the data to get the index
     * @return the first index of the data
     */
    public int indexOf(T t) {
        ListElem<T> tmp = firstNode;
        while (tmp != null && tmp.getData() != t) tmp = tmp.getNextNode();
        return tmp == null ? -1 : tmp.getIndex();
    }

    /**
     * Get a last index of the data in the linked list
     *
     * @param t the data to get the index
     * @return the last index of the data
     */
    public int lastIndexOf(T t) {
        ListElem<T> tmp = firstNode;
        ListElem<T> rst = null;
        while (tmp != null) {
            if (tmp.getData() == t) rst = tmp;
            tmp = tmp.getNextNode();
        }
        return rst == null ? -1 : rst.getIndex();
    }

    /**
     * Get the data pointed by the index
     *
     * @param i the index to get the data
     * @return the data pointed by the index
     */
    public T get(int i) {
        ListElem<T> tmp = find(i);
        return tmp == null ? null : tmp.getData();
    }

    /**
     * Print the data in the linked list from the first
     */
    public void printList() {
        if (firstNode != null) {
            ListElem<T> tmp = firstNode;
            while (tmp != null) {
                System.out.print("| " + tmp.getData() + " ");
                tmp = tmp.getNextNode();
            }
            System.out.println("|");
        }
    }

    /**
     * Return the size of the linked list
     *
     * @return the size of the linked list
     */
    public int size() {
        return index;
    }

    /**
     * Get the list element pointed by the index
     *
     * @param i the index to get the list element
     * @return the list element pointed by the index
     */
    private ListElem<T> find(int i) {
        ListElem<T> tmp = firstNode;
        while (tmp != null && tmp.getIndex() != i) tmp = tmp.getNextNode();
        return tmp;
    }

    /**
     * Increase the element's index start from the elem
     *
     * @param e the element to start to increase index
     */
    private void increaseIndex(ListElem<T> e) {
        while (e != null) {
            e.setIndex(e.getIndex() + 1);
            e = e.getNextNode();
        }
    }

    /**
     * Decrease the element's index start from the elem
     *
     * @param e the element to start to decrease index
     */
    private void decreaseIndex(ListElem<T> e) {
        while (e != null) {
            e.setIndex(e.getIndex() - 1);
            e = e.getNextNode();
        }
    }

}
