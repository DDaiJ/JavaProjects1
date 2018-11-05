package test;
import java.io.*;
import java.util.*;

public class testing {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        int[] canyons = inputValues();
        String result = flyThroughCanyons(canyons);
        if (result.equals("failure")) {
            System.out.println(result);
        } else {
            System.out.println(result + "out");
        }
        
    }
    
    public static int[] inputValues() throws NumberFormatException, IOException {
        List<Integer> arrlist = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int number = 0;

        while((input = br.readLine()) != null) {
            number = Integer.parseInt(input);
            arrlist.add(number);
        }
        
        int[] canyons = new int[arrlist.size()];
        for (int i = 0; i < arrlist.size(); i++) {
            canyons[i] = arrlist.get(i).intValue();
        }
        return canyons;
    }
    
    public static String flyThroughCanyons(int[] canyons) {
        StringBuilder sb = new StringBuilder();
        boolean canOut = true;
        
        if (canyons == null || canyons.length == 0) { return ""; }
        
        int start = 0, end = 0, max = 0;
        while (end < canyons.length && canOut) {
            if(start > max) { canOut = false; }
            
            sb.append(max + ", ");
            for (int i = start; i <= end; i++) {
                if (canyons[i] + i > max) {
                    max = canyons[i] + i;
                }
            }
            start = end + 1;
            end = max;
        }
        
        if (canOut) {
            return sb.toString();
        }
        return "failure";
    }
}
