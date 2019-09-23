package xyz.qurequre.firstplugin.commands;

import xyz.qurequre.firstplugin.Main;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelloCommand implements CommandExecutor {
	private Main plugin;
	
	public HelloCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("hello").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage(sender.getName() + ", only players can excute this command!");
			return true;
		}
		
		Player p = (Player) sender;
		
		p.sendMessage(p.getName() + ", ¾È³ç");
		return true;
	}
}
