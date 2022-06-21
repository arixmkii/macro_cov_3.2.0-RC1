import io.circe.*
import io.circe.generic.semiauto.*
import io.circe.syntax.*

implicit val basicCodec: Codec[Tuple1[String]] = deriveCodec[Tuple1[String]]

@main def main: Unit =
  println(Tuple1("value").asJson.noSpaces)
