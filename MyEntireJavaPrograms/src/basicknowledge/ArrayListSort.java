package basicknowledge;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(22);
        arrList.add(51);
        arrList.add(45);
        arrList.add(91);
        arrList.add(1);
        
        System.out.println("Elements of integer arraylist before sorting: " + arrList);
        Collections.sort(arrList);
        System.out.println("Sorted elements of integer arraylist: " + arrList);
        
        
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Jyothi");
        strList.add("Aju");
        strList.add("Vedha");
        strList.add("Nandha");
        strList.add("Deva");
        
        System.out.println("Elements of string arraylist before sorting: " + strList);
        Collections.sort(strList);
        System.out.println("Sorted elements of string arrayist: " + strList);
    }
}
