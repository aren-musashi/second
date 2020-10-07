package Ceaser;

import java.util.Scanner;

public class RunThisPlease {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入1加密，输入2解密，输入0结束");
        int choice = input.nextInt();
        int key = 0;
        String s = "";
        while (choice != 0 ) {
            CeaserEncryption encryption = new CeaserEncryption();
            if (choice == 1) {
                System.out.print("请输入要加密的原文");
                input.nextLine();
                s = input.nextLine();
                System.out.print("密钥");
                key = input.nextInt();
                encryption.Encryption(s, key);
            } else if (choice == 2) {
                System.out.print("请输入要解密的密文");
                input.nextLine();
                s = input.nextLine();
                System.out.print("密钥");
                key = input.nextInt();
                encryption.Decryption(s, key);
            }
            System.out.println("输入1加密，输入2解密，输入0结束");
            choice = input.nextInt();
        }
        return;
    }
}