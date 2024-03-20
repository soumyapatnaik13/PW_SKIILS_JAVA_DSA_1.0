/*
 create a plane which has some property 
 then passenger cargo and fighter plane will aquire all the value and override 
 then call each of the function via using the obj ref 
 but as the plane root class is the parents class and the child has IS-A relation so that create a another fun which
 will do all the task of the child 
 as this follow IS-A so that refernce can be pass of the parent type
 */
class plane{
    public void takeoff(){
        System.out.println("plane has takeoff");
    }
    public void fly(){
        System.out.println("plane will ready to fly");
    }
    public void land(){
        System.out.println("plane has landed");
    }
}
class passenger extends plane{
    public void takeoff(){
        System.out.println("passangeer plane has takeoff");
    }
    public void fly(){
        System.out.println("passanger plane will ready to fly");
    }
    public void land(){
        System.out.println("passanger plane has landed");
    }
}
class cargoplane extends plane{
    public void takeoff(){
        System.out.println("cargoplane has takeoff");
    }
    public void fly(){
        System.out.println("cargoplane will ready to fly");
    }
    public void land(){
        System.out.println("cargoplane has landed");
    }
}
class fighterplane extends plane{
    public void takeoff(){
        System.out.println("fighter plane has takeoff");
    }
    public void fly(){
        System.out.println("fighter plane will ready to fly");
    }
    public void land(){
        System.out.println("fighter plane has landed");
    }
}
class Allowpalane extends plane{
    public void display(plane p){
        p.takeoff();
        p.fly();
        p.land();
        System.out.println();
    }
}
public class UinformModellinglanguage {
    public static void main(String[] args) {
     plane p= new passenger();
     plane c= new cargoplane();
     plane f= new fighterplane();

     Allowpalane a= new Allowpalane();
     a.display(p);
     a.display(c);
     a.display(f);
     /*  c.takeoff();
      c.fly();
      c.land();
      System.out.println();
      plane p= new passenger();
      p.takeoff();
      p.fly();
      p.land();
      System.out.println();
      plane f= new fighterplane();
      f.takeoff();
      f.fly();
      f.land();
      // beacause parent class reference has the scope of every child class 
         rather than calling each func we create a fuction take the ref typ of the parent and do all the stuff
      */
    }
}
