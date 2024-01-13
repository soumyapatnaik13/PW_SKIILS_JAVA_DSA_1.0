public class CalculateTheSum {
    public static void main(String[] args) {
        int [] arr={67,23,56,89,22,45,12,56};
        int count= 0;
        int ans=sum(arr,count);
        System.out.println(ans);
    }
    static int sum(int [] arr,int count){
        for(int i=0;i<arr.length;i++){
            count+=arr[i];
        }

        return count;
    }

}
