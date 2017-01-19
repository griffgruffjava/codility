import java.util.ArrayList;
import java.util.List;

/**
 * Created by Finbar on 11/01/2017.
 */
public class BinaryGap {
    public static void main(String[] args) {

        System.out.println(solution(20));

    }

    public static int solution(int N){
        String binaryString = Integer.toBinaryString(N);
        System.out.println(binaryString);
        List binaryList = new ArrayList();

        for(int x = 0; x < binaryString.length(); x++){
            binaryList.add(binaryString.charAt(x));
        }

        int maxGap = 0;

        while(binaryList.size() > 2){
            int rightOne = binaryList.lastIndexOf('1');
            binaryList = binaryList.subList(0, rightOne);
            int leftOne = binaryList.lastIndexOf('1');
            if(rightOne - leftOne > maxGap){
                maxGap = rightOne - leftOne - 1;
            }
        }
        return maxGap;
    }
}
