package az.developia.compshopNihatHeyderov.model;

import javax.persistence.Entity;


public class User {
	
   private String username;
   private String password;
   private String email;
   private String phone;
   private String name;
   private String surname;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
@Override
public String toString() {
	return "User [username=" + username + ", password=" + password + ", email=" + email + ", phone=" + phone + ", name="
			+ name + ", surname=" + surname + "]";
}

}
