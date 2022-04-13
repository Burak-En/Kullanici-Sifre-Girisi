import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        String userName,password,newPassword;

        Scanner inp=new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password= inp.nextLine();

        if(userName.equals("anten") && password.equals("java123")){
            System.out.println("Giriş Yaptınız !");

        }else {
            System.out.println("Bilgileriniz Yanlış ! ");

            System.out.println("İşleminizi seçiniz : \n1-Şifreyi Değiştir:\n2-Şifremi Unuttum : ");
            int select = inp.nextInt();

            switch(select) {
                case 1:
                    System.out.print("Yeni Şifreniz : " + inp.nextLine());
                    newPassword=inp.nextLine();
                    if(newPassword.equals("java123")){
                        System.out.println("Yeni şifre eskisi şifre ile aynı olamaz.Yeni şifre oluşturulamadı. ");
                    }else {
                        System.out.println("Şifreniz oluşturuldu.");
                    }
                    break;
                default:
                    }

            }


        }






    }


