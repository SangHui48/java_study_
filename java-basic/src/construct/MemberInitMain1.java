package construct;

public class MemberInitMain1 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit("user1", 20, 80);
        MemberInit member2 = new MemberInit("user2", 30, 90);

        MemberInit[] members = {member1, member2};
        for (MemberInit member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
    }
}
