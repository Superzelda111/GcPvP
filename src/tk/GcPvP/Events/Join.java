package tk.GcPvP.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import tk.GcPvP.GcPvP;
import tk.GcPvP.Methods.Kit;
import tk.GcPvP.Methods.Potions;

public class Join implements Listener {

	public static GcPvP plugin;

	public Join(GcPvP instance) {
		plugin = instance;
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();

		if (!player.hasPermission("gcpvp.vip")) {
			Potions.giveDefault(plugin, player);
			Kit.giveDefaultKit(plugin, player);

			event.setJoinMessage(null);
		} else {
			Potions.giveVIP(plugin, player);
			event.setJoinMessage(plugin.getConfig()
					.getString("Messages.Quit.VIP")
					.replace("%player%", player.getName()));
			Potions.giveDefault(plugin, player);
			Kit.giveVIPKit(plugin, player);
		}
		if (player.isOp()) {
			event.setJoinMessage(plugin.getConfig()
					.getString("Messages.Join.OP")
					.replace("%player%", player.getName()));
			Potions.giveOP(plugin, player);
			Kit.giveDefaultKit(plugin, player);
		}
	}

	@EventHandler
	public void onQuit(PlayerQuitEvent event) {
		Player player = event.getPlayer();
		if (player.isOp()) {
			event.setQuitMessage(plugin.getConfig()
					.getString("Messages.Quit.OP")
					.replace("%player%", player.getName()));
		} else if (!player.hasPermission("gcpvp.vip")) {
			event.setQuitMessage(null);
		} else {
			plugin.getConfig().getString("Messages.Quit.VIP");
			event.setQuitMessage(plugin.getConfig()
					.getString("Messages.Quit.VIP")
					.replace("%player%", player.getName()));
		}
	}

}
