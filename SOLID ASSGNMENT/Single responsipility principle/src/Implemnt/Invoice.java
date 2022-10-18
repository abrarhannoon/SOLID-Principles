package Implemnt;

import Interface.EmailSender;
import Interface.Iadd;
import Interface.Idelete;

import java.util.Date;

/**
 * What are the responsibilities for this class?
 * Do the required change to make this class single responsibility
 */
public class Invoice {
    private long amount;
    private Date invoiceDate;
    private Iadd invoiceAdd;
    private Idelete InvoiceDelete;
    private EmailSender emailSender;


    // getter and setter

    public Iadd getInvoiceAdd() {
        return invoiceAdd;
    }

    public void setInvoiceAdd(Iadd invoiceAdd) {
        this.invoiceAdd = invoiceAdd;
    }

    public Idelete getInvoiceDelete() {
        return InvoiceDelete;
    }

    public void setInvoiceDelete(Idelete invoiceDelete) {
        InvoiceDelete = invoiceDelete;
    }

    public EmailSender getEmailSender() {
        return emailSender;
    }

    public void setEmailSender(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Invoice(long amount, Date invoiceDate) {
        this.amount = amount;
        this.invoiceDate = invoiceDate;
        invoiceAdd=new AddInvoce();
        InvoiceDelete=new DeleteInvoice();
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    //end getter and setter



    public void add()  {
        invoiceAdd.add(this);
        emailSender=new MailMessage("MailAddressFrom","MailAddressTo","MailSubject","MailBody");
        emailSender.sendEmail();
    }

    public void delete()  {
        InvoiceDelete.Delete(this);
    }

}
