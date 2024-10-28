package com.pluralsight;
public class Main {


    private static BlackJackGame game;

    public static void main(String[] args) throws Exception {

        game = new BlackJackGame();

        System.out.println("Welcome to Blackjack!");

        int numberOfPlayers = Console.PromptForInt("How many players (not including the dealer):");

        AddPlayersToGame(numberOfPlayers);

        game.DealCards();





    }

    public static void AddPlayersToGame(int numberOfPlayers){
        for (int i = 1 ; i <= numberOfPlayers ; i++){
            String playerName = Console.PromptForString("Please enter the name of player " + i + ": ");
            game.AddPlayer(playerName);
        }
    }


}