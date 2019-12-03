package pl.adam.piechowicz;


import java.util.LinkedList;
import java.util.List;

public class LinkedListTask {
    public static void main(String[] args) {

    List<String> listWithNames = new LinkedList<>();
    listWithNames.add("Jacek");
    listWithNames.add("Adam");
    listWithNames.add("Kamil");


    List<String> mergeList = new LinkedList<>();
    mergeList.add("Letters");
    mergeList.addAll(listWithNames);
    mergeList.add("Numbers");

    System.out.println(mergeList.contains("Kamil")); // True or False
        System.out.println(mergeList.contains("Kamil")); // True or False
        System.out.println(mergeList.get(4));//Index range 0-4
        System.out.println(mergeList.isEmpty());//True or False
        System.out.println(mergeList.indexOf("Adam"));//Printing index number which contains string
        System.out.println(mergeList.lastIndexOf("Jacek"));




    }
}
