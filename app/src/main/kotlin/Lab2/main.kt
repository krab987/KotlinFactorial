package Lab2

import Lab2.enums.RoomType

fun main(){
    var bober = Hotel("Bober",5)
    bober.addRoom(room = Room(3, RoomType.Lux, 250, 2))
    bober.addRoom(room = Room(5, RoomType.Normal, 40, 1))
    bober.addBooking(booking = Booking(room =  bober.listRooms[0]))
}