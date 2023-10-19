import {Component, Input} from '@angular/core';
import {CartItem} from "./cart-item.type";
import {CartService} from "../cart.service";

@Component({
  selector: 'app-cart-item',
  templateUrl: './cart-item.component.html',
  styleUrls: ['./cart-item.component.css']
})
export class CartItemComponent {
  @Input() item: CartItem | undefined;

  constructor(private cartService: CartService) {
  }

  increaseQuantity() {
    if (this.item)
      this.cartService.increaseQuantity(this.item.id)
  }

  decreaseQuantity() {
    if (this.item)
      this.cartService.decreaseQuantity(this.item.id)
  }

  removeItem() {
    if (this.item)
      this.cartService.removeItem(this.item.id)
  }
}
