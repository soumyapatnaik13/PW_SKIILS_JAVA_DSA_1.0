class Students{
    private String name;
    private int age;
    private int roll_num;

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setRoll(int roll_num){
        this.roll_num=roll_num;
    }
    public String getName(){
        return this.name;
    }
    public  int getAge(){
        return this.age;
    }
    public int getRoll(){
        return this.roll_num;
    }
    
}

public class test{
    // it follows encapsulation: biding data in to a single unit and data hiding
    public static void main(String[] args) {
        Students s1= new Students();
        s1.setName("rahul");
        s1.setAge(22);
        s1.setRoll(12);
        Students s2= new Students();
        s2.setName("neha");
        s2.setAge(21);
        s2.setRoll((11));
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getRoll());
        System.out.println();
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getRoll());


    }
}