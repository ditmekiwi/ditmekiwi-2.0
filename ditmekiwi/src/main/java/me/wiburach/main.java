package me.wiburach;

import me.wiburach.Commands.Commands;
import me.wiburach.events.events;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        Commands commands = new Commands();
        getServer().getPluginManager().registerEvents(new events(), this);
        getCommand("heal").setExecutor(commands);
        getCommand("feed").setExecutor(commands);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[ditmekiwi]: plugin is enabled");

    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[ditmekiwi]: plugin is disabled");
    }
}
