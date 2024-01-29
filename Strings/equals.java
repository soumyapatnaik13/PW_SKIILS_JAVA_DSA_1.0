public class equals {
    public static void main(String[] args) {
        String s="rahul";
        String v= "ra";
        String n=v+"hul";
        System.out.println(s==n);
        System.out.println(s.equals(n));
    }
}
// whenever we write == operator with string its cheack the adress while in equals() case it cheacks the indivisuls char