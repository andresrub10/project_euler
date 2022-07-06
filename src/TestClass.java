import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] A = new String[N];
        for (int i_A = 0; i_A < N; i_A++) {
            A[i_A] = br.readLine();
        }

        int out_ = findMessages(N, A);
        System.out.println(out_);

        wr.close();
        br.close();
    }

    static int findMessages(int N, String[] A) {
        // Write your code here
        int result = 0;
        System.out.println("N = " + N);
        String[] input = A[0].split(" ");
        ArrayList<String> alreadyAdded = new ArrayList<String>();
        for (int i = 0; i < input.length - 1; i++) {
            System.out.println("Input[" + i + "] = " + input[i]);
            for (int j = i + 1; j < input.length; j++) {
                if (!alreadyAdded.contains(input[i]) && !alreadyAdded.contains(input[j]) && isEncodedPair(input[i], input[j])) {
                    alreadyAdded.add(input[i]);
                    alreadyAdded.add(input[j]);
                    result++;
                }
            }
        }
        return result;

    }

    static String getEncodedPair(String a) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            output.appendCodePoint(97 + 122 - a.charAt(i));
        }

        return output.toString();
    }

    static boolean isEncodedPair(String a, String b) {
        return getEncodedPair(a).equals(b);
    }
}