package net.gtaun.shoebill.data

/**
 * This class should be used with functions that were introduced in SA:MP 0.3.7.
 *
 * @author Marvin Haschker
 */
class VehicleState {

    val driver: Int
    val passenger: Int
    val backLeft: Int
    val backRight: Int

    @JvmOverloads
    constructor(driver: Int = 0, passenger: Int = 0, backLeft: Int = 0, backRight: Int = 0) {
        this.driver = driver
        this.passenger = passenger
        this.backLeft = backLeft
        this.backRight = backRight
    }
}