public class FindArrayaar{
    public static void main(String[] args) {

    int[] num={10,20,60,40,20};
    int target=20;
    int arr= findArray(num,30);
    
    System.out.println(arr);
    }
    public static int findArray(int [] array,int target)
    {
        for (int i = 0; i < array.length; i++) {
            int element=array[i];
            if(element==target)
            {
                return i;
            }
            
        }
        return -1;
    }
}