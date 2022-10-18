package Abstract;

import Implemnt.MailMessage;

public abstract class messageValidate {
    public static boolean ValidateMailAddressFrom(String mailAddressFrom){
        if(mailAddressFrom == null || mailAddressFrom.isEmpty() || !mailAddressFrom.contains("@") || !mailAddressFrom.contains(".")){
            return false;
        }
        return true;

    }
    public static boolean ValidateMailAddressTo(String mailAddressTo){
        if(mailAddressTo == null ||  mailAddressTo.isEmpty() ||  !mailAddressTo.contains("@") ||  !mailAddressTo.contains(".")){
            return false;
        }
        return true;

    }

    public static boolean ValidateMailSubject(String mailSubject){
        if(mailSubject == null ||  mailSubject.isEmpty() ||  mailSubject.length() > 30){
            return false;
        }
        return true;
    }
    public  static boolean ValidateMailbody( String mailBody) {


        if (mailBody == null || mailBody.isEmpty()) {
            return false;
        }
        return true;
    }
    public static boolean isValidMessage(MailMessage M){
        if(M.getMailAddressFrom()== null || M.getMailAddressFrom().isEmpty() || ! M.getMailAddressFrom().contains("@") || ! M.getMailAddressFrom().contains(".")){
            return false;
        }
            if(M.getMailAddressTo() == null ||  M.getMailAddressTo().isEmpty() ||  !M.getMailAddressTo().contains("@") ||  !M.getMailAddressTo().contains(".")){
            return false;
        }
        if(M.getMailSubject() == null ||M.getMailSubject().isEmpty() ||  M.getMailSubject().length() > 30){
            return false;
        }
        if(M.getMailSubject() == null ||M.getMailSubject().isEmpty() ){
            return false;
        }
        return true;
    }


}
