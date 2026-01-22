package com.Daniil.gym;
import com.Daniil.gym.menu.GymMenu;
import com.Daniil.gym.menu.Menu;
import com.Daniil.gym.model.Member;

public class Main {
    public static void main(String[] args) {
        Menu menu = new GymMenu();
        menu.run();
    }
}
