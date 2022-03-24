package design_pattern.template_method;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/23
 */
public interface SoldierConscriptionHelper {
    Citizen conscriptionCitizen();

    void training(Citizen citizen);

    void supplyEquipment(Solider solider);

    Solider changePosition(Citizen citizen);

    default Solider conscription() {
        Citizen citizen = conscriptionCitizen();
        training(citizen);
        Solider solider = changePosition(citizen);
        supplyEquipment(solider);
        return solider;
    }

}
