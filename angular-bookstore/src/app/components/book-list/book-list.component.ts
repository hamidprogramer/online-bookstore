import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/common/book';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {

   books:Book[];
  constructor(public bookService:BookService) { }

  ngOnInit(): void {
    this.listebooks();
  }

  listebooks()
  {
      this.bookService.getBooks().subscribe(data=>{
      this.books=data;
    })
  }
}
