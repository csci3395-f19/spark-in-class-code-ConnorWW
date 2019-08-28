package basics

case class TempRow(
    day: Int,
    doy: Int,
    month: Int,
    year: Int,
    precip: Double,
    tave: Double,
    tmax: Double,
    tmin: Double
)

object SATemps {

  def parseLine(line: String): TempRow = {
    val p = line.split(",")
    TempRow(
      p(0).toInt,
      p(1).toInt,
      p(2).toInt,
      p(4).toInt,
      p(5).toDouble,
      p(6).toDouble,
      p(7).toDouble,
      p(8).toDouble
    )
  }

  def main(args: Array[String]): Unit = {
  	val source = scala.io.Source.fromFile("/users/mlewis/CSCI3395-F19/InClassBD/data/SanAntonioTemps.csv")
	
  	val lines = source.getLines()
    val data = lines.drop(2).map(parseLine).toArray
  
    val highestTempRow = data.maxBy(_.tmax)
    println("Date of highest temperature: " + highestTempRow.month + "/" + highestTempRow.day + "/" + highestTempRow.year)
  
    val highestRainRow = data.maxBy(_.precip)
    println("Date of most precipitation: " + highestRainRow.month + "/" + highestRainRow.day + "/" + highestRainRow.year)

    val rowsWithRainOverOneInch = data.filter(_.precip >= 1.0)
    println("Fraction of days with more than one inch of rain: " + rowsWithRainOverOneInch.length + " / " + data.length)

    val lstRainMaxTemps = rowsWithRainOverOneInch.map(_.tmax)
    val rainyMaxTempAvg = (lstRainMaxTemps.foldRight[Double](0)((sum, temp ) => {sum + temp} )) / lstRainMaxTemps.length
    println("Average max temperature on 'rainy' days is: " + rainyMaxTempAvg)

    val groupedMonths = data.groupBy(_.month).toArray
    groupedMonths.foreach(()
    


	source.close()
  }

  
}
