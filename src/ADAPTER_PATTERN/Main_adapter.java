package ADAPTER_PATTERN;
public class Main_adapter {
    public static void main(String[] args) {

        USB usb_socket = new USB();
        Notebook nbook = new Notebook();

        USBC_Socket usbc_socket = new SocketAdapter(usb_socket);

        nbook.getConnect(usbc_socket);

    }
}












