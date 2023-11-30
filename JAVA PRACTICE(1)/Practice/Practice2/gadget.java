class gadget {
    private String model_name;
    private String model_type;
    private String processor;

    public gadget() {
       this.model_name = "Model Name";
       this.model_type = "Model Type";
       this.processor = "Processor";
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }
 
    public String getModel_type() {
        return model_type;
    }

    public void setModel_type(String model_type) {
        this.model_type = model_type;
    }

    public String getProcessor() {
        return processor;
    }

    public void Processor(String processor) {
        this.processor = processor;
    }


}
