import model.Interface.TaxService;
import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        System.out.print("Escolha o destino do imposto (BA/RJ/MG/SP): ");
        String originTax = sc.nextLine().toUpperCase();

        while (!originTax.equals("BA")
                && !originTax.equals("RJ")
                && !originTax.equals("MG")
                && !originTax.equals("SP")
        ) {
            System.out.print("Valor invlaido: Escolha o destino do imposto (BA/RJ/RJ/SP): ");
            originTax = sc.nextLine().toUpperCase();
        }

        TaxService tax;

        if (originTax.equals("BA")) {
            tax = new BATaxService();
        } else if(originTax.equals("RJ")) {
            tax = new RJTaxService();
        } else if(originTax.equals("MG")) {
            tax = new MGTaxService();
        } else {
            tax = new SPTaxService();
        }

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, tax);

        rentalService.processInvoice(cr);

        System.out.println("FATURA:");
        System.out.println("Imposto de destino: " + originTax);
        System.out.println("Pagamento basico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        sc.close();
    }
}