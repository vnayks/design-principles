package CoffeeMaker.service;

import CoffeeMaker.client.CoffeeMakerApi;
import CoffeeMaker.client.CoffeeMakerApiImpl;

public class CoffeeMakerImpl implements CoffeeMaker {

    private CoffeeMakerApi coffeeMakerApi;

    public CoffeeMakerImpl() {
        coffeeMakerApi = new CoffeeMakerApiImpl();
    }

    @Override
    public void brew() {

    }
}
