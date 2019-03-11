package GPCollege.VIP.GP018084.PrototypePattern.SimpleClone;

import java.util.Date;

/**
 * Created by ddqqs on 2019/3/11.
 */
public class User {
    String name;
    Integer age;
    String sex;
    String adderss;
    Date brith;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdderss() {
        return adderss;
    }

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    public Date getBrith() {
        return brith;
    }

    public void setBrith(Date brith) {
        this.brith = brith;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", adderss='" + adderss + '\'' +
                ", brith=" + brith +
                '}';
    }
}
