import java.util.ArrayList;

public class Charity {
    String name;
    private int foundation_year;
    ArrayList <Donate> donateList = new ArrayList<>();
    ArrayList <Member> memberList = new ArrayList<>();

    public Charity(String name, int foundation_year) {
        this.name = name;
        this.foundation_year = foundation_year;
    }
    public void addMember(Member y){
        if(!memberList.contains(y)){
            memberList.add(y);
            y.charity_working_at=this;
        }else{
            System.out.println("This member is already exist!");
        }

    }
    public void showMembers(){
        System.out.println(this.name+" List of members at the Charity:");
        for (Member memberList1 : memberList) {
            System.out.println(memberList1.getName() + "\t" + memberList1.getSurname() + "\t" + memberList1.getDonateNumber());
        }
    }
    public void showDonates(){
        System.out.println(this.name+" List of donates at the Charity:");
        for (Donate donateList1 : donateList) {
            System.out.println(donateList1.donateNo + "\t" + donateList1.title + "\t" + donateList1.getMember());
        }
    }

    public ArrayList<Donate> getDonateList() {
        return donateList;
    }

    public ArrayList<Member> getMemberList() {
        return memberList;
    }
    public void calculateStatistic(){
        System.out.println("Number of donates at the Charity: "+donateList.size());
        System.out.println("Number of donaters at the Charity: "+ memberList.size());
    }
}
