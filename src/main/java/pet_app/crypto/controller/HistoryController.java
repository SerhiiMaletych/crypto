package pet_app.crypto.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@PreAuthorize("hasAuthority('admin_rights')")
public class HistoryController {


}
