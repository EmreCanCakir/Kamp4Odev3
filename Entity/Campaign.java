package Entity;

public class Campaign {
    private String campaignName;
    private int campaignRate;
    private int id;

    public Campaign(){

    }
    public Campaign(int id, String campaignName, int campaignRate){
        this.setId(id);
        this.setCampaignName(campaignName);
        this.setCampaignRate(campaignRate);
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public int getCampaignRate() {
        return campaignRate;
    }

    public void setCampaignRate(int campaignRate) {
        this.campaignRate = campaignRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
