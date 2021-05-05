package Business;

import Entity.Gamer;

public interface GamerService {
    void add(Gamer gamer, ValidationManager validationManager);
    void delete(Gamer gamer);
    void check(Gamer gamer, ValidationManager validationManager);

}
