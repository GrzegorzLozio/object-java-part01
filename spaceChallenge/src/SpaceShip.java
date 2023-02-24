public interface SpaceShip {
    default boolean launch(){
        return false;
    }
    default boolean land(){
        return false;
    }

    default boolean canCarry(Item item){

        return false;
    }
    default void carry(Item item){

    }
}
