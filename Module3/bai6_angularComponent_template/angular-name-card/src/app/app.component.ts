import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'angular-name-card';
  rating : number;
  onRateChange(rating : number) {
    this.rating = rating;
  }
}

