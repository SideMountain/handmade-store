import Cart from '@/domains/cart/Cart';
// import CartItem from '@/domains/cart/CartItem';
import { sessionStorageManager } from '@/domains/session/SessionStorageManager';

class CartDataManager {
  private static INSTANCE = new CartDataManager();
  static get instance() {
    return this.INSTANCE;
  }

  setCart(cart: Cart) {
    sessionStorageManager.set('cart', JSON.stringify(cart));
  }

  getCart() {
    const cart: Cart =
      (JSON.parse(sessionStorageManager.get('cart')!) as Cart) || new Cart();
    return cart;
  }

  resetCartData() {
    sessionStorageManager.remove('cart');
  }
}

export default CartDataManager.instance;
