class Account{//it acts like a schema 
 private double balance;//  attributes
 //in order to store the balance in the user account
 public void setBalance(double balance){
    //use authentication
    Boolean result= validate("rahul", "viratKohli");
    if(result){
        this.balance=this.balance+balance;
        System.out.println("set balanced to your account");
    }
    else{
        System.out.println("enter valid user name && password");
    }
 }
  public void getBalance(double balance){
    Boolean result= validate("rahul", "viratKohli");
    if(result){
      if(this.balance>balance){
        this.balance=this.balance-balance;
       System.out.println("balance has been deducted from your account");
      }
      else{
        System.out.println("you dont have that much money in your account");
      }
    }
  }
   public void cheackBalance(double balance){
    Boolean result= validate("rahul", "viratKohli");
    if(result){
        System.out.println("current balance is "+ this.balance);
    }
    else{
        System.out.println("enter valid user name && password");
    }
   }
 private Boolean validate(String name,String password){
   return name.equals("rahul") && password.equals(("viratKohli"));
 }
}

class test{
  public static void main(String[] args) {
     Account a1= new Account();
     a1.setBalance(1000.00);
     a1.getBalance(50);
     a1.cheackBalance(0);
  }
}