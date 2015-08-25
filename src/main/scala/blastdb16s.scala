package ohnosequencesbundles.statika

import ohnosequences.statika._, bundles._, instructions._
import java.io.File


abstract class blastdb16s extends Bundle() {

  val blastdbFilename = "era7.16S.reference.sequences.0.1.0"
  val blastdbFile = new File(blastdbFilename)

  def install: Results = {
    Seq("wget", s"https://s3-eu-west-1.amazonaws.com/resources.ohnosequences.com/16s/${blastdbFilename}.tgz") ->-
    Seq("tar", "-xvf", s"${blastdbFilename}.tgz") ->-
    success(s"${bundleName} is installed")
  }
}
