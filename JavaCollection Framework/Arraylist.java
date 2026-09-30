import java.util.ArrayList;
import java.util.Iterator;
public class Arraylist {
    public static  void main(String[] args){
        //list or collection -> interface

        //ArrayList -> concrete class

        //List<Integer> arr1 = new ArrayList<>();
        //Collection<Integer> arr2 = new ArrayList<>();


        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);
        arr.add(4);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
        
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(5);
        arr2.add(6);
        arr.addAll(arr2);
        System.out.println(arr);
        arr.removeAll(arr2);
        System.out.println(arr);
        //size of arraylist
        System.out.println(arr.size());

        //iterating over arraylist
       Iterator<Integer> iterator = arr.iterator();
       //hasNext() -> checks if there is a next element in the iterator
       //next() -> returns the next element in the iterator
       while(iterator.hasNext()){
        System.out.println(iterator.next());
       }

       ArrayList<Integer> arr3 = new ArrayList<>();
       arr3.add(1);
       arr3.add(2);
       arr3.add(3);
       arr3.add(4);
       //get() -> returns the element at the specified index
       System.out.println(arr3.get(3));
       //set() -> replaces the element at the specified index with the specified element
       arr3.set(0,6);
       System.out.println(arr3);

       //toArray() -> returns an array containing all of the elements in this list in proper sequence (from first to last element)
       Object[] arr4 = arr3.toArray();
       for(Object obj : arr4){
        System.out.println(obj);
       }

       //contains() -> returns true if this list contains the specified element
       System.out.println(arr3.contains(6));
    }
}
