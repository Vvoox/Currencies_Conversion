package bean;

import java.io.Serializable;

public class Currency implements Serializable {
    private String currencyForm;
    private String currencyTo;
    private String result;
    private double quantity;
    private static final long serialVersionUID = 1L;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Currency() {
    }

    public Currency(String currencyForm, String currencyTo, double quantity) {
        this.currencyForm = currencyForm;
        this.currencyTo = currencyTo;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "currencyForm='" + currencyForm + '\'' +
                ", currencyTo='" + currencyTo + '\'' +
                ", result='" + result + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public String getCurrencyForm() {
        return currencyForm;
    }

    public void setCurrencyForm(String currencyForm) {
        this.currencyForm = currencyForm;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public void setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
