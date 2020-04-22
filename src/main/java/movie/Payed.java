package movie;

public class Payed extends AbstractEvent {

    private Long id;
    private String cardid;
    private String customerNm;
    private Integer qty;
    private String reservationiId;

    public Payed(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }
    public String getCustomerNm() {
        return customerNm;
    }

    public void setCustomerNm(String customerNm) {
        this.customerNm = customerNm;
    }
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
    public String getReservationiId() {
        return reservationiId;
    }

    public void setReservationiId(String reservationiId) {
        this.reservationiId = reservationiId;
    }
}
