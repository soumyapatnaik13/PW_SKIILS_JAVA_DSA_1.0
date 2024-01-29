public class findTheSecondlargest {
public static void main(String[] args) {
    String s="123456789";
   int ans= secondLargest(s);
   System.out.println(ans);
}
static int  secondLargest(String s){
 int n=s.length();
 int largest=0;
 int secondlargest=0;
 
 for(int i=0;i<n;i++){
    char c=s.charAt(i);
    int num=(int)c;
    int asci= num-48;
    if(asci > largest){
        secondlargest=largest;
        largest=asci;
    }
    else if(asci > secondlargest && asci < largest  ){
        secondlargest=asci;
    }
 }
 return secondlargest;
}
}
