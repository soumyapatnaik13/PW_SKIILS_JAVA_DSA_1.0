public class returnTheRollNumber {
  public static void main(String[] args) {
    int [] students={67,23,56,89,22,45,12,56};
    findRollNumber(students);
  }  
  static void findRollNumber(int [] students){
    int passMark=35;
    for(int i=0;i<students.length;i++){
        if(students[i]<passMark){
            System.out.println("rollnumber is:"+i);
        }
    }
  }
}
//q. find the student roll number who have scored below 35
