public class Donate {
    int donateNo, amount = 0;
    String title;
    private String descb;
    private Member member;

    public Donate(int donateNo, String title, String descb, Member member, int amount) {
        this.donateNo = donateNo;
        this.title = title;
        this.descb = descb;
        this.member = member;
        this.amount = amount;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void setDescb(String descb) {
        this.descb = descb;
    }
    public void showDonateInformations(){
        System.out.println("**********************");
        System.out.println("Donate no: "+this.donateNo);
        System.out.println("Title: "+this.title);
        System.out.println("Explanation: "+this.descb);
        System.out.println("Creator: "+this.member);
        System.out.println("Amount of donated money: "+this.amount);
        System.out.println("**********************");
    }
}
