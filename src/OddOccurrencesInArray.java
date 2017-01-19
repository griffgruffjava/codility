import java.util.LinkedList;
import java.util.TreeMap;

/**
 * Created by Finbar on 13/01/2017.
 */
public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] array = {9,3,9,3,9,7,9};
        System.out.println(solution2(array));
    }

    public static int solution1(int[] array){
        LinkedList myArray = new LinkedList();
        for(int i:array){
            myArray.add(i);
        }

        while(myArray.size() > 0){
            int findingInt = (int)(myArray.pop());
            if(!myArray.removeFirstOccurrence(findingInt)){
                return findingInt;
            }
        }

        return -1;

    }

    public static int solution2(int[] array){
        TreeMap<Integer,Integer> arrayMap = new TreeMap<>();

        for(int i = 0; i < array.length; i++){
            arrayMap.put((Integer)i,0);
        }

        for(int i:array){
            arrayMap.put((Integer)i,arrayMap.get(i)+1);
        }

        for(int i = 0; i < array.length; i++){
            int keyNumber = arrayMap.get(i);
            if(keyNumber==1){
                return i;
            }
        }

        return -1;
    }
}
