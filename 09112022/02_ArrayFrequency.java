import java.util.*;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 2, 1, -1, 1, 2, 0, 4, -1, 4};
        int[] out = new int[arr.length];
        HashMap<Integer,Integer> map  = new HashMap<>();
        int p=0;
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        System.out.println(map);
        List<Map.Entry<Integer,Integer>> maplist = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());

        Collections.sort(maplist,new Comparator<Map.Entry<Integer,Integer>>()
        {
        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
        {
            if(o2.getValue().compareTo(o1.getValue()) ==0)
                return o1.getKey().compareTo(o2.getKey());
            return o2.getValue().compareTo(o1.getValue());
        }
    });

        for(Map.Entry<Integer,Integer> item : maplist )
        {
            for(int i = 0;i<item.getValue();i++) {
                out[p++] = item.getKey();
}
        }
System.out.println(Arrays.toString(out));
}
}
