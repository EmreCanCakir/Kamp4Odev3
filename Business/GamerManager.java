package Business;

import Entity.Gamer;

public class GamerManager implements GamerService{
    private ValidationManager validationManager;


    @Override
    public void add(Gamer gamer, ValidationManager validationManager) {
        System.out.println(gamer.getFirstName()+ " Isimli oyuncu eklenmistir. ");
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getFirstName()+" Isimli oyuncu silinmistir.");
    }

    @Override
    public void check(Gamer gamer, ValidationManager validationManager) {
        System.out.println("Girilen bilgilere göre "+ validationManager.validation(gamer));
    }
}
