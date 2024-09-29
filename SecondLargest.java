public class SecondLargest {
    public static void main(String[] args) {
        int array[]={1,3,4,5,2,9,19,7,10};
        int largest=array[0];
        int SecondLargest=array[8];

        for(int num:array)
        {
            if(num>largest)
            {
                SecondLargest=largest;
                largest=num;
            
            }
            else if(num>SecondLargest && num!=largest)

                {
                    SecondLargest=num;
            }
        }
        System.out.println("Largest Element:"+largest+"\n"+"Second Largest:"+SecondLargest);

    }
}
