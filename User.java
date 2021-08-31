package capgemini.emp_asset.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="user1")
@Inheritance(strategy=InheritanceType.JOINED)
public class User implements Serializable {
    
    
    private static final long serialVersionUID = 1L;
    @Id    
    private int userId;
    private String username;
    private String password;
    private String role; 
    public User() {
        super();
        
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    @Override
    public String toString() {
        return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", role=" + role + "]";
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
