package me.kokored.koko_joinmotd;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class PlayerJoin implements Listener {

    Plugin plugin = Koko_JoinMotd.getPlugin(Koko_JoinMotd.class);

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();

        if (plugin.getConfig().getBoolean("join-msg")) {
            event.setJoinMessage(ChatColor.AQUA + "Welcome back" + " " + ChatColor.YELLOW + p.getDisplayName());

        }
        if (plugin.getConfig().getBoolean("motd")) {

            int online = Bukkit.getServer().getOnlinePlayers().size();

            for (int i = 0 ; i < plugin.getConfig().getList("motd-msg").size() ; i++) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getList("motd-msg").get(i).toString()));

            }

        }


    }
}
