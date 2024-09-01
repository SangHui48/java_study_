package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 오버로딩
//    MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
//    }

    MemberConstruct(String name, int age) {
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
