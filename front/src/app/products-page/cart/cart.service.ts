import {Injectable} from "@angular/core";
import {CartItem} from "./cart-item/cart-item.type";
import {Product} from "../product-list/product/product.type";

@Injectable({
  providedIn: 'root'
})
export class CartService {
  private cart: CartItem[] = [];

  constructor() {
  }

  public addItem(product: Product): void {
    this.cart.push({...product, quantity: 1});
  }

  public increaseQuantity(productId: string): void {
    const item = this.cart.find(item => item.id === productId);
    if (item) {
      item.quantity++;
    }
  }

  public decreaseQuantity(productId: string): void {
    const item = this.cart.find(item => item.id === productId);
    if (item) {
      item.quantity--;
    }
  }

  public removeItem(productId: string): void {
    this.cart = this.cart.filter(item => item.id !== productId);
  }

}
