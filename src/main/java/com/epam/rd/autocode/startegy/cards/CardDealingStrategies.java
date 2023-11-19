package com.epam.rd.autocode.startegy.cards;

public class CardDealingStrategies {
    public static CardDealingStrategy texasHoldemCardDealingStrategy() {
        return new TexasHoldemCardDealingStrategyImplementation();
    }

    public static CardDealingStrategy classicPokerCardDealingStrategy() {
        return new ClassicPokerCardDealingStrategyImplementation();
    }

    public static CardDealingStrategy bridgeCardDealingStrategy(){
        return new BridgeCardDealingStrategyImplementation();
    }

    public static CardDealingStrategy foolCardDealingStrategy(){
        return new FoolCardDealingStrategyImplementation();
    }

}
