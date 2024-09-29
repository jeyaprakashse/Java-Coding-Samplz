public class MaxElement
{
    public static void main(String[] args) {
        int [] array={1,4,3,5,0,8};
        int max =array[0];
        for (int i=1;i<array.length;i++)
        {
           if( array[i] > max)
           {
            max=array[i];
           }
        }
        System.out.println("Maximum Element :"+max);
    }
}