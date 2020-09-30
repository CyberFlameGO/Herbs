package me.cyberfla.herbs;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
@Override
public void onEnable() {
	Bukkit.broadcastMessage("Herbs loaded!");
	Bukkit.getPluginManager().registerEvents(new PlayerListener(), this);
}
}

