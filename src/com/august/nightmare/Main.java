package com.august.nightmare;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "UltraHardcore is ready!");
        getServer().getPluginManager().registerEvents(new Event(), this);
        World world = getServer().getWorld("world");
        getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
            public void run() {
                while (true) {
                    if (world == null) return;
                    world.setTime(13000);
                }
            }
        }, 100, 100);
    }
}