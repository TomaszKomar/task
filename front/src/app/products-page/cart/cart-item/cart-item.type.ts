import {Product} from "../../product-list/product/product.type";

export interface CartItem extends Product {
  quantity: number
}
