package tk.GcPvP.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

import tk.GcPvP.GcPvP;

public class Drops implements Listener {
	
	public static GcPvP plugin;
	public Drops(GcPvP instance){
		plugin = instance;
	}
	
	@EventHandler
	public void onDrop(PlayerDropItemEvent event){
		event.setCancelled(true);
	}

}
