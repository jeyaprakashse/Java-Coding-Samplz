public class PairSum{
    public static void main(String[] args) {
        int array[]={1,19,3,4,1,8,2,0};
        int target=7;
        for(int i=0;i<array.length;i++)
        {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]+array[j]==target)
                {
                    System.out.println("pair("+array[i]+","+array[j]+")");
                }
            }
        }
    }
}