package com.company;

import static com.company.ShoppingList.*;

public class RemoveMenu {
    private static void outRemoveItem() {
        System.out.println("Možné odebrat z košíku: ");
        for (Item item : ShoppingList.shoppingList) {
            System.out.println(item.toString());
        }
        System.out.println("Zadejte název produktu");
    }

    static void removeItem() {
        if (shoppingList.isEmpty()) {
            System.out.println("Košík je prázdný");
            return;
        }

        outRemoveItem();
        String item = scan.nextLine();
        int amount = 0;
        switch (item) {
            case "Rohlík" -> {
                amount = enterValue();
                if (amount > rohlik.getAmount()) {
                    System.out.println("Nelze odebrat větší množství než máte v košíku");
                    return;
                }
                rohlik.setAmount(rohlik.getAmount() - amount);
                shoppingList.remove(rohlik);
                price -= rohlik.getPrice() * amount;
            }
            case "Brambory" -> {
                amount = enterValue();
                if (amount > brambory.getAmount()) {
                    System.out.println("Nelze odebrat větší množství než máte v košíku");
                    return;
                }
                brambory.setAmount(brambory.getAmount() - amount);
                shoppingList.add(brambory);
                price -= brambory.getPrice() * amount;

            }
            case "Kuře" -> {
                amount = enterValue();
                if (amount > kure.getAmount()) {
                    System.out.println("Nelze odebrat větší množství než máte v košíku");
                    return;
                }
                kure.setAmount(kure.getAmount() - amount);
                shoppingList.add(kure);
                price -= kure.getPrice() * amount;

            }
            case "Mléko" -> {
                amount = enterValue();
                if (amount > mleko.getAmount()) {
                    System.out.println("Nelze odebrat větší množství než máte v košíku");
                    return;
                }
                mleko.setAmount(mleko.getAmount() - amount);
                shoppingList.add(mleko);
                price -= mleko.getPrice() * amount;

            }
            default -> {
                System.out.println("Produkt není v košíku nebo byl chybně zadaný");
            }
        }
    }

    private static int enterValue() {
        System.out.println("Jaké množství chcete odebrat?");
        try {
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException err) {
            System.out.println("Chybně zadané množství");
        }
        return 0;
    }
}
