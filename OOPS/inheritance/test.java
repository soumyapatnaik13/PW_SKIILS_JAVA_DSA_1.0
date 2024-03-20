class person{
    String name;
    int age;
}
class students extends person{
    int rollnum;
    String company;
    students(String name,int age,int rollnum,String company){
        this.name=name;
        this.age=age;
        this.rollnum=rollnum;
        this.company=company;
    }
    void display(){
        System.out.println("name is"+ name);
        System.out.println("age is "+ age);
        System.out.println("roll num is "+ rollnum);
        System.out.println("company is "+ company);
    }
}
public class test{
    public static void main(String[] args) {
       students s1=new students("Rahul", 22, 12,"capgemini");
       students s2= new students("neha", 21, 11, "accenture");
       System.out.println(s1.age);
       s1.display();
       s2.display();

    }
}