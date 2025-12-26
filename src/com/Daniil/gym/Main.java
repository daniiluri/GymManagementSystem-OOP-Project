package com.Daniil.gym;

public class Main {
    public static void main(String[] args) {
        Member member = new Member("Daniil", "Kim", false);
        System.out.println(member);

        member.buyMembership();
        System.out.println(member);

        member.removeMembership();
        System.out.println(member);


        Trainer trainer = new Trainer("Daniil", "Kim", 2, 10);
        System.out.println(trainer);

        trainer.addTrainedMember();
        System.out.println(trainer);

        System.out.println(trainer.isExperienced());


        Equipment equipment = new Equipment("Weight", "30kg", "strength", 10);
        System.out.println(equipment);

        equipment.addQuantity(2);
        System.out.println(equipment);

        System.out.println(equipment.isAvailable());
    }
}
