package com.shangxiaom.mmoney.util

import android.content.Context
import android.widget.Toast
import com.shangxiaom.mmoney.R

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
 * @ 项目名称: com.shangxiaom.mmoney.util
 * @ 日        期:2018/7/20 16:50
 * @ 作        者:shangming
 ***************************************************
 */
class ClickUtil {

    companion object {
        private var mFinishClickTime: Long = 0

        /**
         * 快速点击两次返回键退出软件
         */
        fun doubleClickToFinish(context: Context): Boolean {
            val time = System.currentTimeMillis()
            if ((time - mFinishClickTime) > 2000) {
                Toast.makeText(context, context.getText(R.string.app_finish_keydown), Toast.LENGTH_SHORT).show()
                mFinishClickTime = time
                return false
            }
            return true
        }
    }

}