package Oops;

public class Newbulidingopbject {

    public static void main(String[] args) {

        newBuilding dlf=new newBuilding();
        dlf.name="DLF builder";
        dlf.room_no=10;
        dlf.address="ABC";
        dlf.newaddress="local";
        dlf.roadname="parking";

        dlf.lift();
        dlf.activity();
        System.out.println("_____________");
        newBuilding prestige=new newBuilding();
            prestige.name="prestige building";
            prestige.room_no=20;
            prestige.address="some";

            prestige.lift();
            prestige.activity();


    }
}
