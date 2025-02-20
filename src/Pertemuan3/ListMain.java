package Pertemuan3;

public class ListMain {
    public static void main(String[] args) {
        StrukturList newList = new StrukturList();
//        System.out.println("Display Element : ");
        newList.addTail(10);
        newList.addTail(90);
        newList.addTail(80);
        newList.addTail(70);
        newList.displayElement();
        System.out.println();

        System.out.print("================Operasi Add Head");

        System.out.println();



//        System.out.println("Display Element : ");
        newList.addHead(1000);
        newList.displayElement();
    }
}
