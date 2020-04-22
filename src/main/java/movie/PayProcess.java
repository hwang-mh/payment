package movie;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="PayProcess_table")
public class PayProcess extends AbstractEvent{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String cardid;
    private String customerNm;
    private Integer qty;
    private String reservationiId;

    @PostPersist
    public void onPostPersist(){
        Payed payed = new Payed();
        BeanUtils.copyProperties(this, payed);
        payed.publish();


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
