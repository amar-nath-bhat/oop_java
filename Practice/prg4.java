package Practice;

class Game{
    void type(){
        System.out.println("Indoor and Outdoor Games");
    }
}

class Cricket extends Game{
    void type(){
        System.out.println("Cricket is an Outdoor Game");
    }
}

class Chess extends Game{
    void type(){
        System.out.println("Chess is an Indoor Game");
    }
}

public class prg4 {
    public static void main(String[] args) {
        Game a = new Game();
        Cricket b = new Cricket();
        Chess c = new Chess();
        a.type();
        a = b;
        a.type();
        a = c;
        a.type();
        

    }
}
