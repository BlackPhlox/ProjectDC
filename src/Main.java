public class Main {
    public static String PROGRAM_NAME = "Dungeon Crawler";
    public static double VERSION = 0.1;
    public static void main(String[] args){
        System.out.println("Starting " + getProgramName());
        World w = new World();

    }

    public static String getProgramName(){
        return PROGRAM_NAME + " " + VERSION;
    }
}
