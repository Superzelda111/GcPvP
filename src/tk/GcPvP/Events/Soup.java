package tk.GcPvP.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import tk.GcPvP.GcPvP;

public class Soup implements Listener {
	
	public static GcPvP plugin;
	public Soup(GcPvP instance){
		plugin = instance;
	}
	
	@EventHandler
	public void onSoup(PlayerInteractEvent event){
		Player player = event.getPlayer();
		
		if(player.getHealth() == player.getMaxHealth()){
		}else{
			player.setHealth(player.getHealth() + 7 > player.getMaxHealth() ? player.getMaxHealth() : player.getHealth() + 7);
		
			player.getInventory().getItemInHand().setType(Material.BOWL);
		}
	}

}
