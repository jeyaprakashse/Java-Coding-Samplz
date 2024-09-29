public class PairSum{
    public static void main(String[] args) {
        int array[]={2,3,1,3,4,1,3,6};
        int target=6;
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