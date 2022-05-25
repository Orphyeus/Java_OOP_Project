public class User {
    private String name, surname, user_name, user_type;
    private boolean donate_adding_access;
    private boolean donate_removing_access;
    private boolean donate_update_access;

    public User(String name, String surname, String user_name, String user_type) {
        this.name = name;
        this.surname = surname;
        this.user_name = user_name;
        this.user_type = user_type;

        donate_adding_access = false;
        donate_removing_access = false;
        donate_update_access = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public boolean isDonate_adding_access() {
        return donate_adding_access;
    }

    public void setDonate_adding_access(boolean donate_adding_access) {
        this.donate_adding_access = donate_adding_access;
    }

    public boolean isDonate_removing_access() {
        return donate_removing_access;
    }

    public void setDonate_removing_access(boolean donate_removing_access) {
        this.donate_removing_access = donate_removing_access;
    }

    public boolean isDonate_update_access() {
        return donate_update_access;
    }

    public void setDonate_update_access(boolean donate_update_access) {
        this.donate_update_access = donate_update_access;
    }
}
