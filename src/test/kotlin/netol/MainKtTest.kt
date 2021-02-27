package netol

import org.junit.Assert.*
import org.junit.Test
class MainKtTest{

    @Test
    fun calculatePrice_UserNormalDiscount(){
        val itemPrice = 100
        val itemCount = 11
        val discount = 100
        val discountStart = 1_000
        val expected=1_000
        val result = calculatePrice(
            itemCount = itemCount,
            itemPrice = itemPrice,
            discount=discount,
            discountStart=discountStart
        )
        assertEquals(expected,result)
    }
    @Test
    fun calculatePrice_UserGoldDiscount(){
        val itemPrice = 100
        val itemCount = 11
        val discount = 100
        val discountStart = 1_000
        val expected=900

        val result = calculatePrice(
                userLevel = "gold",
                itemCount = itemCount,
                itemPrice = itemPrice,
                discount=discount,
                discountStart=discountStart
        )
        assertEquals(expected,result)
    }
}