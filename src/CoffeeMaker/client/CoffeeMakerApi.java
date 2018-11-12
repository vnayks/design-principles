package CoffeeMaker.client;

import CoffeeMaker.dto.*;

public interface CoffeeMakerApi {

    WarmerPlateStatus getWarmerPlateStatus();
    BoilerStatus getBoilerStatus();
    BrewButtonStatus getBrewButtonStatus();
    void setWarmerState(WarmerPlateHeaterState sate);
    void setBoilerState(BoilerState state);
    void setIndicatorState(IndicatorState state);
    void setReliefValveState(ReliefValveState state);
}
