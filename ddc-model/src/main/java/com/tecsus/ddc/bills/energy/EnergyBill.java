package com.tecsus.ddc.bills.energy;

import com.tecsus.ddc.bills.Bill;
import com.tecsus.ddc.bills.energy.enums.Modalities;
import com.tecsus.ddc.bills.energy.enums.SupplyType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author TOBIASDASILVALINO
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EnergyBill {

    private int id;
    private Bill bill;

    private DateTime emission;
    // Dados do Contrato
    private BigDecimal consumption;
    private int tension;     // Volts
    private Group group;    // Grupo/subgrupo
    private Classe classe;  // Classe/subclasse
    private SupplyType supplyType;
    private BigDecimal financialItems;
    private Modalities modalitie;
    private BigDecimal tributes;
    private BigDecimal icms;
    // Tarifas
    private final List<TariffFlag> tariffFlags = new ArrayList<>();
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addTariffFlag(TariffFlag tariffFlag) {
        tariffFlags.add(tariffFlag);
    }
}
