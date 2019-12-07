public class Main {

    public static void main(String[] args) {

        AES aes=new AES();
        //Key must be 16-bit, while text must longer than 16-bit
        String plainText="passwordTextCaSe", key="simpleKeyCase123";
        String code=aes.encrypt(plainText,key);

        String decode=aes.decrypt(code,key);
        System.out.println("This is the code: "+code);
        System.out.println("This is the text: "+decode);
    }

}
