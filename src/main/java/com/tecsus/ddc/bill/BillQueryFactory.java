package com.tecsus.ddc.bill;

public class BillQueryFactory {

    public static String insert() {
        return "INSERT INTO DDC_BILL (bill_num, instalation, value, ref_month, previous_read, previous_read_value, actual_read, actual_read_value, next_read, due_date, consum, consum_period, meter_num) " +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    }
}
