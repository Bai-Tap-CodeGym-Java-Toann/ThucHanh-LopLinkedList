public class Tester {
    public static void main(String[] args) {
        Linked link = new Linked("trai");
        link.printList();
        System.out.println();

        link.addFirst("đệp");
        link.addFirst("ko");
        link.printList();
        System.out.println();

        link.removeFirst();
        link.printList();
        System.out.println();

        link.add(300,"toàn đẹp trai");
        link.printList();
        System.out.println();

        link.remove(1);
        link.printList();

        System.out.println(link.remove(300));
    }

}
