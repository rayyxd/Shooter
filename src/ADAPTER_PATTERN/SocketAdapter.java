package ADAPTER_PATTERN;
class SocketAdapter implements USBC_Socket{

    private USB_Socket usb_socket;

    public SocketAdapter(USB_Socket usb_socket){
        this.usb_socket = usb_socket;
    }
    @Override
    public void getData(){
        usb_socket.getData();
    }

}
