public class VectorTest {
    public static void main(String[] args) {

        VectorImpl vector = new VectorImpl(); // capacity: 10

        System.out.println(vector.toString()); // out: []

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10); // capacity: 10 * 3 / 2 = 15
        System.out.println(vector.add(11)); // out: true

        System.out.println(vector); // out: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
        System.out.println(vector.get(1)); // out: 2

        System.out.println(vector.remove(1)); // out: true
        System.out.println(vector); // out: [1, 3, 4, 5, 6, 7, 8, 9, 10, 11]

        System.out.println(vector.size()); // out: 10

    }
}
