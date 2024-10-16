import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        HashMap<String, String> myHashMap = new HashMap<>();

        myHashMap.put("key1", "value1");
        myHashMap.put(null, "value2");

        // Adding a value with an existing key
        myHashMap.put(null, "new_value1");

        System.out.println(myHashMap);

        for(String i:myHashMap.values()){
            System.out.println(myHashMap.containsValue(i));
        }
        for(String i:myHashMap.keySet()){
            System.out.println(myHashMap.containsKey(i));

    }
}
}

/*HashMap uses the hashCode() method to compute the hash of the key. 
The hash is then modded by the number of buckets (default initial capacity is 16) to determine which bucket the entry should go into.
If two keys have the same hashcode but are not equal (a rare occurrence), this is called a hash collision. 
The entries will be placed in the same bucket, and the HashMap will handle this using a linked list to chain the entries.
If two keys have different hash codes, they go into different buckets.

bucketIndex = hashCode(key) % numberOfBuckets;

*/