package Implemnt;

import Abstract.DatabaseOperation;
import Interface.Idelete;

public class DeleteInvoice implements Idelete {



    public void Delete(Invoice invoice) {
        String DeleteQuery = getDeleteQuery(invoice);
        DatabaseOperation.DeleteRecord(DeleteQuery);
    }


    private String getDeleteQuery(Invoice invoice  ) {
        StringBuilder query = new StringBuilder();
        query.append("Delete from Implemnt.Invoice where date= (");
        query.append(invoice.getInvoiceDate());
        return query.toString();
    }
}
