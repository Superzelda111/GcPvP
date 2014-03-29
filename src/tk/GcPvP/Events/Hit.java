package tk.GcPvP.Events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import tk.GcPvP.GcPvP;

public class Hit implements Listener {
	
	public static GcPvP plugin;
	public Hit(GcPvP instance){
		plugin = instance;
	}
	
	@Deprecated
	@EventHandler
	public void onPlayerDamagedByEntity(EntityDamageByEntityEvent event){
		Entity e = event.getEntity();
		// Entity damager = event.getDamager();
		if(e instanceof Player){
			Player player = (Player) e;
			
			player.sendMessage("You have been hit by " + event.getDamager());
		}
	}

}
