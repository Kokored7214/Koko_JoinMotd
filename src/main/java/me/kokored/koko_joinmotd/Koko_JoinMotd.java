package me.kokored.koko_joinmotd;

import org.bukkit.plugin.java.JavaPlugin;

public final class Koko_JoinMotd extends JavaPlugin{

    @Override
    public void onEnable() {
        System.out.println("Koko_JoinMotd has enabled");

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new PlayerJoin(),this);
        getCommand("motd").setExecutor(new MotdCmd());

    }

    @Override
    public void onDisable() {
        System.out.println("Koko_JoinMotd has disabled");

    }
}
