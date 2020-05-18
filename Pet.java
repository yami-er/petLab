public class Pet {
    private String name, location , type;
    private int age;
    Pet(){
        this.name = "Captain D";
        this.age = 4;
        this.location= "Charlotte";
        this.type= "Goldenretriver";
      }
    Pet(String name, int age, String location, String type){
          this.name= name;
          this.age = age;
          this.location= location;
          this.type= type;
          
      }
      //get 
    public String getName(){
        return this.name;
    }
    public String getLocation(){
        return this.location;
    }
    public String getType(){
        return this.type;
    }
    public int getAge(){
        return this.age;
    }
//set
    public void setName(String newName) {
        this.name = newName;
      }
    public void setLocation(String newLocation){
        this.location = newLocation;
    }

    public void setType(){
        this.type = newType;
    }

    public void setAge(){
        this.age = newAge;
    }

}



