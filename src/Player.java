import java.util.ArrayList;

public class Player {
    Room placement;
    ArrayList<Item> inventory = new ArrayList<>();
    private int playerHealth = 100;
    //    ArrayList<Food> foods;
    private Weapon equippedWeapon;

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public Player(Room placement) {
        this.placement = placement;
        this.inventory = new ArrayList<>();
//        this.playerHealth = getPlayerHealth();
//        this.foods = new ArrayList<>();

    }

//    public ArrayList<Food> getFoods() {
//        return foods;
//    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void increaseHealth(int healthIncrease) {
        this.playerHealth += healthIncrease;
    }

    public void decreaseHealth(int healthDecrease) {
        this.playerHealth -= healthDecrease;
    }
    public FoodStatus eat(String foodName) {
        Item itemToEat = findItemInInventory(foodName);
        if (itemToEat == null) {
            itemToEat = placement.findItem(foodName);
            if (itemToEat == null) {
                return FoodStatus.NOT_HERE;
            }
        }
        if (itemToEat instanceof Food) {
            Food food = (Food) itemToEat;
            if (food.getHealthPoints() > 0) {
                increaseHealth(food.getHealthPoints());
                inventory.remove(food);
                placement.remmoveIte(food);
                return FoodStatus.GOOD;
            } else if (food.getHealthPoints() < 0) {
                decreaseHealth(- food.getHealthPoints());
                inventory.remove(food);
                placement.remmoveIte(food);
                return FoodStatus.BAD;
            }
        }
        return FoodStatus.NOT_FOOD;

    }


    //        public void eatItem(String food) {
//        for (Item it : getPlacement().getFoods()) {
//            if (it.getName().toLowerCase().equals(food)) {
//                if (it instanceof Food) {
//                    this.increaseHealth(it.getHealthPoint());
//                }
//            }
//        }
//    }
    public Room getPlacement() {
        return placement;
    }

    public void setPlacement(Room placement) {
        this.placement = placement;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }
    public void addItem(Item item) {
        inventory.add(item);
    }
    public void dropItem(Item item) {
        inventory.remove(item);
    }
//    public void addFood(Food food) {
//        foods.add(food);
//    }




    public Room move(String movement) {
        if (movement.equalsIgnoreCase("go north")&&
                placement.getNeighbourNorth()!= null) {
            placement = placement.getNeighbourNorth();
        } else if (movement.equalsIgnoreCase("go south") &&
                placement.getNeighBourSouth() != null) {
            placement = placement.getNeighBourSouth();
        } else if (movement.equalsIgnoreCase("go west") &&
                placement.getNeighBourWest() != null) {
            placement = placement.getNeighBourWest();
        } else if (movement.equalsIgnoreCase("go east") &&
                placement.getNeighBourEast() != null) {
            placement = placement.getNeighBourEast();
        } else {
            return null;
        }
        return placement;
    }

    public Item findItemInInventory(String itemName) {
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName)  || item.getType().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }
    public String getInventoryDescription() {
        if (inventory.isEmpty()) {
            return "You are not carrying any items.";
        }
        StringBuilder invDesc = new StringBuilder("You are carrying: ");
        for (Item item : inventory) {
            invDesc.append(item.getName()).append(",");
            invDesc.append(item.getType()).append(",");
        }
        return invDesc.toString();
    }


    public String takeItem(String itemName) {
        Item foundItem = placement.findItem(itemName);

        if (foundItem != null) {
            inventory.add(foundItem);
            placement.remmoveIte(foundItem);
            return "You took the " + foundItem.getType();
        } else {
            return "There is no " + itemName + " here.";
        }

    }
    public String dropItem(String itemName) {
        Item foundItem = findItemInInventory(itemName);

        if (foundItem != null) {
            inventory.remove(foundItem);
            placement.addItem(foundItem);
            return "You dropped the " + foundItem.getName();
        } else {
            return "There is no " + itemName + " in your inventory";

        }
    }
    public void equip(String weaponName) {
        Item item = findItemInInventory(weaponName);
        if (item == null) {
            System.out.println("Du har ikke sådan et våben.");
        } else if (!(item instanceof Weapon)) {
            System.out.println(item.getName() + " er ikke et våben.");
        } else {
            equippedWeapon = (Weapon) item;
            System.out.println("Du har nu udstyret " + equippedWeapon.getName() + ".");
        }
    }
    public void attack() {
        if (equippedWeapon == null) {
            System.out.println("Du har ikke udstyret noget våben.");
        } else if (!equippedWeapon.canUse()) {
            System.out.println("Dit våben " + equippedWeapon.getName() + " kan ikke bruges.");
        } else {
            equippedWeapon.use();
        }
    }
    public void showInventory() {
        System.out.println("Du bærer på følgende ting:");
        for (Item item : inventory) {
            System.out.println(item.getName());
        }

        if (equippedWeapon != null) {
            System.out.println("Udstyret våben: " + equippedWeapon.getName());
        } else {
            System.out.println("Du har ikke udstyret noget våben.");
        }
    }


}
