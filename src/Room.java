public class Room {
    private int width,height;
    private Object[][] cells;

    Room(int width, int height){
        this.width = width;
        this.height = height;
        cells = new Object[width][height];
    }

    public void setCell(int x, int y, Object obj){
        cells[x][y] = obj;
    }

    public void display(){
        Program.out.println(PrintType.GRAPHIC,"");
        for (int y = 0; y < height; y++) {
            System.out.print("|");
            for (int x = 0; x < width; x++) {
                System.out.print(" " + cells[x][y] + " ");
            }
            System.out.println("|");
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
