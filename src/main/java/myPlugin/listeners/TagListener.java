package myPlugin.listeners;

import org.bukkit.entity.Player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import myPlugin.game.TagGame;
import myPlugin.main;

public class TagListener implements Listener {

    private final main plugin;

   

    public TagListener(main plugin2) {
    	this.plugin = plugin2;
	}
	@EventHandler
    public void onPlayerTag(PlayerInteractEntityEvent event) {
    	if (!plugin.isGameRunning()) return;
    	
    	TagGame game = plugin.getGame();
    	if (event.getRightClicked() instanceof Player) {
    		Player tagger = event.getPlayer();
    		Player target = (Player) event.getRightClicked();
    		if (game.isPlaying(tagger) && game.isPlaying(target)) {
    			game.tag(tagger, target);
    		}
    	}
    }
}