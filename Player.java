package heartsjava.KidInASquid;

public class Player {
   Card[] hand, tricks;
   String name;
   int points;
   public Player(String s){
      name=s;
      points=0;
   }
   public String toString(){
      return name+ "\npts: "+points;
   }

}
