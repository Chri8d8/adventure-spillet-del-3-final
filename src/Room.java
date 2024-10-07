import java.util.ArrayList;

public class Room {
    private String name;
    private String roomDescription;
    private ArrayList<Item>items = null;
//    private ArrayList<Food>foods;

    private Room neighbourNorth,neighBourSouth,neighBourWest,neighBourEast;
    public Room(String name , String roomDescription ) {
        this.name = name;
        this.roomDescription = roomDescription;
        this.items = new ArrayList<>();
//        this.foods = new ArrayList<>();
    }

//    public ArrayList<Food> getFoods() {
//        return foods;
//    }

    public String getName() {
        return name;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public Room getNeighbourNorth() {
        return neighbourNorth;
    }

    public void setNeighbourNorth(Room neighbourNorth) {
        this.neighbourNorth = neighbourNorth;
    }

    public Room getNeighBourSouth() {
        return neighBourSouth;
    }

    public void setNeighBourSouth(Room neighBourSouth) {
        this.neighBourSouth = neighBourSouth;
    }

    public Room getNeighBourWest() {
        return neighBourWest;
    }

    public void setNeighBourWest(Room neighBourWest) {
        this.neighBourWest = neighBourWest;
    }

    public Room getNeighBourEast() {
        return neighBourEast;
    }
    public void addItem(Item item) {
        items.add(item);
    }
    public void remmoveIte(Item item) {
        items.remove(item);
    }


    public void setNeighBourEast(Room neighBourEast) {
        this.neighBourEast = neighBourEast;
    }
    public Item findItem(String itemName) {
        for (Item item : items) {
            if (item.getName().trim().equalsIgnoreCase(itemName)) {
                return item;
            }

        }
        return null;
    }

    public String getItemsDescription() {
        if (items.isEmpty()) {
            return "There are no items here.";
        }
        StringBuilder itemDesc = new StringBuilder("Items in this room: ");
        for (Item item : items) {
            itemDesc.append(item.getType()).append(" ,");
        }
        return itemDesc.toString();
    }
    @Override
    public String toString() {
        return name + " " + roomDescription;
    }

}
