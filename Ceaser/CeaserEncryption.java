package Ceaser;


import com.sun.corba.se.impl.orb.ParserTable;

public class CeaserEncryption implements  Encryption{
    private  String cleartext;
    private  String ciphertext;
    private  int rule;
    private  int key;

    public CeaserEncryption(){
    }

    public CeaserEncryption(String cleartext,int rule ,int key) {
        this.cleartext = cleartext;
        this.rule = rule;
        this.key = key;
    }

    @Override
    public  void Encryption(String s,int key) {
        if (key < 0) {
            System.out.println("Serious？");
            return;
        }
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i])) {
                if (Character.isLowerCase(arr[i]))arr[i] = (char)((arr[i] - 'a' + key)%26 +'a');
                else  arr[i] = (char)((arr[i] - 'A' + key)%26 + 'A');
            }
            else  if (Character.isDigit(arr[i])) {
                arr[i] = (char) ((arr[i] - '0' + key)%10 + '0');
            }
        }
        System.out.println("加密后：");
        System.out.println(arr);
    }


    @Override
    public  void Decryption(String s,int key) {
        if (key < 0) {
            System.out.println("Serious？");
            return;
        }
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i])) {
                if (Character.isLowerCase(arr[i]))arr[i] = (char)((arr[i] - 'a' - key)%26 +'a');
                else  arr[i] = (char)((arr[i] - 'A' - key)%26 + 'A');
            }
            else  if (Character.isDigit(arr[i])) {
                arr[i] = (char) ((arr[i] - '0' - key)%10 + '0');
            }
        }
        System.out.println("解密后：");
        System.out.println(arr);
    }
    }
