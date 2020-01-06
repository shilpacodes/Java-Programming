import java.util.Scanner;
import java.util.Random;
public class MineWalker{
  static int posR = 0;
  static int posC = 0;
  
  public static void main (String [] args){
  int turn = 0;
  boolean check = false;
  boolean win = false;
    char [][] board = new char [5][10];
    for(int i = 0; i< board.length; i++){
        for(int k = 0; k < board[i].length; k++){
            board[i][k]= '_';
        }
    }
    board[0][0]= 'X';
    board[4][9]= '^';
    print(board);

    Random num = new Random();
     int row1 = num.nextInt(4);
     int column1 = num.nextInt(9);
     int row2 = num.nextInt(4);
     int column2 = num.nextInt(9);
     int row3 = num.nextInt(4);
     int column3 = num.nextInt(9);
    
    Scanner input = new Scanner (System.in);
        while(win == false){
            System.out.println("Enter -1, 1, 2, or -2");
            turn = input.nextInt();
            board = move(board, turn);
            check = isMine(row1, row2, row3, column1, column2, column3);
                if(check){
                    System.out.println(1);
                break;
                }
            print(board);
            win = isWin();
        }
        if(win == true){
         System.out.println("Congratulations, you have won!!");
        }
  }

   public static boolean isMine(int row1, int row2, int row3, int column1, int column2, int column3){
     
       if((posR == row1 && posC == column1) || (posR == row2 && posC == column2 )|| (posR == row3 &&posC == column3)){
           System.out.println("You stepped on a mine!!");
           return true;
       }
       else
       return false;
   } 

   public static void print(char [][] board){
       for(int i = 0; i < board.length; i++){
           for(int k = 0; k < board[i].length; k ++){
               System.out.print(board[i][k]+" ");
           }
           System.out.print("\n");
       }
   }

   public static char [][] move(char[][] board, int i){
  
       if(i == 1){
          board [posR][posC] = '_';
          posR+=1;
          board[posR][posC] = 'X';
           
       }
       else if(i == -1){
           board [posR][posC] = '_';
           posR-=1;          
           board[posR][posC] = 'X';
           
       }
       else if(i == 2){
           board [posR][posC] = '_';
           posC +=1;
           board[posR][posC] = 'X';
           
       }
       else if(i == -2){
            board [posR][posC] = '_';
            posC -=1;
            board[posR][posC] = 'X';
                 }
       return board;
   }
   
   public static boolean isWin(){
       if(posR == 4 && posC == 9){
           return true;
       }
       else
       return false;
   }
      


}