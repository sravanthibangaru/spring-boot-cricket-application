// Write your code here
package com.example.player;
import com.example.player.Player;
import java.util.ArrayList;

public interface PlayerRepository{
    ArrayList<Player> getAllPlayers();
    Player addPlayer(Player player);
    Player updatePlayer(int playerId, Player player);
    Player getPlayerById(int playerId);
    void deletePlayer(int playerId);
}