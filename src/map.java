import java.util.ArrayList;

public class map {
    private Room currentRoom;





    map() {
        buildMap();
    }

    public void buildMap() {
        ArrayList<Item> itemArrayList = new ArrayList<>();
//        ArrayList<Item> room1Item = new ArrayList<>();
//        ArrayList<Item> room2Item = new ArrayList<>();
//        ArrayList<Item> room3Item = new ArrayList<>();
//        ArrayList<Item> room4Item = new ArrayList<>();
//        ArrayList<Item> room5Item = new ArrayList<>();
//        ArrayList<Item> room6Item = new ArrayList<>();
//        ArrayList<Item> room7Item = new ArrayList<>();
//        ArrayList<Item> room8Item = new ArrayList<>();
//        ArrayList<Item> room9Item = new ArrayList<>();

//        ArrayList<Food> foodArrayList = new ArrayList<>();
//        ArrayList<Food> room1Food = new ArrayList<>();
//        ArrayList<Food> room2Food = new ArrayList<>();
//        ArrayList<Food> room3Food = new ArrayList<>();
//        ArrayList<Food> room4Food = new ArrayList<>();
//        ArrayList<Food> room5Food = new ArrayList<>();
//        ArrayList<Food> room6Food = new ArrayList<>();
//        ArrayList<Food> room7Food = new ArrayList<>();
//        ArrayList<Food> room8Food = new ArrayList<>();
//        ArrayList<Food> room9Food = new ArrayList<>();


        Room room1 = new Room("room1 " , "This room is empty,but there are two big doors. " );
        Item item1 = new Item("swond" , "wapend");
        Food food1 = new Food("Stake" , "meet" , 30);
        MeleeWeapon meleeWeapon1 = new MeleeWeapon("axe " , "melee");
        room1.addItem(meleeWeapon1);
//        room1Food.add(food1);
//        room1Item.add(item1);
        room1.addItem(item1);
        room1.addItem(food1);
//        itemArrayList.add(item1);
//        itemArrayList.add(food1);

        Room room2 = new Room("room2 " , "This is a quiet library. " );
        Item item2 = new Item("abe" , "dyr");
        Food food2 = new Food("rotten flesh " , "meet" , -20);
//        Item food2 = new Food("rotten flesh " , "meet" , -20);
//        room2Food.add(food2);
//        room2Item.add(item2);
        room2.addItem(item2);
        room2.addItem(food2);
//        foodArrayList.add(food2);
//        itemArrayList.add(food2);
//        itemArrayList.add(item2);
//       room2Item.add(item2);
//       room2Item.add(food2);


        Room room3 = new Room("room3 " , "You are in a bright room with large windows. " );
        Item item3 = new Item("book" , "k");
        Food food3 = new Food("Iscreem" , "sweet" , 15 );
//        room3Food.add(food3);
//        room3Item.add(item3);
        room3.addItem(item3);
        room3.addItem(food3);
//        itemArrayList.add(food3);
//        itemArrayList.add(item3);

        Room room4 = new Room("room4 " , "A damp cave with dripping water. "  );
        Item item4 = new Item("able" , " men");
        Food food4 = new Food("pink water " , "drink" , -40);
//        room4Food.add(food4);
//        room4Item.add(item4);
        room4.addItem(item4);
        room4.addItem(food4);
//        itemArrayList.add(item4);
//        itemArrayList.add(food4);


        Room room5 = new Room("room5 " , "A mystical room with strange symbols. "  );
        Item item5 = new Item("soup" , "post");
        Food food5 = new Food("te ", "drink " , 25);
//        room5Food.add(food5);
//        room5Item.add(item5);
        room5.addItem(item5);
        room5.addItem(food5);
//        itemArrayList.add(item5);
//        itemArrayList.add(food5);


        Room room6 = new Room("room6 ", "An empty room with an old chair. " );
        Item item6 = new Item("gman" ,"koma");
        Food food6 = new Food("k " , "meet " , 20);
//        room6Item.add(item6);
//        room6Food.add(food6);
        room6.addItem(item6);
        room6.addItem(food6);
//        itemArrayList.add(item6);
//        itemArrayList.add(food6);

        Room room7 = new Room("room7 " , "A dark room with no visible exits. " );
        Item item7 = new Item("bo" , "kurt");
        Food food7 = new Food("a " , "drink " , 15);
//        room7Item.add(item7);
//        room7Food.add(food7);
        room7.addItem(item7);
        room7.addItem(food7);
//        itemArrayList.add(item7);
//        itemArrayList.add(food7);

        Room room8 = new Room("room8 " , "A dimly lit room with a flickering lantern. " );
        Item item8 = new Item("pop" , " mine ");
        Food food8 = new Food("y " , "meet" , -30);
//        room8Food.add(food8);
//        room8Item.add(item8);
        room8.addItem(item8);
        room8.addItem(food8);
//        itemArrayList.add(item8);
//        itemArrayList.add(food8);

        Room room9 = new Room("room9 " , "A cold, quiet room with stone walls. " );
        Item item9 = new Item("tor " , " ls" );
        Food food9 = new Food("q " , "drink" , -25);
//        room9Food.add(food9);
//        room9Item.add(item9);
        room9.addItem(item9);
        room9.addItem(food9);
//        itemArrayList.add(item9);
//        itemArrayList.add(food9);


        room1.setNeighBourEast(room2);
        room1.setNeighBourSouth(room4);

        room2.setNeighBourEast(room3);
        room2.setNeighBourWest(room1);

        room3.setNeighBourSouth(room6);
        room3.setNeighBourWest(room2);

        room4.setNeighBourSouth(room7);
        room4.setNeighbourNorth(room1);

        room5.setNeighBourSouth(room8);

        room6.setNeighbourNorth(room3);
        room6.setNeighBourSouth(room9);

        room7.setNeighbourNorth(room4);
        room7.setNeighBourEast(room8);

        room8.setNeighbourNorth(room5);
        room8.setNeighBourWest(room7);
        room8.setNeighBourEast(room9);

        room9.setNeighbourNorth(room6);
        room9.setNeighBourWest(room8);

        currentRoom = room1;

    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

}
