public class MazePath {
    public static void main(String[] args) {
        int [][] maze= new int[3][3];
        path(maze,0,0,"");
        
    }
    static void path(int [] [] maze,int row,int col,String s){
        if(row == maze.length-1 && col== maze.length-1){
            System.out.println(s);
            return;
        }
        if(row==maze.length || col==maze.length){
            return ;
        }
        path(maze,row+1,col,s+"D");
        path(maze,row,col+1,s+"R");
    
    }
}
