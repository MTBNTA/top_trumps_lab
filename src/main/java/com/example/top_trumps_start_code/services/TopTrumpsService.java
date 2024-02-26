package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Rank;
import com.example.top_trumps_start_code.models.Suit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TopTrumpsService {

    public String checkWinner(ArrayList<Card> cards){

        Card card1 = cards.get(0);
        Card card2 = cards.get(1);

        if (card1.getCardValue() > card2.getCardValue()){
            return card1.getRank() + " of " + card1.getSuit() + " wins! ";
        } else if (card1.getCardValue() == card2.getCardValue()) {
            return "It's a draw!";
        } else {
            return card2.getRank() + " of " + card2.getSuit() + " wins!";
        }

    }

}
