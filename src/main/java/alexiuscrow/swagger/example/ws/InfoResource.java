package alexiuscrow.swagger.example.ws;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("info")
@Api(value = "/info", description = "Info resource")
public class InfoResource {
    @GET
    @Produces({"text/html"})
    @ApiOperation(
            value = "Get some info",
            response = String.class
    )
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Ok")
            }
    )
    public String get() {
        return  "Some info";
    }
}
