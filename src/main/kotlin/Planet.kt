class Planet(private val latitude: Int, private val longitude: Int) {
    private val MIN: Int = 0

    init {
        val isNegativeLatitude = this.latitude < this.MIN
        val isNegativeLongitude = this.longitude < this.MIN
        if (isNegativeLatitude || isNegativeLongitude) {
            throw DimensionOutOfBoundsException("Negative dimension not allowed")
        }
    }
}
