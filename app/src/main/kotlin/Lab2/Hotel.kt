package Lab2

class Hotel (
    name: String,
    stars: Int
){
    var name = name
        get() = field
        set(value) {
            field = value
        }
    var stars = stars
        get() = field
        set(value) {
            field = value
        }
    var listRooms: MutableList<Room> = mutableListOf()
        get() = field
        set(value) {
            field = value
        }
    var listBooking: MutableList<Booking> = mutableListOf()
        get() = field
        set(value) {
            field = value
        }
    fun delBooking(room: Room){
    }
    fun addBooking(booking: Booking){
        listBooking.add(booking)
    }
    fun delRoom(number: Int){

    }
    fun addRoom(room: Room){
        listRooms.add(room)
    }
}