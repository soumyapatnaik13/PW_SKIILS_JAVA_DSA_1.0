import java.util.HashSet;

public class customFunc{
    public static void main(String[] args) {
        HashSet<Integer>h= new HashSet<>();
        //set only stores unique element
        //with O(1) t/c 
        //insert
        h.add(10);
        h.add(200);
        h.add(30);
        h.add(40);
        h.add(1);
        //contains
        System.out.println(h.contains(200));
        //size
        System.out.println(h.size());
        //remove
        h.remove(1);
        //print => just write the ref type
        System.out.println(h);
        Object []n= h.toArray();
        for(int i=0;i<n.length;i++){
            System.out.print(n[i] + " ");
        }
    }
}