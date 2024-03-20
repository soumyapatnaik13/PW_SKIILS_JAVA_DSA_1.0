 class parents{
    public void property(){
        System.out.println("lan+cash");
    }
     public void marry(){
        System.out.println("relative girls");
     }
}
class child extends parents{
    public void marry(){
        System.out.println("my choice");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        parents p = new parents();
        p.property();
        p.marry();
        child c= new child();
        c.property();
        c.marry();
        parents d= new child();
        d.marry();
    }
}
