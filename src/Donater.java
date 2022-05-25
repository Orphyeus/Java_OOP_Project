public class Donater extends User{
    int account;
    public Donater(String name, String surname, String user_name, int account) {
        super(name, surname, user_name, "Donater");
        this.account = account;
    }
    public int getAccount() {
        return account;
    }

    public int addMoney(int money, Donater donater) {
        donater.account += money;
        return account;
    }
    public void makeDonate(int money, Donate donate) {
        if(this.account >= money){
            this.account -= money;
            donate.amount += money;
        }
        else{
            System.out.println("You don't have enough money to make a donate!");
        }
    }
}
