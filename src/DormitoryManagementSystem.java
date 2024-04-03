import java.util.*;

public class DormitoryManagementSystem {
    private Map<String, Student> students; // 使用学生ID作为键来存储学生信息

    public DormitoryManagementSystem() {
        this.students = new HashMap<>();
    }

    // 添加学生
    public void addStudent(Student student) {
        if (students.containsKey(student.getId())) {
            System.out.println("学生已存在！");
            return;
        }
        students.put(student.getId(), student);
        System.out.println("学生添加成功！");
    }

    // 查询学生
    public Student queryStudent(String id) {
        if (!students.containsKey(id)) {
            System.out.println("未找到该学生！");
            return null;
        }
        return students.get(id);
    }

    // 修改学生信息
    public void updateStudent(Student newStudent) {
        if (!students.containsKey(newStudent.getId())) {
            System.out.println("未找到该学生！");
            return;
        }
        students.put(newStudent.getId(), newStudent);
        System.out.println("学生信息更新成功！");
    }

    // 删除学生
    public void deleteStudent(String id) {
        if (!students.containsKey(id)) {
            System.out.println("未找到该学生！");
            return;
        }
        students.remove(id);
        System.out.println("学生删除成功！");
    }

    // 显示所有学生信息
    public void showAllStudents() {
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }
}