package me.kokored.koko_joinmotd;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class MotdCmd implements CommandExecutor {
    Plugin plugin = Koko_JoinMotd.getPlugin(Koko_JoinMotd.class);
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("kokojoinmotd.motd")) {
            sender.sendMessage(" ");
            sender.sendMessage(ChatColor.YELLOW + "The Server Join Motd Is:");
            for (int i = 0 ; i < plugin.getConfig().getList("motd-msg").size() ; i++) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getList("motd-msg").get(i).toString()));

            }
            sender.sendMessage(" ");
        }
        return false;
    }
}
