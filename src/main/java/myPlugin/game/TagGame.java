package myPlugin.game;
import org.bukkit.entity.Player;

import myPlugin.CountdownTimer;
import myPlugin.main;

import java.util.HashSet;
import java.util.Set;

public class TagGame {
	
	private Player it;
	private final Set<Player> onlinePlayers = new HashSet<>();
	private final main plugin;
	private CountdownTimer gameTimer;
	
	public TagGame(main plugin) {
		this.plugin = plugin;
		this.gameTimer = new CountdownTimer(plugin, 30);
	}
	
	
	public void startGame() {
		onlinePlayers.addAll(plugin.getServer().getOnlinePlayers());
		if (!onlinePlayers.isEmpty()) {
			it = onlinePlayers.iterator().next();
			it.sendMessage("You are it!");
			gameTimer.start();
			

			
		}
	}
	
	public void tag(Player tagger, Player target) {
		 if (tagger.equals(it)) {
			 it = target;
			 it.sendMessage("You are it!");
			 tagger.sendMessage("You tagged " + target.getName() + "!");
		
		 }
		 else {
			 tagger.sendMessage("You are not it!");
		 }
	}
	
	public Player getTaggedPlayer() {
		return it;
	}
	
	public boolean playing (Player player) {
		return onlinePlayers.contains(player);
	}
	
	


}

