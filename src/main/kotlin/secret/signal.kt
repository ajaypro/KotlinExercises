package secret

/**
 * @Author Ajay on 06-02-2019.
 */
enum class signal(val bitFlag: Int) {

    WINK(0b0001),
    DOUBLE_BLINK(0b0010),
    CLOSE_YOUR_EYES(0b0100),
    JUMP(0b1000)
}