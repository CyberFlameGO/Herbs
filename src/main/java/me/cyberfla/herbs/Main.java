package net.cyberflame.herbs;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
@Override
public void onEnable() {
	Bukkit.broadcastMessage("[Herbs] Plugin loaded and enabled successfully!");
	Bukkit.getPluginManager().registerEvents(new PlayerListener(), this);
}
}

