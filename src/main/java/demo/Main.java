package demo;

public class Main {


    public static void main(String[] args) {

        LinkedList list = new LinkedList();


        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.delete(2));
        System.out.println(list.get(2));
        System.out.println(list.size());


    }
}


