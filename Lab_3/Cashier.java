package POS_Machine;

import java.io.Serializable;

public class Cashier implements Serializable {
    private String name;
    private String branch;

    public Cashier(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }
}
