public class Member extends User{
    int donate_number;
    Charity charity_working_at;

    public Member(String name, String surname, String user_name) {
        super(name, surname, user_name, "Member");
    }

    public void setCharityWorking(Charity charity) {
        if(charity_working_at == null){
            this.charity_working_at = charity;
            charity_working_at.addMember(this);
        }else{
            charity_working_at.memberList.remove(this);
            this.charity_working_at = charity;
            charity_working_at.addMember(this);
        }
    }

    public int getDonateNumber() {
        return donate_number;
    }
    public void addDonate(Donate h){
        if(charity_working_at.getDonateList().contains(h)){
            System.out.println("This donate already exist!");
        }
        else if(this.isDonate_adding_access()){
            charity_working_at.donateList.add(h);
            h.setMember(this);
            donate_number++;
        }else{
            System.out.println("You don't have authority to adding donate!");
        }

    }
    public void removeDonate(Donate h){
        if(!this.isDonate_removing_access()){
            System.out.println("You don't have authority to removing donate!");
            return;
        }
        if(!h.getMember().equals(this)){
            System.out.println("You can't delete another person's donate!");
            return;
        }
        if(charity_working_at.donateList.remove(h)){
            donate_number--;
        }else{
            System.out.println("This donate not exist!");
        }
    }
    public void updateDonate(Donate h, String newDescb){
        if(!this.isDonate_update_access()){
            System.out.println("You don't have authority to update donate!");
            return;
        }
        if(!h.getMember().equals(this)){
            System.out.println("Başkasına ait haberi güncelleyemezsiniz!");
            return;
        }else{
            h.setDescb(newDescb);
        }

    }
    @Override
    public String toString() {
        return this.getName()+" "+this.getSurname();
    }
}
