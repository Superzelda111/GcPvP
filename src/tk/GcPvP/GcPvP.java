package tk.GcPvP;

import org.bukkit.plugin.java.JavaPlugin;

import tk.GcPvP.Commands.*;
import tk.GcPvP.Events.*;

public class GcPvP extends JavaPlugin {

	public static GcPvP plugin;

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new Join(this), this);
		getServer().getPluginManager().registerEvents(new Soup(this), this);
		saveDefaultConfig();
		getConfig().options().copyDefaults(true);
		saveConfig();
		getCommand("kit").setExecutor(new kit(this));
	}

}
