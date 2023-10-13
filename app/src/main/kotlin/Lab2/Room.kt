package Lab2
import Lab2.enums.RoomType

class Room(
    number: Int,
    rooms: RoomType,
    price: Int,
    countOfBeds: Int,
) {
    var number = number
        get() = field
        set(value) {
            field = value
        }
    var rooms = rooms
        get() = field
        set(value) {
            field = value
        }
    var price = price
        get() = field
        set(value) {
            field = value
        }
    var countOfBeds = countOfBeds
        get() = field
        set(value) {
            field = value
        }
    var isBooked = false
        get() = field
        set(value) {
            field = value
        }
}