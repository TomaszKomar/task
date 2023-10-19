import {Component, OnInit} from '@angular/core';
import {Product} from "./product/product.type";
import {ProductService} from "./product.service";
import {CartService} from "../cart/cart.service";

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent {
  products: Product[] = [{
    "id": "fcd06d80-5e3c-42ec-88ee-d39044dbf51a",
    "name": "Banana",
    "price": 15,
    "description": "Nature's sweet energy boost!"
  }];

  constructor(private productService: ProductService) {
    // TODO 1 display products from API on load
  }


}
