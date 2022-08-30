import com.ey.oo.objectdestructure.Coordinates

def coordinate = new Coordinates(latitutde: 12, longitude: 45)
println(coordinate.latitutde)

//destructured syntax
def (lat, lng) = coordinate
println("$lat $lng")