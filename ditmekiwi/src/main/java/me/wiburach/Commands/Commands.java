package me.wiburach.Commands;

import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Chỉ có người chơi mới dùng được lệnh");
            return true;
        }
        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("heal")) {
            double maxHealth = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue();
            player.setHealth(maxHealth);
            player.sendMessage(ChatColor.AQUA + "(!)bạn đã được hồi máu");
        }

        else if (cmd.getName().equalsIgnoreCase("feed")) {
            player.setFoodLevel(20);
            player.sendMessage(ChatColor.AQUA + "(!)bạn đã no");
        }
        return true;
    }
}
