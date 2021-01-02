public class Player  extends Monopoly{

    public int getLocation() {
        return Location;
    }

    public void setLocation(int location) {
        Location = location;
    }

    private int Location  = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name  = "";




     public Player(String name)
     {
     this.name = name;
     playerArrayList.add(this);
     }

     public void Dice()
     {
     int dice=(int)(Math.random()*6+1);
         System.out.println("---Dice  is " + dice);

     this.Location = this.Location + dice;

     if(this.Location % 10 == 0 )
     {
         System.out.println("---------The Location is "+this.getLocation()+ " it's divisible by 10 so Location is increasing 2 ");
         this.Location += 2;
         System.out.println("---------CurrentLocation is  now "+ this.getLocation());
     }
     else if ( isPrime(this.Location))
     {
         System.out.println("The Location is "+this.getLocation()+ " it's prime number so Location is decreasing 1");
         this.Location -=1;
         System.out.println("CurrentLocation is  now "+ this.getLocation());
     }






     }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }












}
