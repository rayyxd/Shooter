package ADAPTER_PATTERN;
class USB implements USB_Socket{
    @Override
    public void getData(){
        System.out.println("Tranfering data throught USB");
    }
}