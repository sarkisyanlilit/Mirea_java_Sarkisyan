package furnitures;
abstract class Furniture {
    public String color;
    public String name;
    public int cost;
    public void setRoom(String color){
        this.color=color;
    }
    public void setName(String name){
        this.name=name; }
    public void setCost(int cost){
        this.cost=cost; }
    public String getRoom(){return color;}
    public String getName(){return name;}
    public int getCost(){return cost;}
    @Override
            public String toString()
    {
        return this.color + " " +this.name + ", "+
                "цена - " + this.cost;
    }

}
