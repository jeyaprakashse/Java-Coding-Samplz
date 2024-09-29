
import java.util.HashMap;

public class PairSumHash {
    public static void main(String[] args) {
        int array[]={1,19,3,4,1,8,2,0};
        int target= 7;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int num:array)
        {
            int complement =target-num;
            if(map.containsKey(complement))
            {
                System.out.println("pair("+complement+","+num+")");
            }
            map.put(num, 1);
        }

    }
}
