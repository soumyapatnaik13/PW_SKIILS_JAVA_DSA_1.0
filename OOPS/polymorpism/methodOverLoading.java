class calculator{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(long a,long b,long c){
       System.out.println(a+b+c);
    }
    public void add(float a,float b){
        System.out.println(a+b);
    }
    /*
     * implicite type casting: byte,short,int,long,float,char
     * if one value has passed in the method if that method is not present then it will convert that into the next one
     * so in thet case of double it wont find any so it will give me the compile time erros
     */
  
}
public class methodOverLoading{
    public static void main(String[] args) {
        calculator c= new calculator();
        short a=1;
        short b=2;
        c.add(a+b, b);
        c.add(1,2,3);
        float d=21.5f;
        float e=20.8f;
        c.add(d,e);
        

    }
}