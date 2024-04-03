public class Main {
    public static void main(String[] args) {
        DormitoryManagementSystem system = new DormitoryManagementSystem();// 添加学生
        system.addStudent(new Student("001", "张三", "1号楼", "101", "1"));
        system.addStudent(new Student("002", "李四", "1号楼", "102", "2"));
        system.queryStudent("004");
    }
}