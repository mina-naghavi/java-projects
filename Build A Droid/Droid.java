public class Droid{
  String name;
  int batteryLevel;

  // constructor method
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }

  // perform a task method
  public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    batteryLevel -= 10;
  }

  // state the battery level method
  public void energyReport(){
    System.out.println(batteryLevel);
  }

  // toString method
  public String toString(){
    return "Hello, I’m the droid: " + name;
  }


  // main method
  public static void main(String[] args){
    Droid codey = new Droid("Codey");
    System.out.println(codey);
    codey.performTask("dancing");
    codey.energyReport();
    codey.performTask("walking");
    codey.performTask("squating");
    codey.energyReport();
    
  }
}
