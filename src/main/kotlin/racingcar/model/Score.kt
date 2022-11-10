package racingcar.model

private const val MINIMUM_SCORE = 0
private const val MAXIMUM_SCORE = 9

class Score(val value: Int) {

    init {
        require(value in (MINIMUM_SCORE..MAXIMUM_SCORE))
    }

    fun isBiggerThanOrEquals(target: Int) = value >= target
}
