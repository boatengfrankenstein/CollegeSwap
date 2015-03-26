package edu.ua.collegeswap.database;

import java.util.ArrayList;
import java.util.List;

import edu.ua.collegeswap.viewModel.Account;
import edu.ua.collegeswap.viewModel.Listing;
import edu.ua.collegeswap.viewModel.Ticket;

/**
 * Created by Patrick on 3/25/2015.
 */
public class TicketAccessor extends ListingAccessor {
    @Override
    public List<Listing> getAll() {
        //TODO
        return null;
    }

    @Override
    public List<Listing> getByPrice(int minPrice, int maxPrice) {
        //TODO
        return null;
    }

    @Override
    public List<Listing> getByUser(Account account) {
        //TODO
        return null;
    }

    /**
     * @param game the name of the football game.  See TicketAccessor.getGames()
     * @return a list of all Ticket Listings for a given game
     */
    public List<Ticket> getByGame(String game) {
        //TODO
        return null;
    }

    /**
     * @return a list of all games
     */
    public List<String> getGames() {
        //TODO

        List<String> l = new ArrayList<>();

        l.add("West Carolina");
        l.add("Auburn");

        return l;
    }

    /**
     * @param game     the name of the football game.  See TicketAccessor.getGames()
     * @param minPrice the minimum price of Ticket Listings to return
     * @param maxPrice the maximum price of Ticket Listings to return
     * @return a list of all Ticket listings for a given game within the given price range
     */
    public List<Ticket> get(String game, int minPrice, int maxPrice) {
        //TODO
        return null;
    }
}
