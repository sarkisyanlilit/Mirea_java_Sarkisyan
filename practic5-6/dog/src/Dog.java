
abstract  class Dog {
    public String name, breed;
    public int age;
    public void setBreed(String breed){
this.breed=breed;}
        public void setName(String name){
            this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName() { return name; }
    public String getBreed() { return breed; }
    public int getAge() { return age; }
    @Override
    public String toString(){

        return "Breed - "+this.breed
        +", the name is " +this.name
                +", age - "+this.age;
    }
}
