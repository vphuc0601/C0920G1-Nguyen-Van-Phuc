package DSA.thuc_hanh;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(5);
        System.out.println("element 1: " + listInteger.get(0));
        System.out.println("element 2: " + listInteger.get(1));
        System.out.println("element 3: " + listInteger.get(2));
        System.out.println("element 4: " + listInteger.get(3));
        System.out.println("element 5: " + listInteger.get(4));
        System.out.println("element 6: " + listInteger.get(6));

    }
}
