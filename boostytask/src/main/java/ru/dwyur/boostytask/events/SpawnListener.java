package ru.dwyur.boostytask.events;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

public class SpawnListener implements Listener {

    @EventHandler
    public void onSpawn(CreatureSpawnEvent e) {
        LivingEntity entity = e.getEntity();
        if (entity.getType() == EntityType.ZOMBIE) {

            /* изменение скорости у ентити */
            entity.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(5);

            /* предметы */
            ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
            ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
            ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
            ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
            ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);

            /* добавление предметов мобу */
            entity.getEquipment().setBoots(boots);
            entity.getEquipment().setLeggings(leggings);
            entity.getEquipment().setChestplate(chestplate);
            entity.getEquipment().setHelmet(helmet);
            entity.getEquipment().setItemInMainHand(sword);
        }
    }
}