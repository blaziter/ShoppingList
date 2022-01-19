package com.company;

import static com.company.ShoppingList.*;

public class AddingMenu {
    private static String item;
    private static int amount;

    private static void outAddItem() {
        System.out.println("Možné k zakoupení: ");
        for (Item item : ShoppingList.menu) {
            System.out.println(item.toMenu());
        }
        System.out.println("Zadejte název produktu");
    }

    static void addItem() {
        outAddItem();
        item = scan.nextLine();
        int value = 0;

        switch (item) {
            case "Rohlík" -> {
                enterValue();
                if (!shoppingList.contains(rohlik)) shoppingList.add(rohlik);
                price += rohlik.getPrice() * amount;
            }
            case "Brambory" -> {
                enterValue();
                if (!shoppingList.contains(brambory)) shoppingList.add(brambory);
                price += brambory.getPrice() * amount;

            }
            case "Kuře" -> {
                enterValue();
                if (!shoppingList.contains(kure)) shoppingList.add(kure);
                price += kure.getPrice() * amount;

            }
            case "Mléko" -> {
                enterValue();
                if (!shoppingList.contains(mleko)) shoppingList.add(mleko);
                price += mleko.getPrice() * amount;

            }
            default -> {
                System.out.println("Produkt není dostupný nebo byl chybně zadaný");
            }
        }
    }

    private static void enterValue() {
        System.out.println("Jaké množství chcete?");
        try {
            amount = Integer.parseInt(scan.nextLine());
            switch (item) {
                case "Rohlík" -> {
                    rohlik.setAmount(rohlik.getAmount() + amount);
                }
                case "Brambory" -> {
                    brambory.setAmount(brambory.getAmount() + amount);

                }
                case "Kuře" -> {
                    kure.setAmount(kure.getAmount() + amount);
                }
                case "Mléko" -> {
                    mleko.setAmount(mleko.getAmount() + amount);
                }
            }
        } catch (NumberFormatException err) {
            System.out.println("Chybné zadané množství");
        }
    }
}
