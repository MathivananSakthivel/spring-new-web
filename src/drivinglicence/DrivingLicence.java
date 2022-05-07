package drivinglicence;

import java.util.Date;

public class DrivingLicence {

    private String number;
    private String cardHolderName;
    private Date dateOfBirth;
    private Date dateOfIssue;
    private Date validTill;
    private String bloodGroup;

    public String getNumber(){
        return number;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public String getCardHolderName(){
        return cardHolderName;
    }
    public void  setCardHolderName(String cardHolderName){
        this.cardHolderName =cardHolderName;
    }
    public Date getDateOfBirth(){
        return dateOfBirth;
    }

     public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public Date  getDateOfIssue(){
        return dateOfIssue;
    }
    public void setDateOfIssue(Date dateOfIssue){
        this.dateOfIssue = dateOfIssue;
    }
    public Date getValidTill(){
        return validTill;
    }
    public void setValidTill(Date validTill){
        this.validTill = validTill;
    }
    public String getBloodGroup(){
        return bloodGroup;
    }
    public void setBloodGroup(String bloodGroup){
        this.bloodGroup = bloodGroup;

    }
}
