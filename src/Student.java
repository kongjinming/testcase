public class Student {
    private String id;
    private String name;
    private String dormitory; // 宿舍号
    private String roomNumber; // 房间号
    private String bedNumber; // 床号

    public Student(String id, String name, String dormitory, String roomNumber, String bedNumber) {
        this.id = id;
        this.name = name;
        this.dormitory = dormitory;
        this.roomNumber = roomNumber;
        this.bedNumber = bedNumber;
    }

    // getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDormitory() {
        return dormitory;
    }

    public void setDormitory(String dormitory) {
        this.dormitory = dormitory;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(String bedNumber) {
        this.bedNumber = bedNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dormitory='" + dormitory + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", bedNumber='" + bedNumber + '\'' +
                '}';
    }
}