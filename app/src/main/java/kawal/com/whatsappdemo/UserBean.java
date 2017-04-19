package kawal.com.whatsappdemo;

/**
 * Created by kawaldeep on 4/9/2017.
 */

public class UserBean {
    int image;
    String name;
    String phone;
    byte age;

    public UserBean() {
    }

    public UserBean(int image, String name, String phone, byte age) {
        this.image = image;
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
