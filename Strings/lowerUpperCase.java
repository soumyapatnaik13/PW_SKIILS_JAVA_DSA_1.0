public class lowerUpperCase {
    public static void main(String[] args) {
        String  s= "I AM RAHUL";
        //String are immutable so any method apply to the string the original string wont change
        String n=s.toLowerCase(); // so it will Asci of capital letter - ASCI of small letter
        System.out.println(n);
        String u= n.toUpperCase();
        System.out.println(u);
    }
}
