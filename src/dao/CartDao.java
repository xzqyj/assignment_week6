package dao;

import entity.Cart;

import java.util.List;
public interface CartDao {
	List<Cart> getAll(Cart cart);
    boolean addCart(Cart cart);
    boolean updateCart(Cart oldCart,Cart newCart);
    boolean deleteCart(Cart cart);
    Cart getBySuk(Cart cart);
}

