import java.awt.*;

public class Card {
    /**
     * The values defined below are called "fields". Their scope is contained within an instance of the Card class.
     *
     * This boolean field says whether the card is face up or face down. Initially, all cards should be face down.
     */
    boolean isFaceUp = false;

    /**
     * This boolean field says whether the card is matched or not. Initially, all cards should be unmatched.
     */
    boolean isMatched = false;

    /**
     * On this field, the keyword "final" means the value of the card's color cannot change after it is constructed.
     */
    final Color color;

    /**
     * This special method is the card constructor. It can be called like:
     *   new Card(Color.BLUE)
     * and it returns a new "instance" of the Card class.
     */
    public Card(Color requestedColor) {
        // Fields can either be initialized where they're declared, like isFaceUp and isMatched, or they can be
        // initialized in class constructors.

        // Currently, we are setting the color of every card to the constant value of Color.PINK. Fix the code by
        // setting color to the value of the requested color.
        color = Color.PINK;
    }

    /**
     * This method is responsible for noting when a card has been matched.
     */
    void setMatched() {
        // Currently, nothing happens when this method is called. Fix the code by updating the value of an appropriate
        // field in the Card class.
    }

    /**
     * This method is responsible for checking if a card is equal to another card. For the purpose of this game, two
     * cards are considered equal if they have the same color.
     *
     * Remember, card1 == card2 will always be false for difference instances of the Card class because card1 and card2
     * are objects, not a primitive type. The same is true for color—we have to use color1.equals(color2), and we can't
     * use color1 == color2.
     */
    boolean equals(Card other) {
        return color.equals(other.color);
    }

    /**
     * This method is responsible for flipping the card over. It changes the value of isFaceUp to its opposite, which
     * is what happens when you flip a card in a card game.
     */
    void flip() {
        // EXTRA CREDIT: can you rewrite this code to have the same functionality, but only use one line of code?
        if (isFaceUp) {
            isFaceUp = false;
        } else {
            isFaceUp = true;
        }
    }
}
