public class Main {

    public static void main(String[] args){
        System.out.println("Starting " + Program.getFullName());
        var world = new World();
        var player = new Player();
        var room01 = new Room(3,2);
        world.add(room01);
        world.add(player);
        room01.setCell(2,1,player);

        Program.out.println(PrintType.DEBUG,world.getWorldContent());
        Program.out.println(PrintType.INFO,world.getWorldContent());

        room01.display();
    }

}
