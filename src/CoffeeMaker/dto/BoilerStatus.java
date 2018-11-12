package CoffeeMaker.dto;

public enum BoilerStatus {

    EMPTY("EMPTY"),
    NOT_EMPTY("NOT_EMPTY");

    private String status;

    BoilerStatus(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
