import { HttpClient, HttpClientXsrfModule } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';
import { Book } from '../common/book';


@Injectable({
  providedIn: 'root'
})
export class BookService {

  private baseUrl="http://localhost:9090/api/v1/books"
  constructor(private httpClient:HttpClient) { }

  getBooks():Observable<Book[]>
  {
    return this.httpClient.get<Book[]>(this.baseUrl);
  }
}
