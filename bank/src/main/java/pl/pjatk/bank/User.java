package pl.pjatk.bank;

public class User {
    private int id;
    private String name;
    private double saldo;

    public User(int id, String name, double saldo) {
        this.id = id;
        this.name = name;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
