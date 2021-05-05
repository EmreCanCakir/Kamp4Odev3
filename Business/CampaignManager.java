package Business;

import Entity.Campaign;

public class CampaignManager implements CampaignService{


    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" isimli kampanya eklenmiştir.");
    }

    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" isimli kampanyada değişiklik yapılmıştır.");
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" isimli kampanya silinmiştır.");
    }
}
