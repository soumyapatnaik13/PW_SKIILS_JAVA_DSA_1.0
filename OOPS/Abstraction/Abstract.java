/**
 * InnerAbstract
 */
 interface ICalculator {
  void add(int a,int b);
  void sub(int a,int b);
  void mul(int a,int b);
  void div(int a,int b);
}
class calculator implements ICalculator{
    public void add(int a, int b){
    System.out.println(a+b);
    }
    public void sub(int a, int b){
    System.out.println(a-b);
    }
    public void mul(int a, int b){
        System.out.println(a*b);
        }
   public void div(int a, int b){
      System.out.println(a/b);
            }
}
public class Abstract{
    public static void main(String[] args) {
        ICalculator i= new calculator();
        i.add(1,2);
        i.div(2,1);
        i.mul(3,2);
        i.div(3,3);

    }
}