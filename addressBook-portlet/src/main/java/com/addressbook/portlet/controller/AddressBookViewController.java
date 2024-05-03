package com.addressbook.portlet.controller;

import java.io.IOException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class AddressBookViewController
 */
public class AddressBookViewController extends MVCPortlet {

  @Override
  public void init() throws PortletException {

    System.out.println("init AddressBookViewController");
    viewTemplate = getInitParameter("view-template");

  }

  @Override
  public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
      throws PortletException, IOException {

    System.out.println("processAction");

  }

//  @Override
//  public void render(RenderRequest renderRequest, RenderResponse renderResponse)
//      throws PortletException, IOException {
//
//    System.out.println("render");
  
//  }

  @Override
  public void doEdit(RenderRequest renderRequest, RenderResponse renderResponse)
      throws PortletException, IOException {

    System.out.println("doEdit");
  }

  @Override
  public void doHelp(RenderRequest renderRequest, RenderResponse renderResponse)
      throws PortletException, IOException {

    System.out.println("doHelp");

  }

  @Override
  public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
      throws PortletException, IOException {

    System.out.println("doView");
    include(viewTemplate, renderRequest, renderResponse);
  }

  protected void include(String path, RenderRequest renderRequest, RenderResponse renderResponse)
      throws IOException, PortletException {

    PortletRequestDispatcher portletRequestDispatcher =
        getPortletContext().getRequestDispatcher(path);

    if (portletRequestDispatcher == null) {
      _log.error(path + " is not a valid include");
    } else {
      portletRequestDispatcher.include(renderRequest, renderResponse);
    }
  }

  protected String viewTemplate;

  private static Log _log = LogFactoryUtil.getLog(AddressBookViewController.class);
  
}
