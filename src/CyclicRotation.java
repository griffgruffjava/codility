/**
 * Created by Finbar on 13/01/2017.
 */
public class CyclicRotation {
    public static void main(String[] args) {

        int A[] = new int[0];
        int A1[] = {3, 8, 9, 7, 6};
        int B[] = solution(A,3);
        System.out.println(B.toString());
    }

    public static int[] solution(int[] A, int K){
        if(A.length == 0){
            return A;
        }

        int startIndex;
        if(K>A.length ) {
            startIndex = K % A.length;
        }else {
            startIndex = K;
        }

        int[] movedArray = new int[A.length];

        for(int i = 0; i < A.length; i++){
            if(startIndex+i < A.length) {
                movedArray[startIndex + i] = A[i];
            } else {
                movedArray[(startIndex + i)% A.length] = A[i];
            }

        }

        return movedArray;
    }
}
