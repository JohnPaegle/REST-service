package payroll;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class RootController {

    @GetMapping
    ResourceSupport index() {
        ResourceSupport rootResource = new ResourceSupport();
        rootResource.add(linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
        rootResource.add(linkTo(methodOn(OrderController.class).all()).withRel("orders"));
        return rootResource;
    }
}
//VndError response object clearly indicates that you aren’t allowed to "cancel" an order already in the "CANCELLED" status.
