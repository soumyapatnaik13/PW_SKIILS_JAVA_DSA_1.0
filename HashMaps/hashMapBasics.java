import java.util.HashMap;

public class hashMapBasics {
    public static void main(String[] args) {
     //it stores the value in pairs
     HashMap<String,Integer> h= new HashMap<>();
    // to insert key,value
    h.put("rahul", 1);
    h.put("sahil",2);
    h.put("virat",3);
    h.put("anushka",4);
    //to get that value of that key
    System.out.println(h.get("virat"));
    /*
     * get,size,remove,contains key,containsvalue
     */
    // to iterarte over the hashmap we use keyset() which contains all the (key,val) pair
    //but via keyset() we can get the key and by using get method we can get that particular value
    for(String s:h.keySet()){
        System.out.print("key"+ "=>"+ s + " ") ;
        System.out.print("value"+ "=>"+ h.get(s));
        System.out.println();
    }
    //to print value
    for(int val:h.values()){
        System.out.println(val+" ");
    }
    System.out.println();

    // for print the pair
    for(Object pair:h.entrySet()){
        System.out.println(pair);
    }
    }
}
