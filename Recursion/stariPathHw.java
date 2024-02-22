public class stariPathHw {
    public static void main(String[] args) {
    int num=5;
    int ans= path(num);
    System.out.println(ans);
}
static int path(int num){
    if(num==1){
        return 1;
    }
    if(num==3){
        return 2;
    }
    if(num<0){
        return 0;
    }
    return path(num-1)+ path(num-3);
}
}