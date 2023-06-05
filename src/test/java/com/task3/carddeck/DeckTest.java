package com.task3.carddeck;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeckTest {

    Deck deck;

    @Before
    public void init() {
        deck = new Deck();
    }

    @Test
    public void testDeckSize() {
        assertEquals(36, deck.size());
    }

    @Test
    public void testDeckContains() {
        ArrayList<Card> actualCards = deck.getCards();
        List<Card> expectedCards = getExpectedCards();

        assertTrue(actualCards.containsAll(expectedCards));

        for (int i = 0; i < actualCards.size(); i++) {
            assertEquals(expectedCards.get(i), actualCards.get(i));
        }
    }

    @Test
    public void testDeckContainsAfterShuffle() {
        deck.shuffle();
        ArrayList<Card> actualCards = deck.getCards();
        List<Card> expectedCards = getExpectedCards();

        assertTrue(actualCards.containsAll(expectedCards));

        int notEqualsCount = 0;
        for (int i = 0; i < actualCards.size(); i++) {
            if (!Objects.equals(expectedCards.get(i), actualCards.get(i))) {
                notEqualsCount++;
            }
        }
        System.out.println(notEqualsCount);
        assertTrue(notEqualsCount > 0);
    }

    private List<Card> getExpectedCards() {
        return List.of(
                new Card(Rank.ACE, Suit.HEARTS),
                new Card(Rank.KING, Suit.HEARTS),
                new Card(Rank.QUEEN, Suit.HEARTS),
                new Card(Rank.JACK, Suit.HEARTS),
                new Card(Rank.TEN, Suit.HEARTS),
                new Card(Rank.NINE, Suit.HEARTS),
                new Card(Rank.EIGHT, Suit.HEARTS),
                new Card(Rank.SEVEN, Suit.HEARTS),
                new Card(Rank.SIX, Suit.HEARTS),
                new Card(Rank.ACE, Suit.DIAMONDS),
                new Card(Rank.KING, Suit.DIAMONDS),
                new Card(Rank.QUEEN, Suit.DIAMONDS),
                new Card(Rank.JACK, Suit.DIAMONDS),
                new Card(Rank.TEN, Suit.DIAMONDS),
                new Card(Rank.NINE, Suit.DIAMONDS),
                new Card(Rank.EIGHT, Suit.DIAMONDS),
                new Card(Rank.SEVEN, Suit.DIAMONDS),
                new Card(Rank.SIX, Suit.DIAMONDS),
                new Card(Rank.ACE, Suit.CLUBS),
                new Card(Rank.KING, Suit.CLUBS),
                new Card(Rank.QUEEN, Suit.CLUBS),
                new Card(Rank.JACK, Suit.CLUBS),
                new Card(Rank.TEN, Suit.CLUBS),
                new Card(Rank.NINE, Suit.CLUBS),
                new Card(Rank.EIGHT, Suit.CLUBS),
                new Card(Rank.SEVEN, Suit.CLUBS),
                new Card(Rank.SIX, Suit.CLUBS),
                new Card(Rank.ACE, Suit.SPADES),
                new Card(Rank.KING, Suit.SPADES),
                new Card(Rank.QUEEN, Suit.SPADES),
                new Card(Rank.JACK, Suit.SPADES),
                new Card(Rank.TEN, Suit.SPADES),
                new Card(Rank.NINE, Suit.SPADES),
                new Card(Rank.EIGHT, Suit.SPADES),
                new Card(Rank.SEVEN, Suit.SPADES),
                new Card(Rank.SIX, Suit.SPADES)
        );
    }

}
