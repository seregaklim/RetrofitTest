package com.seregaklim.myhotel

data class  Ticket (
    // Цена в рублях
   var price: Int,
    // Код авиакомпании (iata)
 var   carrier: String,
var  segments :List<Segments>
    )

 data class Segments(

     // Код города (iata)
    var origin: String,
     // Код города (iata)
  var   destination: String,
     // Дата и время вылета туда
  var   date: String,
     // Массив кодов (iata) городов с пересадками
  var   stops: List<Stops>,
     // Общее время перелёта в минутах
  var   duration: Int,
 )


data class Stops(
    var city:String
)