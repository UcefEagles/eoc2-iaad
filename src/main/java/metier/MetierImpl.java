package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    // Couplage Faible


    private IDao dao;

    public MetierImpl(IDao dao){
        this.dao=dao;
    }

    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*540/275;
        return res;

    }
//
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
