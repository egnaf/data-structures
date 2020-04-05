package data_structures.lists.array_list;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(4);
        list.add(-7);

        System.out.println(list); // [1, 9, 3, 4, -7]

        System.out.println(list.get(2)); // 3

        list.remove(2);

        System.out.println(list); // [1, 9, 4, -7]
    }
}
