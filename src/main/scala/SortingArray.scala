@main
def main(): Unit = {
  //Simple way
  var array = Array(1,3,4,2,6)
  var array1=array.sorted
  for i <- array1 do println(i)

  //Regular
  var numberArray=Array(1,5,4,3)
  for (i <- 0 until numberArray.length){
    for (j <-0 until numberArray.length -1){
         if(numberArray(j)> numberArray(j+1)){
           var tmp=numberArray(j);
           numberArray(j)= numberArray(j+1)
           numberArray(j+1)=tmp
         }
    }
  }
  println(numberArray.mkString(", "))
}
