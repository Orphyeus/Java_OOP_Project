public class test {
    public static void main(String[] args) {
        Charity c = new Charity("WHO", 1760);
        Charity c1 = new Charity("IHH", 1980);
        Member d = new Member("Leonardo", "DiCaprio", "diCap");
        Member d1 = new Member("Emma", "Watson", "GreenBeauty");
        Donater donater = new Donater("William", "Lightning", "Bold", 650000);

        c.addMember(d);
        c.addMember(d1);

        Admin a = new Admin("Vladimir", "Putin", "LoveIsWar");
        Donate dw = new Donate(1, "Save the Trees", "Help for Amazon and the green environment", d, 0);
        Donate dw1 = new Donate(2, "Help the war weary", "The world shaking with bombs and guns, people are dying, dont be silent. Let's STOP THIS!!!", d, 0);
        Donate dw2 = new Donate(3, "Orphanages need you", "Be father, be mother, save the children...",d1, 0);

        a.giveDonate_adding_access (d);
        a.giveDonate_adding_access (d1);
        d.addDonate(dw);
        d.addDonate(dw1);
        d1.addDonate(dw2);

        donater.makeDonate(40000,dw);
        //d.addDonate(dw);
        //a.giveDonate_removing_access(d);
        //d.removeDonate(dw1);

        a.giveDonate_update_access (d1);
        d.updateDonate (dw, "Green new World");
        c.showDonates();
        dw.showDonateInformations();

    }
}
