package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D

class Explosion(
  initialPosition: Point2D,
  initialVelocity: Vector2D,
  radius: Double,
  mass: Double,
  var duration: Int = 60
) :
  SpaceObject("Explosion", 'o', initialPosition, initialVelocity, radius, mass) {
  fun decrementDuration() {
    this.duration -= 1
  }

  fun isThere(): Boolean {
    return this.duration > 0
  }
}
