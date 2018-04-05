public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello world !");

        MessageRenderer mr = new StamdartOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
