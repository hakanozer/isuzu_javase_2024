
package days.pkg8;


public interface ICustomer {
    
    // Gövdeli-Normal method yazılamaz
    // Gövdesiz methodlar yazılabilir
    
    /**
     * Müşteri login işlemi için yazılmalıdır.
     * @param username Müşteri tc no yada telefon no almalıdır.
     * @param password Müşteri şifresini alır.
     * @return Müşteri'id si geriye dönmelidir, hata varsa -1 dönmelidir.
     * @since 1.8
     */
    int customerLogin(String username, String password);
    String getOneCustomer(int cid);
    int customerAge(int cid);
    
}
