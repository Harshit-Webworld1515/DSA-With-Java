public class InterfaceOops {
    public static void main(String[] args) {
        Queen qu=new Queen();
        qu.moves();
    }
}
interface Chessplayer{
    void moves();
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonally");

    }
}
class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class King implements Chessplayer{
    public void moves(){
        System.out.println("one step in all 4 direction");
    }
}
