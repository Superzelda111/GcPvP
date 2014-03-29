package tk.GcPvP.Methods;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import tk.GcPvP.GcPvP;

public class Potions {
	public static GcPvP plugin;
	public Potions(GcPvP instance){
		plugin = instance;
	}
	
	public static void giveDefault(GcPvP plugin, Player player){
		player.performCommand("effect " + player.getName() + " clear");
		
		player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000, 2));
		player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1000000, 2));
	}
	public static void giveVIP(GcPvP plugin, Player player){
		player.performCommand("effect " + player.getName() + " clear");
		
		
	}
public static void giveOP(GcPvP plugin, Player player){
	player.performCommand("coins 50");
	player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000, 3));
	player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1000000, 5));
	}

}
