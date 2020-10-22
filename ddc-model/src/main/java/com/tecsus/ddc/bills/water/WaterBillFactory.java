package com.tecsus.ddc.bills.water;

import com.tecsus.ddc.bills.BillFactory;
import com.tecsus.ddc.bills.water.builders.WaterBillBuilder;
import com.tecsus.ddc.bills.water.enums.BillingType;
import com.tecsus.ddc.bills.water.enums.ConnectionType;

import javax.ejb.ObjectNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WaterBillFactory {

    public static WaterBill constructBillFromResultSet(ResultSet rs) throws SQLException, ObjectNotFoundException {
        if (rs == null) {
            throw new ObjectNotFoundException("ResultSet is null");
        }
        return WaterBillBuilder.aWaterBill()
                .bill(BillFactory.constructBillFromResultSet(rs))
                .id(rs.getInt("id_water_type"))
                .conType(ConnectionType.valueOf(rs.getString("con_type")))
                .billingType(BillingType.valueOf(rs.getString("billing_type")))
                .consum(rs.getBigDecimal("consum_m3"))
                .water(rs.getBigDecimal("water_val"))
                .sewer(rs.getBigDecimal("sewer_val"))
                .trcf(rs.getBigDecimal("trcf_val"))
                .tributes(rs.getBigDecimal("tributes"))
                .build();
    }
}
