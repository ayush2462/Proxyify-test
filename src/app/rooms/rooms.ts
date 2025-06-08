import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-rooms',
  templateUrl: './rooms.html',
  styleUrls: ['./rooms.css'],
})
export class Rooms implements OnInit {
  hotelName: string = 'Hotel California';
  numberOfRooms: number = 100;
  hideRoom: boolean = false;
  constructor() {}
  ngOnInit(): void {}
   toggle(){
      this.hideRoom = !this.hideRoom;
    }
}
