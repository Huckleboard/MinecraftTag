package myPlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import myPlugin.main;

import myPlugin.main;
import myPlugin.game.TagGame;


public class tagCommand implements CommandExecutor{
	
	private final main plugin;
	
	public tagCommand(main plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender seder, Command cmd, String label, String[] args) {
		return false;
	}


}
