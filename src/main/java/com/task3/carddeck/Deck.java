package com.task3.carddeck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Deck {
    private final ArrayList<Card> cards = new ArrayList<>();

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Deck() {
        for (Suit suit : Suit.values) {
            for (Rank rank : Rank.values) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public int size() {
        return cards.size();
    }

    //Перемішує колоду у випадковому порядку
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /* * Впорядкування колоди за мастями та значеннями
     * Порядок сотрування:
     * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
     * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
     * Наприклад
     * HEARTS Ace
     * HEARTS King
     * HEARTS Queen
     * HEARTS Jack
     * HEARTS 10
     * HEARTS 9
     * HEARTS 8
     * HEARTS 7
     * HEARTS 6
     * І так далі для DIAMONDS, CLUBS, SPADES */

    public void order() {
        cards.sort((o1, o2) -> {
            int indexSuit1 = 0;
            int indexSuit2 = 0;
            int indexRank1 = 0;
            int indexRank2 = 0;

            Suit[] suits = Suit.values;
            Rank[] ranks = Rank.values;

            for (int i = 0; i < suits.length; i++) {
                if (o1.getSuit().getName().equals(suits[i].getName())) {
                    indexSuit1 = i;
                }
                if (o2.getSuit().getName().equals(suits[i].getName())) {
                    indexSuit2 = i;
                }
            }
            for (int i = 0; i < ranks.length; i++) {
                if (o1.getRank().getName().equals(ranks[i].getName())) {
                    indexRank1 = i;
                }
                if (o2.getRank().getName().equals(ranks[i].getName())) {
                    indexRank2 = i;
                }
            }

            if (indexSuit1 == indexSuit2) {
                return Integer.compare(indexRank1, indexRank2);
            } else if (indexSuit1 > indexSuit2) {
                return 1;
            } else {
                return -1;
            }
        });
    }

    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
        return cards.size() > 0;
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        if (hasNext()) {
            return cards.remove(cards.size() - 1);
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deck deck = (Deck) o;
        return Objects.equals(cards, deck.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cards);
    }
}
