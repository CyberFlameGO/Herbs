package net.cyberflame.herbs;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerListener implements Listener {

	@EventHandler
	public void onRightClick(PlayerInteractEvent event) {

		Player player = event.getPlayer();

		if (!event.getPlayer().hasPermission("Herbs.event")) {
			event.setCancelled(true);
		}

		if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {

			if (event.getClickedBlock().getType() == Material.RED_ROSE) {

				player.performCommand("say Action executed!");
				ItemStack flower = new ItemStack(Material.RED_ROSE, 1);

				ItemMeta itemmeta = flower.getItemMeta();
				itemmeta.setDisplayName("§cPoppy");

				flower.setItemMeta(itemmeta);
				player.getInventory().addItem(new ItemStack(flower));

				event.getClickedBlock().setType(Material.AIR);
				Bukkit.getScheduler().scheduleSyncDelayedTask(JavaPlugin.getPlugin(HerbsPlugin.class),
						() -> event.getClickedBlock().setType(Material.RED_ROSE), 20L * 60L * 5l);
			}
		}
	}
}
