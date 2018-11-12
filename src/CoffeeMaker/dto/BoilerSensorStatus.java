package CoffeeMaker.dto;

public enum  BoilerSensorStatus {

    BOILER_EMPTY("BOILER_EMPTY"),
    BOILER_NOT_EMPTY("BOILER_NOT_EMPTY");

    private String status;

    BoilerSensorStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
