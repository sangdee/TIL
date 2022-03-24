package design_pattern.template_method;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/23
 */
public class SoldierConscriptionHelperImpl implements SoldierConscriptionHelper{
    @Override
    public Citizen conscriptionCitizen() {
        System.out.println("징병");
        return new Citizen();
    }

    @Override
    public void training(Citizen citizen) {
        citizen.updateStrength();
        System.out.println("훈련");
    }

    @Override
    public void supplyEquipment(Solider solider) {
        solider.setWeapon(new Gun());
    }

    @Override
    public Solider changePosition(Citizen citizen) {
        return new Solider(citizen);
    }
}
