package Implemnt;

import Abstract.messageValidate;
import Interface.EmailSender;

public class MailMessage implements EmailSender {
    private String mailAddressFrom;
    private String mailAddressTo;
    private String mailSubject;
    private String mailBody;

    public String getMailAddressFrom() {
        return mailAddressFrom;
    }

    public void setMailAddressFrom(String mailAddressFrom) {
        this.mailAddressFrom = mailAddressFrom;
    }

    public String getMailAddressTo() {
        return mailAddressTo;
    }

    public void setMailAddressTo(String mailAddressTo) {
        this.mailAddressTo = mailAddressTo;
    }

    public String getMailSubject() {
        return mailSubject;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }

    public String getMailBody() {
        return mailBody;
    }

    public void setMailBody(String mailBody) {
        this.mailBody = mailBody;
    }

    public MailMessage(String mailAddressFrom, String mailAddressTo, String mailSubject, String mailBody) {

        if(messageValidate.ValidateMailAddressFrom(mailAddressFrom)){  this.mailAddressFrom=mailAddressFrom;}
      if(messageValidate.ValidateMailAddressTo(mailAddressTo))  {   this.mailAddressTo=mailAddressTo;}

        if(messageValidate.ValidateMailbody(mailBody))  { this.mailBody=mailBody;}
          if(messageValidate.ValidateMailSubject(mailSubject))  {this.mailSubject=mailSubject;}

    }

    public boolean isValidMessage() {
        return messageValidate.isValidMessage(this);
    }

    @Override
    public void sendEmail(){
        if (this.isValidMessage()){
            System.out.println("The email sent successfully.");
        } else {
            System.err.println("Failed in sending the email, check it.");
        }
    }


}

