package Business;

import Entity.Gamer;

public class ValidationManager implements ValidationService {
    @Override
    public String validation(Gamer gamer) {
        if((gamer.getIdentificationNumber()==11)&&gamer.getIdentificationNumber()%2 ==0 ){
            System.out.println("geçerli kullanıcı");
            return "geçerli kullanıcı!";
        }
        else
            System.out.println("geçersiz kullanıcı!");
            return "geçersiz kullanıcı!!";
}
}
