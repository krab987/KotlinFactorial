package Lab2

import java.text.SimpleDateFormat
import java.util.*

class Booking(
    room: Room,
    //room.isBooked = false
) {
    var room = room
        get() = field
        set(value) {
            field = value
        }
    val sdf = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
    val date = sdf.format(Date())
        get() = field
}