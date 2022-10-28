import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1_Anagrams {
    public static void main(String[] args) {
        String str = "abba";
        int len = str.length();
        HashMap<String,Integer> resultmap = new HashMap<>();
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len-i+1;j++)
            {
                String substr = str.substring(i,i+j);
                int count = 0;
                substr = sortString(substr);
                if(resultmap.containsKey(substr))
                        count = resultmap.get(substr);
                resultmap.put(substr,++count);
            }
        }
        for(Map.Entry<String,Integer> map : resultmap.entrySet())
        {
            String tempstr = map.getKey();
            if(map.getValue() >= 2) {
                System.out.println(tempstr);
            }
        }
    }

    public static String sortString(String input)
    {
        String output = "";
        char[] chararr = input.toCharArray();
        Arrays.sort(chararr);
        for(char x: chararr)
        {
            output = output +  x;
        }
return output;
    }
}
