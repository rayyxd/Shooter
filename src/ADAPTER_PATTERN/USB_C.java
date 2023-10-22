package ADAPTER_PATTERN;
class USB_C implements USBC_Socket{
    @Override
    public void getData(){
        System.out.println("Tranfering data throught USB-C");
    }
}