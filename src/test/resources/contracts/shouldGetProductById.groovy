package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url value(client(regex('/product/[0-9]*')), server('/product/1'))
    }
    response {
        status 200
        body (
                productId: value(server(regex("[0-9]+"))),
                name: value(server(regex("(Product )[0-9]+"))),
                quantity: value(server(regex("[0-9]+(\\.[0-9]+)?")))
        )
    }
}