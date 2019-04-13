package entity;

import java.io.Serializable;

public class Password implements Serializable {
    private String id;
    private String usedPassword;
    private String newPassword;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {

        return id;
    }

    public void setUsedPassword(String usedPassword) {
        this.usedPassword = usedPassword;
    }

    public String getUsedPassword() {
        return usedPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }
}
