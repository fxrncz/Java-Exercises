class Keyboard {
    private int keys, numeric;
    private String brand;

    public Keyboard () { 
        keys = 105;
        numeric = 17;      
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKeys(){
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }

    public int getNumeric() {
        return numeric;
    }

    public void setNumeric(int numeric) {
        this.numeric = numeric;
    }
}
