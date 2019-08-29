package schildt;

class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        String key = "88888888";
        int j;


        System.out.print("Original: ");
        System.out.println(msg);

        j = 0;
        //Encode the message
        for(int i = 0; i < msg.length(); i++){
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if (j==8) j=0;
        };
        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        j = 0;
        // decode the message
        for(int i = 0; i < msg.length(); i++){
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
            if (j==8) j=0;
        };

        System.out.print("Decoded message: ");
        System.out.println(decmsg);

    }

}
