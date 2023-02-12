package dev.dalol.main.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GMCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        if (sender == null) {
            sender.sendMessage(ChatColor.RED + "Das kann nur ein Spieler ausführen!");
            return false;
        }

        if (args.length >= 1) {
            switch (args[0].toUpperCase()) {
                case "1":
                    player.setGameMode(GameMode.CREATIVE);
                    player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Craftattack" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Dein Spielmodus wurde auf Kreativ aktuallisiert.");
                case "2":
                    player.setGameMode(GameMode.ADVENTURE);
                    player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Craftattack" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Dein Spielmodus wurde auf Abenteuer aktuallisiert.");
                case "3":
                    player.setGameMode(GameMode.SPECTATOR);
                    player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Craftattack" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Dein Spielmodus wurde auf Zuschauer aktuallisiert.");
                case "0":
                    player.setGameMode(GameMode.SURVIVAL);
                    player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Craftattack" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Dein Spielmodus wurde auf Überleben aktuallisiert.");
                case "creative":
                    player.setGameMode(GameMode.CREATIVE);
                    player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Craftattack" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Dein Spielmodus wurde auf Kreativ aktuallisiert.");
                case "survival":
                    player.setGameMode(GameMode.SURVIVAL);
                    player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Craftattack" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Dein Spielmodus wurde auf Überleben aktuallisiert.");
                case "adventure":
                    player.setGameMode(GameMode.ADVENTURE);
                    player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Craftattack" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Dein Spielmodus wurde auf Abenteuer aktuallisiert.");
                case "spectator":
                    player.setGameMode(GameMode.SPECTATOR);
                    player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Craftattack" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Dein Spielmodus wurde auf Zuschauer aktuallisiert.");
                default:
                    sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Craftattack" + ChatColor.DARK_GRAY + "]" + ChatColor.RED + " Usage: /gm <1, 2, 3, 0>");
            }
        } else {
            sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Craftattack" + ChatColor.DARK_GRAY + "]" + ChatColor.RED + " Usage: /gm <1, 2, 3, 0>");
        }
        return false;
    }
}
