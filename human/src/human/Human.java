
package human;


public class Human {

    private String skincolor = "light brown";
    private String eyecolor = "dark brown";
    private char gender = 'm';
    private int height = 6;
    private int weight = 75;
    private int age = 21;
    private String race = "Asian";
    private String name = "Marionne Parrenas";
    
    public int intelligencerating = 80;
    public int moodrating = 9;
    public String[] gendis = {"TB, Pneumonia"};
    public int wealthrate = 2;
            
    
   public static void main(String[] args) {
       Human a = new Human();
       children b = new children();
      
       
       System.out.println("Name: "+a.name);
       System.out.println("Skin Color: "+a.skincolor);
       System.out.println("Eye Color: "+a.eyecolor);
       System.out.println("Gender: "+a.gender);
       System.out.println("Height: "+a.height);
       System.out.println("Race: "+a.race);
       System.out.println("Weight: "+a.weight+" Kg");
       System.out.println("Age: "+a.age+" Years old");

       System.out.println("Genetic Diseases: "+b.gendis);
       System.out.println("Wealth Rate(1-10): "+b.wealthrate);
       System.out.println("Mood Rating (1-10): "+b.moodrating);
       System.out.println("Intelligence Rating (1-100): "+b.intelligencerating);
    }
    
}
