package com.company;

import java.util.*;

public class ShoppingList {
    static int price = 0;
    private static boolean isRunning = false;
    static Scanner scan = new Scanner(System.in);
    static List<Item> shoppingList = new ArrayList<Item>();
    static List<Item> menu = new ArrayList<Item>();
    static Item rohlik = new Item("Rohlík", 5);
    static Item brambory = new Item("Brambory", 30);
    static Item kure = new Item("Kuře", 80);
    static Item mleko = new Item("Mléko", 50);

    public static void start() {
        initList();
        int menuOptions = 0;

        do {
            isRunning = true;
            outMenu();
            menuOptions = 0;

            try {
                menuOptions = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException err) {
                System.out.println("Chybný výběr možnosti");
            }

            switch (menuOptions) {
                case 1 -> {
                    AddingMenu.addItem();
                }
                case 2 -> {
                    RemoveMenu.removeItem();
                }
                case 3 -> {
                    System.out.println("V košíku máte: \n" + Arrays.toString(shoppingList.toArray()));
                    System.out.println("Celková cena: " + price);
                }
                case 4 -> {
                    isRunning = false;
                }
            }
        } while (isRunning);
    }

    private static void outMenu() {
        System.out.println("1 - přidat položku\n2 - odebrat položku\n3 - vypsat košík\n4 - Odejít");
    }

    private static void initList() {
        menu.add(rohlik);
        menu.add(brambory);
        menu.add(kure);
        menu.add(mleko);
    }
}
