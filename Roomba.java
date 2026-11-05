// What type goes in the 2d array?
// Use a `char`: empty is ' ', 'O', '*'
// Can be a class – all arrays are mutable anyway
record Room(char[][] grid) {}
// degrees can be 0 (up), 90 (right), 180 (down), 270 (left)
record Robot(int x, int y, int degrees) {
    String show() {
        if(degrees == 0) { return "^"; }
        if(degrees == 90) { return ">"; }
        if(degrees == 180) { return "v"; }
        if(degrees == 270) { return "<"; }
        else { return "?"; }
    }
}
class Simulation {
    final Room room;
    Robot robot;
    Simulation(Room room, Robot robot) {
        this.room = room;
        this.robot = robot;
    }
    // Answer box 3: pick one of wall/obstacle and implement!
    boolean isFacingWall() {

    }
    boolean isFacingObstacle() {

    }
    boolean isFacingWallOrObstacle() {

    }
    String show() {
        String toShow = "";
        for(int row = 0; row < room.grid.length; row += 1) {
            for(int col = 0; col < room.grid[0].length; col += 1) {
                if(col == robot.x && row == robot.y) {
                    toShow += robot.show();
                }
                else {
                    toShow += room.grid[row][col];
                }
            }
            toShow += "\n";
        }
        return toShow;
    }
}

void main() {
    Room room = new Room(new char[][]{
        { '-', '-', '-', '-', '-', '-', '-' },
        { '-', '-', '-', 'O', '-', '-', '-' },
        { '-', '-', '-', '-', '-', '-', '-' },
        { '-', 'O', '-', '-', '-', '-', '-' },
    });
    Robot r = new Robot(4, 3, 90);
    Simulation s = new Simulation(room, r);
    System.out.println(s.show());
}

