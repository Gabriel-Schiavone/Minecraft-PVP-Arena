package me.snazzy.arena;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Arena has loaded");
        getServer().getPluginManager().registerEvents(new Arena(), this);
    }
}
