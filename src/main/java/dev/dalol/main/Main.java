package dev.dalol.main;

import dev.dalol.main.commands.GMCommand;
import dev.dalol.main.commands.TestCommand;
import dev.dalol.main.listener.JoinQuitListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin gestartet.");
        getCommand("test").setExecutor(new TestCommand());
        getCommand("gm").setExecutor(new GMCommand());


        PluginManager pluginManager = Bukkit.getPluginManager();

        pluginManager.registerEvents(new JoinQuitListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin entladen.");
    }
}
