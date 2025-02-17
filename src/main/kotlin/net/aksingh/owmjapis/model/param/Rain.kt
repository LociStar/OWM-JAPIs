/**************************************************************************************************
 * Copyright (c) 2013-2019 Ashutosh Kumar Singh <ashutosh@aksingh.net>                            *
 *                                                                                                *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this           *
 * software and associated documentation files (the "Software"), to deal in the Software without  *
 * restriction, including without limitation the rights to use, copy, modify, merge, publish,     *
 * distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the  *
 * Software is furnished to do so, subject to the following conditions:                           *
 *                                                                                                *
 * The above copyright notice and this permission notice shall be included in all copies or       *
 * substantial portions of the Software.                                                          *
 *                                                                                                *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING  *
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND     *
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,   *
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, *
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.        *
 **************************************************************************************************/

package net.aksingh.owmjapis.model.param

import com.google.gson.GsonBuilder
import com.google.gson.annotations.SerializedName

data class Rain(
  @field:SerializedName("1h")
  val precipVol1h: Double? = null,

  @field:SerializedName("3h")
  val precipVol3h: Double? = null
) {

  fun hasPrecipVol3h(): Boolean = precipVol3h != null
  fun hasPrecipVol1h(): Boolean = precipVol1h != null

  companion object Static {
    @JvmStatic
    fun fromJson(json: String): Rain {
      return GsonBuilder().create().fromJson(json, Rain::class.java)
    }

    @JvmStatic
    fun toJson(pojo: Rain): String {
      return GsonBuilder().create().toJson(pojo)
    }

    @JvmStatic
    fun toJsonPretty(pojo: Rain): String {
      return GsonBuilder().setPrettyPrinting().create().toJson(pojo)
    }
  }
}
