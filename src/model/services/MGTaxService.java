package model.services;

import model.Interface.TaxService;

public class MGTaxService implements TaxService {
    public double tax(double amount) {
        if (amount <= 100.0) {
            return amount * 0.15;
        }
        else {
            return amount * 0.10;
        }
    }
}
