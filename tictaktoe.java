import java.util.Scanner;
public class Main{
    static char[][] board={
            {'','',''}; 
            {'','',''}; 
            {'','',''}; 
    };
    static char currentplayer='x;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean gameover=false;
        while(!gameover){
            printBoard();
            System.out.println("player:"+currentpkayer +",enter row and column(0-2): ");
            int row=sc.nextInt();
            int col=sc.nextInt();
            if(board[row][col]==' '){
                board[row][col]=current player;
                if(checkin()){
                    printBoard();
                    System.out.println("player"+currentplayer+ "wins");
                    gameover=true;
                }else if(isBoatrdFull()){
                    printBoard();
                    System.out.println("it's a draw!");
                    gameover=true;
            }else{
                System.out.println("call already taken! try again:");
                }
            }
            sc.close()
        }
    }
}
static void printBoard(){
    System.out.println("________________");
    for(int i=0;i<=3;i+=){
        System.out.println("")
    }
}

   