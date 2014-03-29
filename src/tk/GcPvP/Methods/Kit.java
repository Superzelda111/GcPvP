package tk.GcPvP.Methods;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import tk.GcPvP.GcPvP;

public class Kit {

	public static void giveDefaultKit(GcPvP plugin, Player player) {
		Potions.giveVIP(plugin, player);

		player.getInventory().clear();
		ItemStack bowl = new ItemStack(Material.MUSHROOM_SOUP);
		ItemMeta bowlMeta = bowl.getItemMeta();
		bowlMeta.setDisplayName("§6Healing soup");
		bowl.setItemMeta(bowlMeta);

		ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta swordMeta = sword.getItemMeta();
		swordMeta.setDisplayName("§7Knife");
		sword.setItemMeta(swordMeta);
		player.getInventory().addItem(sword);
		player.getInventory().setItem(1, bowl);
		player.getInventory().setItem(2, bowl);
		player.getInventory().setItem(3, bowl);
		player.getInventory().setItem(4, bowl);
		player.getInventory().setItem(5, bowl);
		player.getInventory().setItem(6, bowl);
		player.getInventory().setItem(7, bowl);
		player.getInventory().setItem(8, bowl);
		player.getInventory().setItem(9, bowl);
		player.getInventory().setItem(10, bowl);
		player.getInventory().setItem(11, bowl);
	}

	public static void giveVIPKit(GcPvP plugin, Player player) {
		Potions.giveVIP(plugin, player);

		player.getInventory().clear();
		
		ItemStack bowl = new ItemStack(Material.MUSHROOM_SOUP);
		ItemMeta bowlMeta = bowl.getItemMeta();
		bowlMeta.setDisplayName("§6Healing soup");
		bowl.setItemMeta(bowlMeta);

		ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
		sword.addEnchantment(Enchantment.DAMAGE_ALL, 2);
		ItemMeta swordMeta = sword.getItemMeta();
		swordMeta.setDisplayName("§6Sunrise dagger");
		sword.setItemMeta(swordMeta);
		
		player.getInventory().addItem(sword);
		player.getInventory().setItem(1, bowl);
		player.getInventory().setItem(2, bowl);
		player.getInventory().setItem(3, bowl);
		player.getInventory().setItem(4, bowl);
		player.getInventory().setItem(5, bowl);
		player.getInventory().setItem(6, bowl);
		player.getInventory().setItem(7, bowl);
		player.getInventory().setItem(8, bowl);
		player.getInventory().setItem(9, bowl);
		player.getInventory().setItem(10, bowl);
		player.getInventory().setItem(11, bowl);
	}

	public static void giveGodKit(GcPvP plugin, Player player){
		
		player.getInventory().clear();
		
		ItemStack bowl = new ItemStack(Material.MUSHROOM_SOUP);
		ItemMeta bowlMeta = bowl.getItemMeta();
		bowlMeta.setDisplayName("§6Healing soup");
		bowl.setItemMeta(bowlMeta);
		
		ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
		sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
		ItemMeta swordMeta = sword.getItemMeta();
		swordMeta.setDisplayName("§5Gods dagger");
		sword.setItemMeta(swordMeta);
		
		player.getInventory().setItem(1, new ItemStack(Material.GOLDEN_APPLE, 4));
		player.getInventory().setItem(2, bowl);
		player.getInventory().setItem(3, bowl);
		player.getInventory().setItem(4, bowl);
		player.getInventory().setItem(5, bowl);
		player.getInventory().setItem(6, bowl);
		player.getInventory().setItem(7, bowl);
		player.getInventory().setItem(8, bowl);
		player.getInventory().setItem(9, bowl);
		player.getInventory().setItem(10, bowl);
		player.getInventory().setItem(11, bowl);
		player.getInventory().setItem(12, bowl);
	}
}
