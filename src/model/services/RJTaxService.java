package model.services;

import model.Interface.TaxService;

public class RJTaxService implements TaxService {
    public double tax(double amount) {
        if (amount <= 100.0) {
            return amount * 0.3;
        }
        else {
            return amount * 0.25;
        }
    }
}
