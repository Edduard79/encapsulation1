public class House {
    private int floorsNumber;
    private String address;
    private String[] residentsNames;

    public House(){
    }

    public int getFloorsNumber(){
        return this.floorsNumber;
    }
    public void setFloorsNumber(int floorsNumber){
        this.floorsNumber = floorsNumber;
    }
    //---------------------------------------------
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    //----------------------------------------------
    public String[] getResidentsNames(){
        return this.residentsNames;
    }
    public void setResidentsNames(String[] residentsNames){
        this.residentsNames = residentsNames;
    }


}
