package myPlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import myPlugin.main;

public class JoinCommand implements CommandExecutor {
	private final main plugin;
	
	public JoinCommand(main plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		// TODO Auto-generated method stub
		return false;
	}
}
