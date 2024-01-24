package Practice;

class Vehicle{
    String msg;
    Vehicle(){
        if(this instanceof Vehicle){
            msg="Land";
        }
        else if(this instanceof Ship){
            msg = "Water";
        }else if(this instanceof Aeroplane){
            msg = "Air";
        }
    }

    final void transport(){
        System.out.println(msg);
    }
}

class Ship extends Vehicle{

}

class Aeroplane extends Vehicle{

}
class Main{
    public static void main(String args[]){
       Vehicle s = new Vehicle();
       s.transport();

    }
}
