public class Holiday {
  private String name;
  private String location;
  private int price;
   
  
  Holiday (){
      this.name = "Sychells";
      this.location = "Africa";
      this.price = 2000;
      
   }
   Holiday (String name, String location, int price){
    this.name = name;
    this.location = location;
    this.price = price;
 }
   Holiday (String name, String location){
    this.name = name;
    this.location = location;
   
 }

    public boolean isExpensive(){
        if (this.price > 1000){
            return true;
        }else{
            return false;
        }
      

    }
    public String address(){
        return this.name+", "+ this.location;
    }

    public String getName(){
        return this.name;
    }
    public String getLocation(){
        return this.location;
    }
    public int getPrice(){
        return this.price;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setLocation(String newLocation){
        this.location = newLocation;
    }
    public void setLocation(int newPrice){
        this.price = newProce;
    }


}