package xyz.qurequre.firstplugin;

import xyz.qurequre.firstplugin.commands.CurCommand;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.craftbukkit.libs.jline.internal.Log;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerQuitEvent;

public class Main extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		new CurCommand(this);
		Log.info("Applied successfully! Thanks for using my Plugin!");
		getServer().getPluginManager().registerEvents(this, this);
	} 
	
	@Override
	public void onDisable() {
		Log.info("Plugin is disabled!");
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
	    if(!e.getPlayer().hasPlayedBefore()) {
		    e.getPlayer().sendMessage("New user " + p.getName() + " has joined!");
		} else {
			e.setJoinMessage("§7[§a + §7]§7 " + p.getName());
		}
	}
	
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		e.setQuitMessage("§7[§c - §7]§7 " + p.getName());
	}
}

