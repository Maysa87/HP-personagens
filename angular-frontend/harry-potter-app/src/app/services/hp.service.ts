import { Injectable } from '@angular/core';
import {HttpClient, HttpClientModule, HttpParams} from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root',
})
export class HpService {

  rota:string = "http://localhost:3000/personagens/"

  constructor(private httpClient: HttpClient) { }

 getHp(filters: { name?: string | null; house?: string | null;  bornDate?: Date | null}): Observable<any> {
  let params = new HttpParams();

  // Adiciona somente os parâmetros que não são nulos ou undefined
  Object.keys(filters).forEach((key) => {
    const value = filters[key as keyof typeof filters];
    if (value !== null && value !== undefined) {
      params = params.set(key, value.toString());
    }
  });

  return this.httpClient.get(this.rota+"filtro", { params });
}

}
