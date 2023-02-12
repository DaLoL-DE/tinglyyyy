package dev.dalol.main.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Craftattack" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Dies ist ein Test Command! Wenn du das hier siehst dann sitzt DaLoL vlt. grad an diesem Plugin :))");

        return false;
    }
}
