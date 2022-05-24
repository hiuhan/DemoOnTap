public class Hotel {
    private String kindOfRoom;
    private double price;
    private long roomNumber;

    public Hotel(String kindOfRoom, double price, long roomNumber) {
        this.kindOfRoom = kindOfRoom;
        this.price = price;
        this.roomNumber = roomNumber;
    }

    public Hotel() {
    }

    public String getKindOfRoom() {
        return kindOfRoom;
    }

    public void setKindOfRoom(String kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(long roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "kindOfRoom='" + kindOfRoom + '\'' +
                ", price=" + price +
                ", roomNumber=" + roomNumber +
                '}';
    }
}