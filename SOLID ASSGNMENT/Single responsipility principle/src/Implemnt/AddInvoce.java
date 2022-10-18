package Implemnt;

import Abstract.DatabaseOperation;
import Interface.Iadd;

public class AddInvoce implements Iadd {

    @Override
    public void add(Invoice invoice) {
        String interQuery = getInsertQuery(invoice);
        DatabaseOperation.insertNewRecord(interQuery);
    }

   private String getInsertQuery(Invoice invoice) {
        StringBuilder query = new StringBuilder();
        query.append("Insert into Invoice Value (");
        query.append(invoice.getAmount());
         query.append(invoice.getInvoiceDate());
        return query.toString();
    }
}
