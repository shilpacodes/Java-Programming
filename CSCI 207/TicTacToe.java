import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args){
        int row = 0;
        int column = 0;
        char [][] game = {{'_', '_', '_'}, {'_','_', '_'}, {'_', '_', '_'}};
        boolean win = false;

        Scanner player1 = new Scanner(System.in);
        Scanner player2 = new Scanner(System.in);
         print(game);
        while(win == false){
            System.out.println("Player 1");
            System.out.println("Enter a row value");
            row = player1.nextInt();
            System.out.println("Enter a column value");
            column = player1.nextInt();
            game = turn1(game, row, column);
            print(game);
            win = check(game);
            if(win == true){
            System.out.println("Player 1 Wins!!!");
            break;
            
            }
            System.out.println("Player 2");
            System.out.println("Enter a row value");
            row = player1.nextInt();
            System.out.println("Enter a column value");
            column = player2.nextInt();
            game = turn2(game, row, column);
            print(game);
            win = check(game);
            if(win ==true)
            System.out.println("Player 2 Wins!!!");
        }
       }
    

    public static boolean check(char[][] game1){
      
        if(game1[0][0]==game1[0][1] && game1[0][1]==game1[0][2] && (game1[0][2]=='X'||game1[0][2]=='O')){
             return true;
        }
        else if ((game1[1][0]==game1[1][1]) && (game1[1][1]==game1[1][2])&& (game1[1][2]=='X'||game1[1][2]=='O')){
            return true;
        }
        else if((game1[2][0]==game1[2][1]) && (game1[2][1]==game1[2][2])&& (game1[2][2]=='X'||game1[2][2]=='O')){
            return true;
        }
        else if((game1[0][0]==game1[1][0]) && (game1[1][0]==game1[2][0])&& (game1[2][0]=='X'||game1[2][0]=='O')){
            return true;
        }
        else if((game1[0][1]==game1[1][1])&&(game1[1][1]==game1[1][2])&& (game1[1][2]=='X'||game1[1][2]=='O')){
            return true;
        }
        else if((game1[0][2]==game1[1][2])&&(game1[1][2]==game1[2][2])&& (game1[2][2]=='X'||game1[2][2]=='O')){
            return true;
        }
        else if((game1[0][0]==game1[1][1])&&(game1[1][1]==game1[2][2])&& (game1[2][2]=='X'||game1[2][2]=='O')){
            return true;
        }
        else if((game1[0][2]==game1[1][1])&&(game1[1][1]==game1[2][0])&& (game1[2][0]=='X'||game1[2][0]=='O')){
            return true;
        }
        else{
        return false;
        }

    }

    public static char[][] turn1 (char[][] game, int row, int column){
        game[row][column]= 'X';
        return game;
    }

    public static char[][] turn2 (char[][] game, int row, int column){
        game[row][column]= 'O';
        return game;
    }

    public static void print(char[][] game){
        for(int i = 0; i < game.length; i++){
            for(int k = 0; k < game[i].length; k++){
                System.out.print(game[i][k]+" ");
            }
            System.out.print("\n");
        }
    }


}