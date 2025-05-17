package myPlugin;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.scheduler.BukkitRunnable;


public class CountdownTimer {
	
	private int timeLeft;
	private final int initialTime;
	
	private BukkitRunnable task;
	private final main mainPlugin;
	
	public CountdownTimer(main mainPlugin, int initialTime) {
		this.mainPlugin = mainPlugin;
		this.initialTime = initialTime;
		
		this.timeLeft = initialTime;

	}
	
	public void start() {
		if (task != null){
			task.cancel();
		}
		
		task = new BukkitRunnable() {
			
			@Override
			public void run() {
				if (timeLeft <= 0) {
					
					Bukkit.broadcastMessage("Times up BOI");
					//onFinish.run();
					task.cancel();
					resetAndStart();
					return;
				}
				
				//Boss bar for time left UI (Future coding)
				
				timeLeft--;
				
			}
		};
		
		task.runTaskTimer(mainPlugin, 0L, 20L);
		
		
	}
	
	
	
	public void reset() {
		if (task != null){
			task.cancel();
		}
		timeLeft = initialTime;
		
		
	}
	
	public void resetAndStart() {
		reset();
		start();
	}
	
	
	public void stop() {
		if (task != null){
			task.cancel();
		}
		
	}

}
