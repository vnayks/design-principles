package CoffeeMaker.dto;

public enum WarmerPlateHeaterState {

    On("On"),
    Off("Off");

    private String status;

    WarmerPlateHeaterState(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
