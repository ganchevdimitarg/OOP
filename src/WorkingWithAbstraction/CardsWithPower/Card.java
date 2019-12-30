package CardsWithPower;

public class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public int calculatePower(){
        return RankPowers.valueOf(this.getRank()).getRankPowers() + SuitPowers.valueOf(this.getSuit()).getSuitPowers();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
                this.getRank(), this.getSuit(), this.calculatePower());
    }
}
