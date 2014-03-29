package tk.GcPvP.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import tk.GcPvP.GcPvP;
import tk.GcPvP.Methods.Kit;
import tk.GcPvP.Methods.Potions;

public class kit implements CommandExecutor {

	public static GcPvP plugin;

	public kit(GcPvP instance) {
		plugin = instance;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player player = (Player) sender;
		if (label.equalsIgnoreCase("kit")) {
			Potions.giveDefault(plugin, player);
			Kit.giveDefaultKit(plugin, player);
		}
		if(args.length == 1 && args[0].equalsIgnoreCase("god")){
			Kit.giveGodKit(plugin, player);
		}
		return false;
	}

}
