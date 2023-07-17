public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Rook r = new Rook();
        r.moves();

        King k = new King();
        k.moves();
        
    }
}

interface ChessPlayer{
    abstract void moves();

}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Queens moves : up, down, right, diagonal (in all 4 dirns)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Rook moves : up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("King moves : up, down, left, right, diagonal (by 1 step) ");
    }
}
