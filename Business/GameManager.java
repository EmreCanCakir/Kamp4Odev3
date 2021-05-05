package Business;

import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public class GameManager implements GameService{
    int x;
    @Override
    public void sellGame(Game game, Campaign campaign, Gamer gamer) {
        System.out.println(game.getName()+" isimli oyun, "+gamer.getFirstName()+" isimli oyuncuya %"+campaign.getCampaignRate()+" oraninda kampanya ile "+x+" Tl fiyatina satilmistir.");
    }

    @Override
    public int calculateAfterCampaignPrice(Game game, Campaign campaign) {
        return x= game.getPrice()-(game.getPrice()*campaign.getCampaignRate()/100);
    }


}
