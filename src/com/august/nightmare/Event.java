package com.august.nightmare;


import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.inventory.ItemStack;

public class Event implements Listener {
    @EventHandler
    public void doNotheal(EntityRegainHealthEvent Event){
        if(Event.getEntityType() == EntityType.PLAYER){
            if(Event.getRegainReason() == EntityRegainHealthEvent.RegainReason.EATING) {
                Event.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void raidThisFuckingWorld(CreatureSpawnEvent Event){
        if(Event.getEntityType() == EntityType.CREEPER){
            Creeper creeper = (Creeper) Event.getEntity();
            creeper.setPowered(true);
            creeper.setMaxHealth(40f);
            creeper.setHealth(40f);
        }else if(Event.getEntityType() == EntityType.ZOMBIE){
            Zombie zombie = (Zombie) Event.getEntity();
            ItemStack opHelmet = new ItemStack(Material.NETHERITE_HELMET);
            opHelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            ItemStack opChestplate = new ItemStack(Material.NETHERITE_CHESTPLATE);
            opChestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            ItemStack opLeggings = new ItemStack(Material.NETHERITE_LEGGINGS);
            opLeggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            ItemStack opBoots = new ItemStack(Material.NETHERITE_BOOTS);
            opBoots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            opBoots.addEnchantment(Enchantment.PROTECTION_FALL, 4);
            ItemStack opSword = new ItemStack(Material.NETHERITE_SWORD);
            opSword.addEnchantment(Enchantment.DAMAGE_ALL, 5);
            opSword.addEnchantment(Enchantment.FIRE_ASPECT, 2);
            zombie.getEquipment().setHelmet(opHelmet);
            zombie.getEquipment().setChestplate(opChestplate);
            zombie.getEquipment().setLeggings(opLeggings);
            zombie.getEquipment().setBoots(opLeggings);
            zombie.getEquipment().setItemInMainHand(opSword);
            zombie.getEquipment().setItemInOffHand(new ItemStack(Material.TOTEM_OF_UNDYING));
            zombie.setBaby();
        }else if(Event.getEntityType() == EntityType.SKELETON){
            Skeleton skeleton = (Skeleton) Event.getEntity();
            ItemStack opHelmet = new ItemStack(Material.NETHERITE_HELMET);
            opHelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            ItemStack opChestplate = new ItemStack(Material.NETHERITE_CHESTPLATE);
            opChestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            ItemStack opLeggings = new ItemStack(Material.NETHERITE_LEGGINGS);
            opLeggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            ItemStack opBoots = new ItemStack(Material.NETHERITE_BOOTS);
            opBoots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            opBoots.addEnchantment(Enchantment.PROTECTION_FALL, 4);
            ItemStack opBow = new ItemStack(Material.BOW);
            opBow.addEnchantment(Enchantment.ARROW_DAMAGE, 5);
            opBow.addEnchantment(Enchantment.ARROW_FIRE, 1);
            skeleton.getEquipment().setHelmet(opHelmet);
            skeleton.getEquipment().setChestplate(opChestplate);
            skeleton.getEquipment().setLeggings(opLeggings);
            skeleton.getEquipment().setBoots(opBoots);
            skeleton.getEquipment().setItemInMainHand(opBow);
        }else if(Event.getEntityType() == EntityType.ZOMBIFIED_PIGLIN){
            PigZombie zombie = (PigZombie) Event.getEntity();
            ItemStack opHelmet = new ItemStack(Material.NETHERITE_HELMET);
            opHelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            ItemStack opChestplate = new ItemStack(Material.NETHERITE_CHESTPLATE);
            opChestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            ItemStack opLeggings = new ItemStack(Material.NETHERITE_LEGGINGS);
            opLeggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            ItemStack opBoots = new ItemStack(Material.NETHERITE_BOOTS);
            opBoots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            opBoots.addEnchantment(Enchantment.PROTECTION_FALL, 4);
            ItemStack opSword = new ItemStack(Material.NETHERITE_SWORD);
            opSword.addEnchantment(Enchantment.DAMAGE_ALL, 5);
            opSword.addEnchantment(Enchantment.FIRE_ASPECT, 2);
            zombie.getEquipment().setHelmet(opHelmet);
            zombie.getEquipment().setChestplate(opChestplate);
            zombie.getEquipment().setLeggings(opLeggings);
            zombie.getEquipment().setBoots(opLeggings);
            zombie.getEquipment().setItemInMainHand(opSword);
            zombie.getEquipment().setItemInOffHand(new ItemStack(Material.TOTEM_OF_UNDYING));
            zombie.setBaby();
            zombie.setAngry(true);
        }
    }
}