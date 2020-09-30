public abstract class  Dish {
    public String material, type;
    public int cost;

    public void setMaterial(String material){
        this.material=material;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setCost(int cost){
        this.cost=cost;
    }
    public String getMaterial(){return material;}
    public String getType(){return type;}
    public int getCost(){return cost;}

    @Override
    public String toString(){
        return "material - "+this.material
                +", type - " + this.type
                +", cost = "+this.cost;
    }

}
