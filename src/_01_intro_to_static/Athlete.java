package _01_intro_to_static;

public class Athlete {
	static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9:00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed, int bibNumber){
        this.name = name;
        this.speed = speed;
        this.bibNumber = bibNumber;
    }

    public static void main(String[] args) {
    	Athlete.nextBibNumber=1;
    	Athlete.raceLocation = "Chicago";
    	Athlete.raceStartTime = "8:15am";
    	Athlete tob = new Athlete("Toby",5,4);
    	Athlete jay = new Athlete("Jay",3,1);
    	if(tob.bibNumber > jay.bibNumber) {
    		tob.bibNumber = Athlete.nextBibNumber + jay.bibNumber;
    	}
    	else if (jay.bibNumber > tob.bibNumber)
    		jay.bibNumber = Athlete.nextBibNumber + tob.bibNumber;
    	System.out.println(tob.name + ", " + tob.bibNumber + ", " + Athlete.raceLocation);	
    	System.out.println(jay.name + ", " + jay.bibNumber  + ", " + Athlete.raceLocation);
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    }
}
