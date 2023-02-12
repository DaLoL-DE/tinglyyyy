package dev.dalol.main.listener;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinQuitListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.setJoinMessage(ChatColor.AQUA + event.getPlayer().getDisplayName() + " hat den Craftattack Server betreten.");
    }
    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        event.setQuitMessage(ChatColor.RED + event.getPlayer().getDisplayName() + " hatte keine bock mehr auf CA 3.");
    }
}
