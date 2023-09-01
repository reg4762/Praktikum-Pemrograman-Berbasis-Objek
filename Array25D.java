package algo_p1;

public class Array25D {
    public static void main(String[] args) {
       
    int banyakbunga25D[][] = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}};
        String[] Bunga25D = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        String[] cabang25D = {"RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4"};
        
        int total25D = 0;
        for (int i = 0; i < banyakbunga25D.length; i++) {
            for (int j = 0; j < banyakbunga25D[0].length; j++) {
                total25D = total25D + banyakbunga25D[i][j];
            }
        }
        System.out.println("Jumlah Stock Bunga di Seluruh Cabang : " + total25D);
        System.out.println("========================================================");
        
        System.out.println("Stock Berdasarkan Jenis di Seluruh Cabang");
        for (int i = 0; i < banyakbunga25D.length; i++) {
            total25D = 0;
            for (int j = 0; j < banyakbunga25D[0].length; j++) {
                total25D = total25D + banyakbunga25D[j][i];
            }
            System.out.println("bunga " + " " + Bunga25D[i] + " : " + total25D);
        }
        System.out.println("========================================================");
        
        int[] harga25D = {75000, 50000, 60000, 10000};
        long pendapatan25D = 0;
        for (int i = 0; i < banyakbunga25D.length; i++) {
            int totalcab25D = 0;
            for (int j = 0; j < banyakbunga25D[0].length; j++) {
                totalcab25D = totalcab25D + banyakbunga25D[j][i];
            }
         
            pendapatan25D += (totalcab25D * harga25D[i]);
                   
        }
        System.out.println("Pendapatan Total Seluruh Cabang : " + "Rp " + pendapatan25D);
        System.out.println("========================================================");
        
        int[] kurang25D = {1, 2, 0, 5};
        pendapatan25D = 0;
        System.out.println("Stock Royal Garden 1");
        for (int i = 1; i < 2; i++) {
            int totalcab25D = 0;
            for (int j = 0; j < banyakbunga25D[0].length; j++) {
                banyakbunga25D[0][j] = banyakbunga25D[0][j]-kurang25D[j];
                System.out.println(Bunga25D[j]+" "+ banyakbunga25D[0][j]);
                pendapatan25D += (banyakbunga25D[0][j] * harga25D[j]);
            }         
                      
        }
        System.out.println("Pendapatan Total Cabang Royal Garden 1 : " + "Rp " + pendapatan25D);
    
    }
    
}


