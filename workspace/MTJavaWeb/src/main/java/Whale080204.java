class Whale080204 {
  String whaleSpecies;
  int whaleWeight;
  
  public Whale080204(String name, int weight) {
    whaleSpecies = name;
    whaleWeight = weight;
  }

  public String toString(){
    return "This is a " + whaleSpecies + " whale which weighs about " + whaleWeight + " pounds.";
  }
  
  public static void main(String[] args){
    Whale080204 whale1 = new Whale080204("narwhal", 2100);
    Whale080204 whale2 = new Whale080204("beluga", 3000);
    System.out.println(whale1);
    System.out.println(whale2);
  }
}