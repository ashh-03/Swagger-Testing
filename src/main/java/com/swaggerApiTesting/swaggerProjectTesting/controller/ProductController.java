package com.swaggerApiTesting.swaggerProjectTesting.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@Tag(name="Product-Controller" , description = "Operatin on products")
public class ProductController {



    @Operation(
            summary = "Get Product By Id",
            description = "Returns product details using product id"
    )

    @ApiResponses({

            @ApiResponse(
                    responseCode = "200",
                    description = "Product Found"
            ),

            @ApiResponse(
                    responseCode = "404",
                    description = "Product Not Found"
            )
    })
    @GetMapping("/{id}")
    public String getProduct(
            @PathVariable Long id
    ) {

        return "user found by id" + id ;
    }


    //-----------------------login api------------------

    @Operation(
            summary = "Login User"
    )

    @ApiResponses({

            @ApiResponse(
                    responseCode = "200",
                    description = "Login Successful"
            ),

            @ApiResponse(
                    responseCode = "401",
                    description = "Invalid Credentials"
            )
    })
    @PostMapping("/login")
    public String login(){
       return "user logined";
    }

}