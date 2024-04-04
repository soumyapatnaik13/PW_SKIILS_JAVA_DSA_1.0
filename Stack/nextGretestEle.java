public class nextGretestEle {
    public static void main(String[] args) {
        int [] arr= {1,5,3,2,1,6,3,4};
        greatest(arr);
    }
  static void greatest(int [] arr){
     int [] res= new int[arr.length];
     int n=res.length;
     for(int i=n-1;i>=0;i--){
        int max=-1;
        for (int j = i; j < n; j++) {
            if (i != j) { //if i and is same then we need to skip that idx
                if ( arr[j] > arr[i]) {//cheack with the current value also
                    max = Math.max(max, arr[j]); // Update max value
                    break;
                }
            }
        }
        res[i]=max;
    }
     for(int k: res){
        System.out.println(k);
     }
     
  }
}
