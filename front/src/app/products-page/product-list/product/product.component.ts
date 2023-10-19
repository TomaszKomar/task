import {Component, Input} from '@angular/core';
import {Product} from "./product.type";
import {CartService} from "../../cart/cart.service";

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {
  @Input() product: Product | null = null;

  constructor(private cartService: CartService) {
  }

  addProduct(): void {
    if (this.product)
      this.cartService.addItem(this.product);
  }
}
