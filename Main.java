import Business.CampaignManager;
import Business.GameManager;
import Business.GamerManager;
import Business.ValidationManager;
import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public class Main {
    public static void main(String [] args) {
        Game game = new Game(1,100, "RDR2","story game");
        Gamer gamer = new Gamer(1000000000,"Emre Can", "Çakır","22 şubat" );
        Campaign campaign = new Campaign(1,"Mayis İndirimi", 20);
        System.out.println("---------------------------");
        ValidationManager validationManager = new ValidationManager();
        CampaignManager campaignManager = new CampaignManager();
        campaignManager.addCampaign(campaign);
        campaignManager.deleteCampaign(campaign);
        campaignManager.updateCampaign(campaign);
        System.out.println("---------------------------");
        GameManager gameManager = new GameManager();
        gameManager.calculateAfterCampaignPrice(game,campaign);
        gameManager.sellGame(game,campaign,gamer);
        System.out.println("---------------------------");
        GamerManager gamerManager = new GamerManager();
        gamerManager.add(gamer, validationManager );
        gamerManager.check(gamer, validationManager);
        gamerManager.delete(gamer);
        System.out.println("---------------------------");


    }
}
