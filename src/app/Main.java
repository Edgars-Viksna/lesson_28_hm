package app;

import app.MyLists.MyArrayList;
import app.MyLists.MyLinkedList;
import app.MyLists.MyLists;

public class Main {
    public static void main(String[] args) {

        MyLists arrayList = new MyArrayList();
        arrayList.add(new Person("Bbbbb", "Ggggg", 2001));
        arrayList.add(new Person("Ccccc", "Jjjjj", 2002));
        arrayList.add(new Person("Ccccc", "Ppppp", 2000));
        arrayList.add(new Person("Rrrrr", "Lllll", 1995));

        System.out.println("----- Print array list -------");
        print(arrayList);


        MyLists linkedList = new MyLinkedList();
        linkedList.add(new Person("Ddddd", "Fffff", 2005));
        linkedList.add(new Person("Eeeee", "Ttttt", 2015));
        linkedList.add(new Person("Ooooo", "Rrrrr", 1999));

        System.out.println("----- Print linked list -------");
        print(linkedList);


    }

    public static void print(MyLists lists) {
        for (int i = 0; i < lists.size(); i++) {
            Person person = lists.get(i);
            System.out.println(person);

        }

    }

}