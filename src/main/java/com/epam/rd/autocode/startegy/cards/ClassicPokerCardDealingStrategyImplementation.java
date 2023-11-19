package com.epam.rd.autocode.startegy.cards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassicPokerCardDealingStrategyImplementation implements CardDealingStrategy{
    Map<String, List<Card>> stacks;
    private Card card;
    @Override
    public Map<String, List<Card>> dealStacks(Deck deck, int players) {
        stacks = new HashMap<>();
        dealPlayerCards(deck, players);
        stacks.put("Remaining",deck.restCards());
        return stacks;
    }
    private void dealPlayerCards(Deck deck, int players) {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= players; j++) {
                String player = "Player " + j;
                card = deck.dealCard();
                if(!stacks.containsKey(player)) {
                    ArrayList<Card> playerCardList = new ArrayList<>();
                    playerCardList.add(card);
                    stacks.put("Player " + j, playerCardList);
                } else{
                    stacks.get(player).add(card);
                }
            }
        }
    }
}
