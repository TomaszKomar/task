import { Component } from '@angular/core';
import {CartItem} from "./cart-item/cart-item.type";
import {CartService} from "./cart.service";
import {Observable, share} from "rxjs";

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent {
  cartItems: CartItem[] = [{
    "id": "fcd06d80-5e3c-42ec-88ee-d39044dbf51a",
    "name": "Banana",
    "price": 15,
    "description": "Nature's sweet energy boost!",
    "quantity" : 1
  }, {
    "id": "fcd06d80-5e3c-42ec-88ee-d39044dbf51b",
    "name": "Apple",
    "price": 19,
    "description": "Sweet and crunchy, best choice for a healthy dessert!",
    "quantity" : 2
  }]
  totalPrice: number = 0;

  constructor(private cartService: CartService) {
    // TODO 2 have cart update based on cartService
  }

  calculateTotalPrice(cart: CartItem[]): void {
    this.totalPrice = cart.map(item => item.price * item.quantity).reduce((accumulator, current) => {
      return accumulator + current;
    }, 0);
  }
}
