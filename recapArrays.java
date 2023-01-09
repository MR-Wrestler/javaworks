/*
    *Verilen bir array içindeki değerleri for döngüsü ile ekrana yazdıran java kodu.
    ? Verilen arrayin içindeki değerlerin toplamını ekrana yazıran java kodu.
    ! Verilen array içindeki en büyük sayıyı ekrana yazdırma kodu.

    NOT: Aşağıadki kodda hangi satırdaki kodun ne işlem yapacağı işaretlerle belirtilmiştir.
        Ve her satırın sonundaki yorum bölümündeki işaretlerle eşleşmektedir.


*/

public class recapArrays {

    public static void main(String[] args) {
        Double[] mylist = {1.2, 1.3, 4.3, 5.6};

        double counter1 = 0;
        double max1 = 0;

        // 1. metot klasik for döngüsü kullanarak yazdırma.
        for(int i = 0 ; i<mylist.length ; i++ )     // mylist.length = mylist dizisinin kaç tane eleman içerdiği
        {
            System.out.println(mylist[i]);          // *

            counter1+=mylist[i];                    // ?

            if (max1 < mylist[i])                   // !
            {                                       // !
                max1 = mylist[i];                   // !
            }
        }
        System.out.println("Toplam1 = " + counter1);           // ?
        System.out.println("En Büyük Sayı = " + max1);         // !
        System.out.println("1. metot tamamlandi");          


        // 2. metot for - each kullanarak yazdırma.

        double counter2 = 0;
        double max2 = 0;
        for (Double nums : mylist)                     // mylist deki her elemanı gezdi ve elemanlara teker teker nums dedi
        {
            System.out.println(nums);           // *

            counter2+=nums;                     // ?

            if (max2 < nums)                    // !
            {                                   // !
                max2 = nums;                    // !
            }
        }
        System.out.println("Toplam2 = " + counter2);            //?
        System.out.println("En Büyük Sayı = " + max2);          //!
        System.out.println("2. metot tamamlandi");
    }  
}
