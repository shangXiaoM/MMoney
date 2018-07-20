package com.shangxiaom.mmoney.activity

import android.os.Bundle
import com.shangxiaom.mmoney.R
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_profit.setOnClickListener({
            forMoney()
        })
    }

    override fun init() {
    }

    private fun forMoney() {
        var baseMoney = 0.0
        var years = 0
        var rate = 0.0
        var perMoney = 0.0

        if (money_base.text.toString() != "") {
            baseMoney = money_base.text.toString().toDouble()
        }
        if (duration_years.text.toString() != "") {
            years = duration_years.text.toString().toInt()
        }
        if (annual_rate.text.toString() != "") {
            rate = annual_rate.text.toString().toDouble()
        }
        if (per_money_year.text.toString() != "") {
            perMoney = per_money_year.text.toString().toDouble()
        }

        val profit = BigDecimal(getProfit(baseMoney, years, rate, perMoney)).setScale(2, BigDecimal.ROUND_HALF_DOWN).toFloat()
        var result = ""
        if (0.00F != profit) {
            result = profit.toString() + "元"
        }
        profit_result.text = result
    }

    /**
     * 获取定投收益：本金，年限，年化率，定投金额
     */
    private fun getProfit(base: Double = 0.0, years: Int = 0, rate: Double = 0.0, perMoney: Double = 0.0): Double {
        var sum: Double = base
        for (i in 0 until years) {
            sum += perMoney
            sum += sum * rate / 100
        }
        return sum
    }
}
