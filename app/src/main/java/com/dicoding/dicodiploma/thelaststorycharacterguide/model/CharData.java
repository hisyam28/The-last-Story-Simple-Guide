package com.dicoding.dicodiploma.thelaststorycharacterguide.model;

import java.util.ArrayList;

public class CharData {
    public static String[][] data = new String[][]{
            {"Zael", "A youth who, having lost all his relatives as a child, became a mercenary and has since fought all across the continent. Finally tired of struggling endlessly just to earn his daily bread, he now harbors dreams of becoming a knight. During his first mission after arriving on Lazulis Island, he encounters a strange phenomenon... ", "https://oyster.ignimgs.com/mediawiki/apis.ign.com/the-last-story/e/e1/The-Last-Story-Elza-Character-Artwork.png", "Human ", "Male", "Accelerate ","Chaos Blade "},
            {"Calista", "Calista is the princess of the House of Arganan that rules Lazulis Island. Both her parents died when she was very small. She is now forced to live a sheltered life under the watch of her uncle and current ruler of Lazulis Castle, Count Arganan. While she has almost given up on it ever coming true, she dreams of someday leaving the castle and traveling the world. ", "https://oyster.ignimgs.com/mediawiki/apis.ign.com/the-last-story/6/65/The-Last-Story-Kanan-Character-Artwork.png", "Human", "Female", "Ancient Barrier ", "Arganan Dagger"},
            {"Dagran", "Dagran is the leader of the band of mercenaries to which Zael and his other companions belong. His excellent abilities not only in combat but also in finding the mercenaries more work have won him their trust. He first met Zael when they were both much younger, and they have lived together since that time, with Dagran becoming something of an older brother to Zael. ", "https://oyster.ignimgs.com/mediawiki/apis.ign.com/the-last-story/b/b3/The-Last-Story-Quark-Character-Artwork.png", "Human", "Male","Death Sentence ", "Traive "},
            {"Syrenne", "Syrenne is a spirited swordswoman who fights with dual blades and is often the center of attention. She drinks too much and has a bit of a foul mouth, but she's very emotional and always thinks of her companions first. She enjoys fighting, and always cuts a swathe through the enemy, regardless of any potential dangers.", "https://oyster.ignimgs.com/mediawiki/apis.ign.com/the-last-story/8/8b/The-Last-Story-Seiren-Character-Artwork.png","Human", "Female","Shadow Bind ", "Dual Rogue Edges "},
            {"Yurick", "A wizard who fights using fire. The youngest member of the mercenaries, he nevertheless has exceptional skills. He says little and shows few emotions. He thinks of working as a mercenary as simply a way to survive. His father went missing when he was small, and his mother died soon after that, leaving him alone in the world. ", "https://oyster.ignimgs.com/mediawiki/apis.ign.com/the-last-story/b/b2/The-Last-Story-Yuris-Character-Artwork.png", "Human", "Male", "Meteor", "Affection Dagger"},
            {"Mirania", "Mirania has command of healing magic. To put it politely, she is mysterious; if one is less polite, she comes across as being a little vacant and strange. Her philosophical view of things and motherly nature are somehow linked to the secret behind her birth and upbringing. She also has an incredible appetite and can eat enough for ten men. ", "https://oyster.ignimgs.com/mediawiki/apis.ign.com/the-last-story/0/05/The-Last-Story-Manamia-Character-Artwork.png", "Human", "Female", "Revive ", "Wisdom Dagge"},
            {"Lowell", "Lowell is a wizard with a command over ice. He is a womaniser and a cynic, but at his core he is a tough, smart, and witty man. Although he always comes off as light and cheerful, he thinks of his companions as his family, and values the time he gets to spend with them. Although he uses magic in battle, he is also skilled with a blade, making him something of an all-rounder. ", "https://oyster.ignimgs.com/mediawiki/apis.ign.com/the-last-story/d/db/The-Last-Story-Jackal-Character-Artwork.png", "Human", "Male", "Glacier", "Witchcraft "},
            {"General Asthar", "A military man with an impressive history. He has perfect control of body and mind—the physical embodiment of a knight's path—and is the former Imperial Supreme Commander of the army. Seeing the tragedy of war first hand, he is one of the first to notice the connection between the conflict and the fact that the land is dying, and sets out on a journey alone. Gathering a variety of information leads him to a theory, indicating the answers lie on the mysterious Lazulis Island. ", "https://oyster.ignimgs.com/mediawiki/apis.ign.com/the-last-story/0/0c/The-Last-Story-General-Trista-Character-Artwork.png", "Human", "Male", "Minds Eye ", "General Sword"},
            {"Therius", "Therius is a young knight travelling with General Asthar. He sees Asthar as his master, and seeks to continue improving himself, but his youth sometimes exposes his lingering shortcomings. His skills with the blade and latent potential are said to be equal to Asthar's, and he intends to become a knight even greater than his master. ", "https://oyster.ignimgs.com/mediawiki/apis.ign.com/the-last-story/d/da/The-Last-Story-Tasha-Character-Artwork.png", "Human", "Male", "Jump Slash ", "Rapier"},
            {"Count Arganan", "The current head of the House of Arganan, the family that has ruled Lazulis Island for generations, Count Arganan is enjoying the power that this pivotal location holds for both trade and defense in the Empire. He is a skilled strategist and a deeply ambitious man. He is also the one now hiring Dagran's mercenary band. ", "https://oyster.ignimgs.com/mediawiki/apis.ign.com/the-last-story/d/d1/The-Last-Story-Arganan-Character-Artwork.png", "Human", "Male", "N/A ", "Sword(?)and Cane(?)"},
            {"Zangurak", "The tyrant and king who rules over The Gurak. His awesome power and charisma have allowed him to achieve unification of the Gurak for the first time in history. After encountering Zael and witnessing his strange power, he refers to it as the Outsider's power. ", "https://oyster.ignimgs.com/mediawiki/apis.ign.com/the-last-story/7/7a/The-Last-Story-Zangurg-Character-Artwork.png", "Gurak ", "Male", "Gathering", "Zan Lance "}

    };
    public static ArrayList<Char> getListData(){
        ArrayList<Char> list = new ArrayList<>();
        for (String[] aData : data){
            Char character = new Char();
            character.setName(aData[0]);
            character.setDescription(aData[1]);
            character.setPhoto(aData[2]);
            character.setSpecies(aData[3]);
            character.setGender(aData[4]);
            character.setSkill(aData[5]);
            character.setWeapon(aData[6]);


            list.add(character);
        }
        return list;
    }
}
