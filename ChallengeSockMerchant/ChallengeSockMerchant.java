import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ChallengeSockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        Integer[] a = new Integer[ar.length];
        for(int ctr = 0; ctr < ar.length; ctr++) {
            a[ctr] = Integer.valueOf(ar[ctr]); 
        }

        ArrayList<Integer> diffNum = new ArrayList<>();
        for(int i=0; i<ar.length; i++){
            if(!diffNum.contains(a[i])){
                diffNum.add(a[i]);
            }
        }

        int socks= 0;        
        for(int i=0; i<diffNum.size();i++){            
            int freq = Collections.frequency(Arrays.asList(a), diffNum.get(i));
            if (freq >= 2 ){
                int cant = freq/2;                
                socks = socks + cant;
            } 
        }
        return socks;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
