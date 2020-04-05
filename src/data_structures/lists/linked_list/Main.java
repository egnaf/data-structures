package data_structures.lists.linked_list;

public class Main {

    public static void main(String[] args) {

        MyList<Integer> myList = new MyLinkedList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        //System.out.println(myList.get(1));

        for (int i = 0; i < 5; i++) {
            System.out.println(myList.get(i));
        }
    }
}
