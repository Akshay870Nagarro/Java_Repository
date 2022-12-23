package Question_2;
import java.io.*;
import java.io.IOException;
import java.util.HashMap;



// Main class
public class FrequencyReader{



   // Main driver method
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\akshaykumar07\\eclipse-workspace\\Java_Assignment\\src\\Question_2//Akshay.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        st = br.readLine();
        System.out.println(st);
    



   char[] arr = st.toCharArray();
    HashMap<Character,Integer> hMap = new HashMap<>();
    
    for(int i = 0;i<arr.length;i++)
    {
        if (hMap.containsKey(arr[i])) {
            int count = hMap.get(arr[i]);
            
            hMap.put(arr[i],count + 1);
        } else {
            hMap.put(arr[i], 1);
        }
    }
    System.out.println(hMap);
}}