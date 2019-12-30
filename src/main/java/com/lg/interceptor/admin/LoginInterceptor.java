package com.lg.interceptor.admin;

import com.lg.entity.admin.Menu;
import com.lg.util.MenuUtil;
import net.sf.json.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ��̨��¼������
 *
 * @author leron
 */
public class LoginInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        String requestURI = request.getRequestURI();
        Object admin = request.getSession().getAttribute("admin");
        if (admin == null) {
            //��ʾδ��¼���ߵ�¼ʧЧ
            System.out.println("����" + requestURI + "������������");
            String header = request.getHeader("X-Requested-With");
            //�ж��Ƿ���ajax����
            if ("XMLHttpRequest".equals(header)) {
                //��ʾ��ajax����
                Map<String, String> ret = new HashMap<String, String>();
                ret.put("type", "error");
                ret.put("msg", "��¼�Ự��ʱ��δ��¼�������µ�¼!");
                response.getWriter().write(JSONObject.fromObject(ret).toString());
                return false;
            }
            //��ʾ����ͨ������ת��ֱ���ض��򵽵�¼ҳ��
            response.sendRedirect(request.getServletContext().getContextPath() + "/admin/login");
            return false;
        }
        //��ȡ�˵�id
        String mid = request.getParameter("_mid");
        if (!StringUtils.isEmpty(mid)) {
            List<Menu> allThirdMenu = MenuUtil.getAllThirdMenu((List<Menu>) request.getSession().getAttribute("userMenus"), Long.valueOf(mid));
            request.setAttribute("thirdMenuList", allThirdMenu);
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
