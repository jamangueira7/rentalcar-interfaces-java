package model.services;

import model.Interface.TaxService;

public class BATaxService implements TaxService {
    public double tax(double amount) {
        if (amount <= 100.0) {
            return amount * 0.1;
        }
        else {
            return amount * 0.5;
        }
    }
}
