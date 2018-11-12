package CoffeeMaker.dto;

public enum WarmerPlateStatus {

    WARMER_EMPTY("WarmerEmpty"),
    POT_EMPTY("PotEmpty"),
    POT_NOT_EMPTY("PotNotEmpty");

    private String status;

    WarmerPlateStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
