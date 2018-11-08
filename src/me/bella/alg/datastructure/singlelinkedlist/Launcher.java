package me.bella.alg.datastructure.singlelinkedlist;

public class Launcher {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.printList();
        System.out.println();

        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.printList();
        System.out.println();

        list.add(5);
        System.out.println(list.indexOf(5) + " : " + list.get(list.indexOf(5)));
        System.out.println(list.lastIndexOf(5) + " : " + list.get(list.lastIndexOf(5)));

    }

}
