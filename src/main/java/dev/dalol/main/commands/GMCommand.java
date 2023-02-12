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
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Das kann nur ein Spieler ausführen!");
            return false;
        }

        Player player = (Player) sender;
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("1")) {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Craftattack" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Dein Spielmodus wurde auf Kreativ aktuallisiert.");
            } else if (args[0].equalsIgnoreCase("2")) {
                player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Craftattack" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Dein Spielmodus wurde auf Abenteuer aktuallisiert.");
                player.setGameMode(GameMode.ADVENTURE);
            } else if (args[0].equalsIgnoreCase("3")) {
                player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Craftattack" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Dein Spielmodus wurde auf Zuschauer aktuallisiert.");
                player.setGameMode(GameMode.SPECTATOR);
            } else if (args[0].equalsIgnoreCase("0")) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Craftattack" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Dein Spielmodus wurde auf Überleben aktuallisiert.");
            } else if (args[0].equalsIgnoreCase("survival")) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Craftattack" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Dein Spielmodus wurde auf Überleben aktuallisiert.");
            } else if (args[0].equalsIgnoreCase("creative")) {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Craftattack" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Dein Spielmodus wurde auf Kreativ aktuallisiert.");
            } else if (args[0].equalsIgnoreCase("spectator")) {
                player.setGameMode(GameMode.SPECTATOR);
                player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Craftattack" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Dein Spielmodus wurde auf Zuschauer aktuallisiert.");
            } else if (args[0].equalsIgnoreCase("adventure")) {
                player.setGameMode(GameMode.ADVENTURE);
                player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Craftattack" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Dein Spielmodus wurde auf Überleben aktuallisiert.");
            } else {
                sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Craftattack" + ChatColor.DARK_GRAY + "]" + ChatColor.RED + " Usage: /gm <1, 2, 3, 0>");
            }

        } else {
            sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Craftattack" + ChatColor.DARK_GRAY + "]" + ChatColor.RED + " Usage: /gm <1, 2, 3, 0>");
        }
        return false;
    }
}
