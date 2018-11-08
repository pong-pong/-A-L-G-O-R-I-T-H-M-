package me.bella.alg.datastructure.doublelinkedlist;

public class Launcher {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.printList();
        System.out.println();

        list.addNext(1, 10);
        list.printList();
        System.out.println();

        list.addNext(4, 110);
        list.addBefore(0, 150);
        list.printList();
        System.out.println("SIZE : " + list.size());
        System.out.println();

    }

}
