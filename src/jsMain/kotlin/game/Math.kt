package game

import Phaser.Math.Vector2
import Phaser.Structs.Size

fun Size.asVector() = Vector2(width, height)

operator fun Size.component1() = width

operator fun Size.component2() = height
