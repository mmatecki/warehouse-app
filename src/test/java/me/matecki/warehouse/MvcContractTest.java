package me.matecki.warehouse;


import static me.matecki.warehouse.fixture.ProductFixture.aProduct;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import me.matecki.warehouse.rest.WarehouseController;
import me.matecki.warehouse.service.WarehouseService;
import org.junit.Before;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;

public class MvcContractTest {

    @Before
    public void setup() {
        StandaloneMockMvcBuilder
            standaloneMockMvcBuilder =
            MockMvcBuilders.standaloneSetup(setupWarehouseController());
        RestAssuredMockMvc.mockMvc(standaloneMockMvcBuilder.build());
    }

    private WarehouseController setupWarehouseController() {
        WarehouseService warehouseService = mock(WarehouseService.class);
        when(warehouseService.getProduct(anyLong())).thenReturn(aProduct().withId(10L).withName("Product 10").withQuantity(81.23).build());

        return new WarehouseController(warehouseService);
    }
}
