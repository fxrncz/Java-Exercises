class Admin {
    private String user;
    private int pass;

    public Admin() {
        user = "admin";
        pass = 123;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }
}