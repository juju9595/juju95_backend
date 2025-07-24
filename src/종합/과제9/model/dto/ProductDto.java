package 종합.과제9.model.dto;

public class ProductDto {
    //1. 멤버변수
    //1) private
    private int pno;
    private String pname;
    private String pcontent;
    private String pprice;
    private String pdate;
    private int psale;
    private String puser;
    private String ppassword;

    //2. 생성자
    //1) 기본생성자
    public ProductDto(){};

    //2) 전체생성자

    public ProductDto(int pno, String pname, String pcontent, String pprice, String pdate, int psale, String puser, String ppassword) {
        this.pno = pno;
        this.pname = pname;
        this.pcontent = pcontent;
        this.pprice = pprice;
        this.pdate = pdate;
        this.psale = psale;
        this.puser = puser;
        this.ppassword = ppassword;
    }


    //3. 메소드
    //1)setter
    //2)getter

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPcontent() {
        return pcontent;
    }

    public void setPcontent(String pcontent) {
        this.pcontent = pcontent;
    }

    public String getPprice() {
        return pprice;
    }

    public void setPprice(String pprice) {
        this.pprice = pprice;
    }

    public String getPdate() {
        return pdate;
    }

    public void setPdate(String pdate) {
        this.pdate = pdate;
    }

    public int getPsale() {
        return psale;
    }

    public void setPsale(int psale) {
        this.psale = psale;
    }

    public String getPuser() {
        return puser;
    }

    public void setPuser(String puser) {
        this.puser = puser;
    }

    public String getPpassword() {
        return ppassword;
    }

    public void setPpassword(String ppassword) {
        this.ppassword = ppassword;
    }


    //3) toString


    @Override
    public String toString() {
        return "ProductDto{" +
                "pno=" + pno +
                ", pname='" + pname + '\'' +
                ", pcontent='" + pcontent + '\'' +
                ", pprice='" + pprice + '\'' +
                ", pdate='" + pdate + '\'' +
                ", psale=" + psale +
                ", puser='" + puser + '\'' +
                ", ppassword='" + ppassword + '\'' +
                '}';
    }
}
