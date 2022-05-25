public class Admin extends User{
    public Admin(String name, String surname, String user_name) {
        super(name, surname, user_name, "Admin");
    }
    public void giveDonate_adding_access(User k){
        k.setDonate_adding_access(true);
    }
    public void giveDonate_removing_access(User k){
        k.setDonate_removing_access(true);
    }
    public void giveDonate_update_access(User k){
        k.setDonate_update_access(true);
    }
}
