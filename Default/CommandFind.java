package net.md_5.bungee.module.cmd.find;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.command.PlayerCommand;

public class CommandFind
  extends PlayerCommand
{
    public CommandFind()
    {
        super("find", "bungeeecord.command.find", new String[0]);
    }

    public void execute(CommandSender sender, String[] args)
    {
        if (args.length != 1)
        {
            sender.sendMessage(ChatColor.RED + "Añade al jugador que buscas");
        }
        else
        {
            ProxiedPlayer player = ProxyServer.getInstance().getPlayer(args[0]);
            if ((player == null) || (player.getServer() == null)) {
                sender.sendMessage(ChatColor.RED + "Usuario desconctado");
            } else {
                sender.sendMessage(ChatColor.GREEN + args[0] + ChatColor.BLUE + " esta conectado en " + ChatColor.GOLD + player.getServer().getInfo().getName());
            }
        }
    }
}
