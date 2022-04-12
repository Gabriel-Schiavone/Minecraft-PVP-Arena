package me.snazzy.arena;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Arena implements Listener {
    ItemStack helmet = new ItemStack(Material.IRON_HELMET);
    ItemStack chestplate = new ItemStack(Material.IRON_CHESTPLATE);
    ItemStack leggings = new ItemStack(Material.IRON_LEGGINGS);
    ItemStack boots = new ItemStack(Material.IRON_BOOTS);
    ItemStack sword = new ItemStack(Material.IRON_SWORD);
    ItemStack axe = new ItemStack(Material.IRON_AXE);
    ItemStack bow = new ItemStack(Material.BOW);
    ItemStack arrow = new ItemStack(Material.ARROW, 32);
    ItemStack steak = new ItemStack(Material.COOKED_BEEF, 16);
    ItemStack gapple = new ItemStack(Material.GOLDEN_APPLE, 3);

    static ArrayList<ItemStack> rewards = new ArrayList<ItemStack>();

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        if (event.getPlayer().getTargetBlockExact(6) == null) {return;}
        if (event.getPlayer().getTargetBlockExact(6).getType().equals(Material.CHIPPED_ANVIL) || event.getPlayer().getTargetBlockExact(6).getType().equals(Material.DAMAGED_ANVIL)) {
            event.getPlayer().getTargetBlockExact(6).setType(Material.ANVIL);
        }
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.getPlayer().getInventory().clear();
        event.getPlayer().getInventory().setHelmet(helmet);
        event.getPlayer().getInventory().setChestplate(chestplate);
        event.getPlayer().getInventory().setLeggings(leggings);
        event.getPlayer().getInventory().setBoots(boots);
        event.getPlayer().getInventory().addItem(sword);
        event.getPlayer().getInventory().addItem(axe);
        event.getPlayer().getInventory().addItem(bow);
        event.getPlayer().getInventory().addItem(arrow);
        event.getPlayer().getInventory().addItem(steak);
        event.getPlayer().getInventory().addItem(gapple);

    }

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        if (event.getDeathMessage().contains("by")) {
            giveItem(event.getEntity().getKiller());
            event.getEntity().getKiller().setLevel(event.getEntity().getKiller().getLevel() + 5);
        }
    }

    @EventHandler
    public void onRespawn(PlayerRespawnEvent event) {
        event.getPlayer().getInventory().setHelmet(helmet);
        event.getPlayer().getInventory().setChestplate(chestplate);
        event.getPlayer().getInventory().setLeggings(leggings);
        event.getPlayer().getInventory().setBoots(boots);
        event.getPlayer().getInventory().addItem(sword);
        event.getPlayer().getInventory().addItem(axe);
        event.getPlayer().getInventory().addItem(bow);
        event.getPlayer().getInventory().addItem(arrow);
        event.getPlayer().getInventory().addItem(steak);
        event.getPlayer().getInventory().addItem(gapple);
    }

    public void giveItem(Player player) {
        // Books
        //Book 1
        ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta bMeta1 = (EnchantmentStorageMeta) book1.getItemMeta();
        bMeta1.addStoredEnchant(Enchantment.FIRE_ASPECT, 1, true);
        book1.setItemMeta(bMeta1);
        //Book 2
        ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta bMeta2 = (EnchantmentStorageMeta) book2.getItemMeta();
        bMeta2.addStoredEnchant(Enchantment.DAMAGE_ALL, 1, true);
        book2.setItemMeta(bMeta2);
        //Book 3
        ItemStack book3 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta bMeta3 = (EnchantmentStorageMeta) book3.getItemMeta();
        bMeta3.addStoredEnchant(Enchantment.DAMAGE_ALL, 2, true);
        book3.setItemMeta(bMeta3);
        //Book 4
        ItemStack book4 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta bMeta4 = (EnchantmentStorageMeta) book4.getItemMeta();
        bMeta4.addStoredEnchant(Enchantment.DAMAGE_ALL, 3, true);
        book4.setItemMeta(bMeta4);
        //Book 5
        ItemStack book5 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta bMeta5 = (EnchantmentStorageMeta) book5.getItemMeta();
        bMeta5.addStoredEnchant(Enchantment.KNOCKBACK, 1, true);
        book5.setItemMeta(bMeta5);
        //Book 6
        ItemStack book6 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta bMeta6 = (EnchantmentStorageMeta) book6.getItemMeta();
        bMeta6.addStoredEnchant(Enchantment.ARROW_DAMAGE, 1, true);
        book6.setItemMeta(bMeta6);
        //Book 7
        ItemStack book7 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta bMeta7 = (EnchantmentStorageMeta) book7.getItemMeta();
        bMeta7.addStoredEnchant(Enchantment.ARROW_DAMAGE, 2, true);
        book7.setItemMeta(bMeta7);
        //Book 8
        ItemStack book8 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta bMeta8 = (EnchantmentStorageMeta) book8.getItemMeta();
        bMeta8.addStoredEnchant(Enchantment.ARROW_DAMAGE, 3, true);
        book8.setItemMeta(bMeta8);
        //Book 9
        ItemStack book9 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta bMeta9 = (EnchantmentStorageMeta) book9.getItemMeta();
        bMeta9.addStoredEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
        book9.setItemMeta(bMeta9);
        //Book 10
        ItemStack book10 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta bMeta10 = (EnchantmentStorageMeta) book10.getItemMeta();
        bMeta10.addStoredEnchant(Enchantment.ARROW_FIRE, 1, true);
        book10.setItemMeta(bMeta10);
        //Book 11
        ItemStack book11 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta bMeta11 = (EnchantmentStorageMeta) book11.getItemMeta();
        bMeta11.addStoredEnchant(Enchantment.QUICK_CHARGE, 1, true);
        book11.setItemMeta(bMeta11);
        //Book 12
        ItemStack book12 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta bMeta12 = (EnchantmentStorageMeta) book12.getItemMeta();
        bMeta12.addStoredEnchant(Enchantment.QUICK_CHARGE, 2, true);
        book12.setItemMeta(bMeta12);
        //Book 13
        ItemStack book13 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta bMeta13 = (EnchantmentStorageMeta) book13.getItemMeta();
        bMeta13.addStoredEnchant(Enchantment.QUICK_CHARGE, 3, true);
        book13.setItemMeta(bMeta13);
        //Book 14
        ItemStack book14 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta bMeta14 = (EnchantmentStorageMeta) book14.getItemMeta();
        bMeta14.addStoredEnchant(Enchantment.ARROW_INFINITE, 1, true);
        book14.setItemMeta(bMeta14);
        //Book 15
        ItemStack book15 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta bMeta15 = (EnchantmentStorageMeta) book15.getItemMeta();
        bMeta15.addStoredEnchant(Enchantment.THORNS, 1, true);
        book15.setItemMeta(bMeta15);
        //Book 16
        ItemStack book16 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta bMeta16 = (EnchantmentStorageMeta) book16.getItemMeta();
        bMeta16.addStoredEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        book16.setItemMeta(bMeta16);
        //Book 17
        ItemStack book17 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta bMeta17 = (EnchantmentStorageMeta) book17.getItemMeta();
        bMeta17.addStoredEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
        book17.setItemMeta(bMeta17);
        //Book 18
        ItemStack book18 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta bMeta18 = (EnchantmentStorageMeta) book18.getItemMeta();
        bMeta18.addStoredEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
        book18.setItemMeta(bMeta18);

        // Potions
        //Potion 1
        ItemStack potion1 = new ItemStack(Material.POTION);
        PotionMeta meta1 = (PotionMeta) potion1.getItemMeta();
        meta1.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 600, 0), true);
        meta1.setDisplayName("Speed Potion");
        meta1.setColor(Color.SILVER);
        potion1.setItemMeta(meta1);
        //Potion 2
        ItemStack potion2 = new ItemStack(Material.POTION);
        PotionMeta meta2 = (PotionMeta) potion2.getItemMeta();
        meta2.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 300, 0), true);
        meta2.setDisplayName("Strength Potion");
        meta2.setColor(Color.MAROON);
        potion2.setItemMeta(meta2);
        //Potion 3
        ItemStack potion3 = new ItemStack(Material.POTION);
        PotionMeta meta3 = (PotionMeta) potion3.getItemMeta();
        meta3.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1), true);
        meta3.setDisplayName("Speed II Potion");
        meta3.setColor(Color.SILVER);
        potion3.setItemMeta(meta3);
        //Potion 4
        ItemStack potion4 = new ItemStack(Material.POTION);
        PotionMeta meta4 = (PotionMeta) potion4.getItemMeta();
        meta4.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 300, 1), true);
        meta4.setDisplayName("Strength II Potion");
        meta4.setColor(Color.MAROON);
        potion4.setItemMeta(meta4);

        // Diamond items
        rewards.add(new ItemStack(Material.DIAMOND_HELMET));
        rewards.add(new ItemStack(Material.DIAMOND_CHESTPLATE));
        rewards.add(new ItemStack(Material.DIAMOND_LEGGINGS));
        rewards.add(new ItemStack(Material.DIAMOND_BOOTS));
        rewards.add(new ItemStack(Material.DIAMOND_SWORD));
        rewards.add(new ItemStack(Material.DIAMOND_AXE));
        rewards.add(new ItemStack(Material.DIAMOND_HELMET));
        rewards.add(new ItemStack(Material.DIAMOND_CHESTPLATE));
        rewards.add(new ItemStack(Material.DIAMOND_LEGGINGS));
        rewards.add(new ItemStack(Material.DIAMOND_BOOTS));
        rewards.add(new ItemStack(Material.DIAMOND_SWORD));
        rewards.add(new ItemStack(Material.DIAMOND_AXE));
        rewards.add(new ItemStack(Material.DIAMOND_HELMET));
        rewards.add(new ItemStack(Material.DIAMOND_CHESTPLATE));
        rewards.add(new ItemStack(Material.DIAMOND_LEGGINGS));
        rewards.add(new ItemStack(Material.DIAMOND_BOOTS));
        rewards.add(new ItemStack(Material.DIAMOND_SWORD));
        rewards.add(new ItemStack(Material.DIAMOND_AXE));

        // Netherite items
        rewards.add(new ItemStack(Material.NETHERITE_HELMET));
        rewards.add(new ItemStack(Material.NETHERITE_CHESTPLATE));
        rewards.add(new ItemStack(Material.NETHERITE_LEGGINGS));
        rewards.add(new ItemStack(Material.NETHERITE_BOOTS));
        rewards.add(new ItemStack(Material.NETHERITE_SWORD));
        rewards.add(new ItemStack(Material.NETHERITE_AXE));

        // Special items
        rewards.add(new ItemStack(Material.GOLDEN_APPLE, 2));
        rewards.add(new ItemStack(Material.GOLDEN_APPLE, 2));
        rewards.add(new ItemStack(Material.GOLDEN_APPLE, 4));
        rewards.add(new ItemStack(Material.GOLDEN_APPLE, 4));
        rewards.add(new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1));
        rewards.add(new ItemStack(Material.CROSSBOW, 1));
        rewards.add(new ItemStack(Material.SHIELD, 1));

        // Books
        rewards.add(book1);
        rewards.add(book2);
        rewards.add(book3);
        rewards.add(book4);
        rewards.add(book5);
        rewards.add(book6);
        rewards.add(book7);
        rewards.add(book8);
        rewards.add(book9);
        rewards.add(book10);
        rewards.add(book11);
        rewards.add(book12);
        rewards.add(book13);
        rewards.add(book14);
        rewards.add(book15);
        rewards.add(book16);
        rewards.add(book17);
        rewards.add(book18);

        // Potions
        rewards.add(potion1);
        rewards.add(potion2);
        rewards.add(potion3);
        rewards.add(potion4);

        int rand = ThreadLocalRandom.current().nextInt(rewards.size());
        player.getInventory().addItem(rewards.get(rand));
    }
}
