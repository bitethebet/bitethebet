/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.security;

import java.io.IOException;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import pl.bitethebet.model.AuthorityRole;

/**
 *
 * @author mrowkam
 */
public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
        if (roles.contains(AuthorityRole.ROLE_ADMIN.name()))  {
            response.sendRedirect("/secure/admin/console.html");
        } else if (roles.contains(AuthorityRole.ROLE_USER.name()))  {
            response.sendRedirect("/secure/user/dashboard.html");
        }

    }
    
}
