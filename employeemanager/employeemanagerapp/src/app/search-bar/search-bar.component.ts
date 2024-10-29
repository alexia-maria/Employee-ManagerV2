import {Component, EventEmitter, Output} from '@angular/core';
import {filter} from "rxjs";

@Component({
  selector: 'app-search-bar',
  standalone: true,
  imports: [],
  templateUrl: './search-bar.component.html',
  styleUrl: './search-bar.component.css'
})
export class SearchBarComponent {

  @Output() search = new EventEmitter<string>();

  onSearch(filterInput: HTMLInputElement): void{
    this.search.emit(filterInput.value);
    filterInput.value = '';
  }
}
