public class Location {
    private int setNum;
    private int[] adjRooms;
    private String name;

    public Location(int setNum, int[] adjRooms, String name) {
        this.setNum = setNum;
        this.adjRooms = adjRooms;
        this.name = name;
    }

    public int[] getAdjRooms() {
        return adjRooms;
    }

    public String getName() {
        return name;
    }

    public int getSetNum() {
        return setNum;
    }
}
