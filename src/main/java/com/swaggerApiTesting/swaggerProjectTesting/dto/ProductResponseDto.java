package com.swaggerApiTesting.swaggerProjectTesting.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


//------record instead of class...because if we use record internally i will create field private , final
//-------and generates automatically...
//getters
//equals()
//hashCode()
//toString()



//-----when call any field we call it as request.username not getUsername
//-----record is immutable thats why it doesnt have setter method...
public record ProductResponseDto(

        @Schema(
                description =
                        "Product Id",
                example = "1"
        )
        Long id,

        @Schema(
                description =
                        "Product Name",
                example = "iPhone 17"
        )
        String name,

        @Schema(
                description =
                        "Product Price",
                example = "99999"
        )
        BigDecimal price

) {
}


//-----------or-------------
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//public class ProductResponseDto{
//
//        private long id;
//        private String name;
//        private BigDecimal price;
//
//}