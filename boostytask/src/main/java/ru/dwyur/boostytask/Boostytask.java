package ru.dwyur.boostytask;

import org.bukkit.plugin.java.JavaPlugin;
import ru.dwyur.boostytask.events.SpawnListener;

public final class Boostytask extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("BoostyTask #1 enabled (Advanced Zombie)! Made by Dwyur");
        getServer().getPluginManager().registerEvents(new SpawnListener(), this);
    }
}
