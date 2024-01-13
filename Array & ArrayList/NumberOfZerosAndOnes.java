import java.util.Arrays;
/*
 * approach: take count of number of one and zeroes in the array
 * for loop will goes from zero untill index 0
 * then replace all the value with 0
 * after that length - num of zero= num of one
 * 
 */
public class NumberOfZerosAndOnes {
    public static void main(String[] args) {
        //Method
        //sort the number of zeros and ones
        int [] arr={1,0,1,0,0,1,1,1,0,1}; // ans {0,0,0,0,1,1,1,1,1};
        findNumber(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void findNumber(int [] arr){
        int num1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                num1++;
            }
        }
        int numofzero=arr.length-num1; //this gives me the number of one in zero in that array
        for(int i=0;i<arr.length;i++){
            if(i<numofzero){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        
    }
}
