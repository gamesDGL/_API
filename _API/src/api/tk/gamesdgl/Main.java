package api.tk.gamesdgl;

import org.bukkit.plugin.java.JavaPlugin;

import tk.gamesdgl.API;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		API.cmd.sendMessage("§f§lGames§6§lAPI§7> §aHabilitado com sucesso.");
		Load();
	}
	public void onDisable() {
		API.cmd.sendMessage("§f§lGames§6§lAPI§7> §cDesabilitado com sucesso.");
	}
	
	public void Load(){
		
	}

}
