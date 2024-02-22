public class BinaryString {
    public static void main(String[] args) {
        //q: print all the binay string where n=4
        //intution: 2 to the power n which is 16 but no consequtive 1 will print together
        int n=4;
        String s="";
        printElement(s,n);
    }
    static void printElement(String s,int n){
       
        if(s.length()==n){
            System.out.println(s);
            return;
        }
        printElement(s+"0",n);
        if(s.isEmpty() || s.charAt(s.length()-1)=='0'){
        printElement(s+"1", n);
        }
    }
}
