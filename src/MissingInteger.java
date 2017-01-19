import java.util.HashSet;

/**
 * Created by t00175569 on 17/01/2017.
 *
 Write a function:

 int solution(int A[], int N);
 that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0) that does not occur in A.

 For example, given:

 A[0] = 1
 A[1] = 3
 A[2] = 6
 A[3] = 4
 A[4] = 1
 A[5] = 2
 the function should return 5.

 Assume that:

 N is an integer within the range [1..100,000];
 each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 Complexity:

 expected worst-case time complexity is O(N);
 expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 Elements of input arrays can be modified.
 *
 *
 *
 */
public class MissingInteger {
    public static void main(String[] args) {
        int[] A = {-1, -3, -6, -4, 1, 2};
        System.out.println(solution(A));
    }

    public static int solution(int A[]){
        HashSet hashA = new HashSet();

        for(int i : A){
            if(!hashA.contains(i) && i>0) {
                hashA.add(i);
            }
        }

        for(int i = 1; i <= hashA.size()+1; i++){
            if(!hashA.contains(i)){
                return i;
            }
        }

        return 1;
    }
}
