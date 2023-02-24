public class Rocket implements SpaceShip{


    public boolean launch(){
        return true;
    }
    public boolean land(){
        return true;
    }

    public boolean canCarry(Item item) {
        if(U1.weight > item.weight) {
            return true;
        }else
            return false;

    }
    public void carry(Item item){

    }
}
