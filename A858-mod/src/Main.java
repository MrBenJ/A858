import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class Main {

    public static void main(String[] args) throws Exception {
        String ivString = "A858DE45F56D9BC9";
        byte[] iv = hexToBytes(ivString);
        SecretKey myKey = new SecretKeySpec(iv,0,iv.length,"Blowfish");
        Cipher cipher = Cipher.getInstance("Blowfish");
        String encryptedString;

        encryptedString = "4f57ddd43c9f46ceb160cad65e0f9fb6 8f14eff096ba344eb2171c9e8f181a99 f9c7a97e557e805f8003245e775600b0 a011e8e0a5182fc0966cc3ba9a087e4f 1f6f3e8383574b139a5a72472864754d f839f51b8b130cfca8e50c744c42e5df dd6af265558507fbbb812017489bfd5c 9dc21162531147f6856eae9d712f1962 ef5cfcf639853e00a3c582de0e094859 0141673e06e1478fa22fcb9009ef81ff b9a129e2720570368eb7c72d332438cf 65a166d73dfb50d6a05988273838e367 1a795a514b0c355cabb7c7939b144d76 723746698b021c26baf82c847b2f816f d8c01556985e140fab48e078872952dd c2e4a6103ba64b97b32a2768fe49c84c fe43d67e6ffb83bc82bd5f47cd9fc590 bee085e0010c23dba10d70bc6c1bba2a 27e332f5065754a6ab65b09a78787170 812e4ae8c982226d9b6dc1bc7e8f3b12 c9c36f0403e95897b3f2bffded859ef5 d5aa5f9f2a51646fa20596f8e7dd649e 325d15bf872b02fca3ac5b985a83051f 00bb92bbf6d55c13b29d8ba73fbdec34 bd24d5041da62a05862649e37aa1d378 34d06f7ed0506e538ff1822f1206b12d 1c5e1902c7cd7e7c85bad161ebdcfc0b c76a1ff40e3687d4a1ac2bc58d336777 1e40ba28252340379971c4e7cfa8a632 f90fe75d0ec1073083242405ba14c0a2 13f6ff4f227648aea71d7d8d5d70d347 01fff305d49b8890a07a97b5ac85e1de cd1d59d90e0c60519db3b9593912084b d7bdfad327428c42839009564487abcb baea59edc96f1c8ea2dc6a3f4195301c 5b887a71597f2312af74e6ebdffaaad5 e4b4bd19e3d17db9b5c24edc35a565b3 5ca88a6a03bd85d5bf4593cfcfd4502f 40a950f4a11d4535802a17936bbc631d a348bb007f973739a265745e644c53f7 d95b1f6adea91a87ae992f77ace9f0ea a44aaf5c81dd67e080b7ca7b619e35d2 20433acc4f2f61899ab7fd9949dd5258 70fe099748c032dcb2f92fd84e518f28 309e9725290c75eaba4130f0f915ab39 68d18b88cab34f268b1983eeaa272cdb 60be7877bdff530fada86e158c602f81 eea86dcff03e0e6996c78c982c87cd02 f8cddf616f385309bf4f2859a1b2f564 4df5133f071686369fc9a7d9c5ec49b0 2c471e58f7d652508d193f00f6642177 f1d169773e768e07b856071e0dea8892 e3eb220f711f7a0b853e54ece75d4d06 9ba9896dce5870e28fd7b00e51f5a854 8b248d8aa4df3ee0b1de4c3bc1c7b24e 8ff057949b447f10acd06003b11a817f 71092d98dc7c22fa8208b57f6ce004fc ee39d88a1d9d23e58ceed8646e0a573e 74ce9f5f68990230b3899b6562c95f4f 9534b9717e5778d5abea1fef8de4032f 25d4a83c015c1a38a0bc11353a2c3ec8 b79dbe9816d40fcfb90a068ffa1c2258 dd0594ba8fd400f2be9cab8114955712 68b2bea0337139c09250924f6185702a 141bbc7196450e93b3f25db276b59107 2142a763176c7126be3fce39c2205c09 d68820b95b1274b89ffecc12fc07ed09 4f4b64ad0a594bfe9161fb5302f3d725 3784953ab0f1854b959a2d8a6f8602c2 158539ca4fdd7c9fa5b068fd69453c38 670b379c151a5207a83b8de094ce7856 23913960df2a0ba880aa58e0d89df811 9b17c8dc4bd47e9ba4a7ba1cf0aedbef 848502437ab2203f9a19ea0f1f6aecfd af919bae00551bacabf503f4ddc9d200 04e18eea489b7f75b939ff4f77653d49 7ee2dda9c50b87e298a04b4bedc6c2a8 37327c844e526ef1b65aeb97f3a96bb9 287087c45ccc62a8b73820514c226cd7 6ce42622d22b6f8abb82e9a45b1246b2 478be752727904b9a02aff2987fc888e 32337c0da64b74e3a0b35a37ca4a8a44 164ac16e7a3b27208ce7c9eeaa8a5e5e 26911eb9a7f64599a15cf97016d875d1 da5da355b791450a831ba6d18f14cfb3 77fd61200ce743ac89f5a4e34afc7aaa 6f3b95ab0773127998158af73d31a35f be50144aa12780dea847f30cc1ee63e1 fd202f4a43b546f9b5444ddfd538a9be fab57253db623ade8b69e62cf38050dc 051b3eb007e80940b07143311e9c3328 50006787b3184099afbb3a37f1d85b1a 6fde56401b6284fb9a2ab5c13ba58036 ab15aae1ea446773bb8a7f623ca1449b ea183c4cb3de2c5685286b4b6b5b9a04 93fe83fd442200a3b4a4779761d28713 d1dfb796102f6ea391ffbf9b6822e279 82eea4865ab1378b9fa9583141a18fec 8fa5c3a07c512f0ab7112b4359694e6d a10caaa855730dd7a4b55a7c1ede4b2b f802f6250c5c6e2491428a13d37004a8 44907aee621c0687b94208257a33d5d9 8dfdeff1bb050e22b7d73f3fc7613d21 bc22c91abf2c730bb76c09048b3d5931 cbd30200dc64200a8dde7651b5e9a949 82ecce2f76184851b844800013e4b6f2 c9e5e9c53b1014bdbff0e3658697f04f 8281d5e8f3cf4b808924f21f01dbc945 809dea6c5a60656ab82420f8e87f8ada 05ad0718f9f940a28c1d0a9525f55c1b 7807220dc57c82c2bfa96572d8b52087 318733f9d4125e479fdb08406bc93c48 719211af50685d119251a753a375f61e 5a721e95949d27b5b89c3996bbe53a0e a5aa65433673698982895a9b46d9ef25 c3c0c483fe7c238f9339d735bfa960bd 31863209654f622ea71c7cce5a3792fb d50a9057e3ac4d92ad2df741db087677 8ff8b6b622917684b08c50fcc2290606 3de626fe179e4bd08cc31988f22342fb 88e7887c1e086f498a3009ca27cf0872 002ba297b3cb7345b53cfd6493d5e422 6678ee0fa4360dcfb53ce154f457312c 1d1bada03bf85e6a9fdc3edd887b2435 63fe35e100817d54a6b7b0f871daf784 30881e6cbfc21fdf995371f089e34bf6 2e2edf3db1591360847531bd89142fde 1a2b3977516004c5b6bea4399c4d1234";
        encryptedString.replaceAll("\\s","");

        cipher.init(Cipher.DECRYPT_MODE,myKey);
        byte[] decrypted = cipher.doFinal(hexToBytes(encryptedString));
        String decryptedString = bytesToHex(decrypted);
        System.out.println(new String(decrypted) + " " + decryptedString + " " + Arrays.toString(decrypted));


    }

    public static byte[] hexToBytes(String str) {
        if (str == null) {
            return null;
        } else if (str.length() < 2) {
            return null;
        } else {
            int len = str.length() / 2;
            byte[] buffer = new byte[len];
            for (int i = 0; i < len; i++) {
                buffer[i] = (byte) Integer.parseInt(str.substring(i * 2, i * 2 + 2), 16);
            }
            return buffer;
        }

    }

    public static String bytesToHex(byte[] data) {
        if (data == null) {
            return null;
        } else {
            int len = data.length;
            String str = "";
            for (int i = 0; i < len; i++) {
                if ((data[i] & 0xFF) < 16)
                    str = str + "0" + java.lang.Integer.toHexString(data[i] & 0xFF);
                else
                    str = str + java.lang.Integer.toHexString(data[i] & 0xFF);
            }
            return str.toUpperCase();
        }
    }
}