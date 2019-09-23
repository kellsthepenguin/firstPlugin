package xyz.qurequre.firstplugin;

import xyz.qurequre.firstplugin.commands.HelloCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		new HelloCommand(this);
	}
}
