import {HttpClient} from "@angular/common/http";
import {Injectable} from "@angular/core";
import {Product} from "./product/product.type";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  constructor(private httpClient: HttpClient) {}

  public getProducts(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(`http://localhost:8080/v1/products/`);
  }
}
