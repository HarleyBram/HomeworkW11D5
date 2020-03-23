public enum PlaneType {
    BOEING747(400),
    BOEING737(188);

    private final int capacity;

    PlaneType(int capacity) {
        this.capacity = capacity;
    }

    public int getCap(){
        return this.capacity;
    }
}
