package com.epam.rd.autocode.factory.plot;

import javax.xml.stream.events.Characters;

public class MarvelPlotFactory implements PlotFactory{
    Character[] heroes;
    EpicCrisis epicCrisis;
    Character villain;
    public MarvelPlotFactory(Character[] heroes, EpicCrisis epicCrisis, Character villain) {
        this.heroes = heroes;
        this.epicCrisis = epicCrisis;
        this.villain = villain;
    }

    @Override
    public Plot plot() {
        return new Plot() {
            @Override
            public String toString() {
                String charactersStr = "";
                for (int i = 0; i < heroes.length; i++) {
                    charactersStr += " brave " + heroes[i].name();
                    if(i != heroes.length - 1) charactersStr += ",";
                }
                String template = epicCrisis.name() + " threatens the world. But" +
                        charactersStr + " on guard. So, no way that intrigues of " +
                        villain.name() + " overcome the willpower of inflexible heroes";
                return template;
            }
        };
    }
}
