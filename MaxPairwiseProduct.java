import java.util.*;
import java.io.*;


public class MaxPairwiseProduct {
   /* static int getMaxPairwiseProduct(int[] numbers) {
        int max_product = 0;
        int n = numbers.length;

        for (int first = 0; first < n; ++first) {
            for (int second = first + 1; second < n; ++second) {
                max_product = max(max_product,
                    numbers[first] * numbers[second]);
            }
        }

        return max_product;
    }*/
   /* 
	static long MaxPairwiseFast(int[] A){
		int in1 =0;
		int in2;
		for(int i =1; i<A.length;i++){
			if(A[i]>A[in1]){
				in1=i;
				}
			}
		if(in1==0)
			in2=1;
		else in2 =0;
		
		for(int i =1;i<A.length;i++){
			if(A[i]!=A[in1] && A[i]>A[in2])
				in2=i;
			}
		long res = (long)A[in1]*A[in2];
		return res;
		}
*/
public static long maxPairwiseProduct(int[] array){
		int n = array.length;
		Arrays.sort(array);
		return ((long)array[n-1]*(long)array[n-2]);
	}
	
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(maxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
