package hjh.spring.POS.controller;

import hjh.spring.POS.model.Balance;
import hjh.spring.POS.model.Member;
import hjh.spring.POS.service.BalanceService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController
{
    private final BalanceService balanceService;

    public IndexController(BalanceService balanceService)
    {
        this.balanceService = balanceService;
    }

    @GetMapping("/")
    public String index(HttpSession session)
    {
        Member loginMember = (Member) session.getAttribute("loginMember");
        if(loginMember == null)
        {
            return "member/loginFirst";
        }

        Balance balance = balanceService.findFirstBalance();

        session.setAttribute("balance", balance);
        return "index";
    }
}
