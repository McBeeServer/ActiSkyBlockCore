package com.metaxcrew.actiskyblockcore.staffcommands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GameModeCreative implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("acs_staff_gamemode")) {
                p.setGameMode(GameMode.CREATIVE);
                p.sendMessage(ChatColor.of("#94A8E2") + "You changed your gamemode to: " + ChatColor.of("#2255DF") + "CREATIVE");
            }else{
                sender.sendMessage(ChatColor.of("#2255DF") + "You do not have permission to execute this command!");
            }
        }
        return true;}

}
