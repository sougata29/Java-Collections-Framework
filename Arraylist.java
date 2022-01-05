import java.util.ArrayList;
import java.util.List;
public class Arraylist{
    public static void main(String[] args){
        List<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(3);
        array.add(1);
        array.add(6);
        System.out.println(array);
        array.add(2,23);
        System.out.println(array);
        List<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(21);
        array.addAll(arr);
        array.remove(3);
        array.remove(Integer.valueOf(2));
        System.out.println(array);
        System.out.println(array.contains(21));
        for(int i = 0; i < array.size(); i++){
            System.out.println("elements of the array are:"+ array.get(i));
        }
    }
}