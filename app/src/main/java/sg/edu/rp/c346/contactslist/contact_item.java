package sg.edu.rp.c346.contactslist;

/**
 * Created by 16003749 on 23/7/2018.
 */

public class contact_item {
    private String contact_name;
    private String contact_code;
    private int contact_phone;

    public contact_item(String contact_name, String contact_code,int contact_phone) {
        this.contact_name = contact_name;
        this.contact_code = contact_code;
        this.contact_phone = contact_phone;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getContact_code() {
        return contact_code;
    }

    public void setContact_code(String contact_code) {
        this.contact_code = contact_code;
    }

    public int getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(int contact_phone) {
        this.contact_phone = contact_phone;
    }

    @Override
    public String toString() {
        return "contact_item{" +
                "contact_name='" + contact_name + '\'' +
                ", contact_code='" + contact_code + '\'' +
                ", contact_phone=" + contact_phone +
                '}';
    }
}
