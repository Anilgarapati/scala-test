package techsophy

import org.scalatest.FunSuite

class SampleScalaTest extends FunSuite{

  test("get addition result") {
    assert(SampleScala.addMyData(10,20) == 30)
  }
}
