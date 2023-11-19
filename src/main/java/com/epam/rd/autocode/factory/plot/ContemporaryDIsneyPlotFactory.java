package com.epam.rd.autocode.factory.plot;

public class ContemporaryDIsneyPlotFactory implements PlotFactory{
    Character hero;
    EpicCrisis epicCrisis;
    Character funnyFriend;
    public ContemporaryDIsneyPlotFactory(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
        this.hero = hero;
        this.epicCrisis = epicCrisis;
        this.funnyFriend = funnyFriend;
    }

    @Override
    public Plot plot() {
        return new Plot() {
            @Override
            public String toString() {
                return hero.name() + " feels a bit awkward and uncomfortable. But personal issues fades, when a big trouble comes - "
                        + epicCrisis.name() + ". " + hero.name()
                        + " stands up against it, but with no success at first.But putting self together and help of friends, " +
                        "including spectacular funny " + funnyFriend.name() + " restore the spirit and " +
                        hero.name() + " overcomes the crisis and gains gratitude and respect";
            }
        };
    }
}
