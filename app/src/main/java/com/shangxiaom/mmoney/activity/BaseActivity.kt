package com.shangxiaom.mmoney.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.KeyEvent
import com.shangxiaom.mmoney.util.ClickUtil

/**
 ***************************************************
 *******************_ooOoo_
 ******************o8888888o
 ******************88\" . \"88
 ******************(| -_-  |)
 ******************O\\  =  /O
 ***************____/`---'\\____
 *************.'  \\\\|     |//  `.
~~~~~~~~~~~/  \\\\|||  :  |||//  \\
~~~~~~~~~~~/  _||||| -:- |||||-  \\
~~~~~~~~~~~|   | \\\\\\  -  /// |   |
~~~~~~~~~~~| \\_|  ''\\---/''  |   |
~~~~~~~~~~~\\  .-\\__  `-`  ___/-. /
~~~~~~~~~___`. .'  /--.--\\  `. . __
~~~~~~.\"\" '<  `.___\\_<|>_/___.'  >'\"\".
~~~~~| | :  `- \\`.;`\\ _ /`;.`/ - ` : | |
~~~~~\\  \\ `-.   \\_ __\\ /__ _/   .-` /  /
======`-.____`-.___\\_____/___.-`____.-'======
 *******************`=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
 ****************佛祖保佑*********永无BUG
 * @ 项目名称: com.shangxiaom.mmoney.activity
 * @ 日        期:2018/7/20 17:00
 * @ 作        者:shangming
 ***************************************************
 */
abstract class BaseActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    abstract fun init()

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (ClickUtil.doubleClickToFinish(this)) {
            finish()
            System.exit(0)
            android.os.Process.killProcess(android.os.Process.myPid())
        }
        return true
    }
}