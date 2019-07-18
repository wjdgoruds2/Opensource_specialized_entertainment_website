package tody.lovely.vo;
 
import java.util.Date;
 
public class UserVO {
    
    private int IDX;
    private String ID;
    private String EMAIL;
    private String NAME;
    private String PASSWORD;
    private int GRADE;
    private Date REGDATE;
    
    public int getIDX() {
        return IDX;
    }
    public void setIDX(int iDX) {
        IDX = iDX;
    }
    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }
   
    public String getNAME() {
        return NAME;
    }
    public void setNAME(String nAME) {
    	NAME = nAME;
    }
    public String getPASSWORD() {
        return PASSWORD;
    }
    public void setPASSWORD(String pASSWORD) {
        PASSWORD = pASSWORD;
    }
    public int getGRADE() {
        return GRADE;
    }
    public void setGRADE(int gRADE) {
        GRADE = gRADE;
    }
    public Date getREGDATE() {
        return REGDATE;
    }
    public void setREGDATE(Date rEGDATE) {
        REGDATE = rEGDATE;
    }
    public boolean matchPassword(String pw) {
        return this.PASSWORD.equals(pw);
    }
 
}

