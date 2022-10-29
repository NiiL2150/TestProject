package com.itstep.testjava.models;
import javafx.scene.control.ComboBox;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SticksGame {
    String playerName;
    String computerName;
    final int stickCount = 15;
    int stickLeft;
    int stickBusy;
    boolean playerMove;

    public SticksGame(String playerName) {
        this.playerName = playerName;
        this.computerName = "CPU";
        try{
            InetAddress addr;
            addr = InetAddress.getLocalHost();
            this.computerName = addr.getHostName();
        }
        catch (UnknownHostException ignored) {}
        finally {
            Reset();
        }
    }

    public void Reset(){
        this.stickBusy = 0;
        this.stickLeft = this.stickCount;
        this.playerMove = false;
    }

    public void Start(){
        int playerGot = 0;
        Scanner sc = new Scanner(System.in);
        while(stickLeft > 0){
            System.out.println("\nSticks left: " + stickLeft);
            if(playerMove){
                System.out.print("How many sticks do you choose (1-3): ");
                playerGot = Integer.parseInt(sc.next());
                if(playerGot > 3){
                    playerGot = 3;
                }
                else if (playerGot < 1){
                    playerGot = 1;
                }
                if(playerGot > stickLeft){
                    playerGot = stickLeft;
                }
                Take(playerGot, playerName);
                playerMove = false;
            }
            else{
                if(playerGot == 0){
                    Take(2, computerName);
                }
                else{
                    Take(4-playerGot, computerName);
                }
                playerMove = true;
            }
        }
        if(!playerMove){
            System.out.println("You lost!");
        }
        else{
            System.out.println("You won!");
        }
    }

    void Take(int count, String name){
        Take(count, 1, 3, name);
    }

    void Take(int count, int min, int max, String name){
        if(count < min){
            count = min;
        }
        else if(count > max){
            count = max;
        }
        if(count > stickLeft){
            count = stickLeft;
        }
        this.stickLeft -= count;
        this.stickBusy += count;
        System.out.println(name + " took " + count + " sticks");
    }
}
