package xyz.qurequre.firstplugin.commands;

import xyz.qurequre.firstplugin.Main;
import org.bukkit.command.CommandExecutor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CurCommand implements CommandExecutor {
	private Main plugin;
	
	public CurCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("cur").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage(sender.getName() + ", only players can excute this command!");
			return true;
		} else {
			Player pl = (Player) sender;
			GameMode gm = pl.getGameMode();
			
			pl.sendMessage(pl.getName() + ", Your Gamemode is: " + gm);
			return true;
		}
	}
}
