package Business;

import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public interface GameService {
    void sellGame(Game game, Campaign campaign, Gamer gamer);
    int calculateAfterCampaignPrice(Game game, Campaign campaign);
}
