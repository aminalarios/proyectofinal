package model;

import java.io.Serializable;

/**
 * Created by Amine Banks on 02/11/2015.
 */
public class ExchangeModel implements Serializable{

    private String nameCountryOrigin, nameCountryDestination,  moneyCountryOrigin,
            moneyCountryDestination, rateExchangeMoney, quantityMoney;

    public ExchangeModel(String nameCountryOrigin, String nameCountryDestination,
                         String moneyCountryOrigin, String moneyCountryDestination,String quantityMoney){

        this.moneyCountryDestination=moneyCountryDestination;
        this.nameCountryDestination=nameCountryDestination;
        this.moneyCountryOrigin=moneyCountryOrigin;

        this.nameCountryOrigin=nameCountryOrigin;
        this.quantityMoney=quantityMoney;
    }



    public String getNameCountryOrigin(){return nameCountryOrigin;}

    public String getNameCountryDestination(){return nameCountryDestination;}

    public String getMoneyCountryOrigin(){return moneyCountryOrigin;}

    public String getMoneyCountryDestination(){return moneyCountryDestination;}

    public String getQuantityMoney() {return quantityMoney;}

    public void setNameCountryOrigin(String nameCountryOrigin) {
        this.nameCountryOrigin = nameCountryOrigin;
    }

    public void setNameCountryDestination(String nameCountryDestination) {
        this.nameCountryDestination = nameCountryDestination;
    }

    public void setQuantityMoney(String quantityMoney) {
        this.quantityMoney = quantityMoney;
    }

    public void setMoneyCountryOrigin(String moneyCountryOrigin) {
        this.moneyCountryOrigin = moneyCountryOrigin;
    }

    public void setMoneyCountryDestination(String moneyCountryDestination) {
        this.moneyCountryDestination = moneyCountryDestination;
    }


}
