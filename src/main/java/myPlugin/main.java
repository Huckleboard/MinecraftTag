package myPlugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import myPlugin.commands.JoinCommand;
import myPlugin.commands.tagCommand;
import myPlugin.game.TagGame;
import myPlugin.listeners.TagListener;

public class main extends JavaPlugin {
	
	private TagGame game;
	private boolean isGameRunning = false;
	private boolean isJoiningPeriod = false;
	private int joinTimeRemaining = 30;
	
	@Override
    public void onEnable() {
		//Making and define the game variable
        this.game = new TagGame(this);
        
        //Register commands
        getCommand("tag").setExecutor(new tagCommand(this));
        getCommand("join").setExecutor(new JoinCommand(this));
        
        //Register listeners
        getServer().getPluginManager().registerEvents(new TagListener(this), this);
        getLogger().info("TagGame plugin enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("MyPaperPlugin has been disabled!");
    }
    
    public TagGame getGame() { return game; }
    public boolean isGameRunning() { return isGameRunning; }
    public boolean isJoiningRunning() { return isJoiningPeriod; }
    public void setGameRunning(boolean running) { isGameRunning = running; }
    public void setJoiningPeriod(boolean joining) { isJoiningPeriod = joining; }
    public int getJoinTimeRemaining() {return joinTimeRemaining; }
    public void setJoinTimeRemaining(int time) {joinTimeRemaining = time;}
}
