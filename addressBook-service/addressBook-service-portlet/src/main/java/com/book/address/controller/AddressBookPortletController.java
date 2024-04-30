package com.book.address.controller;

import java.io.IOException;
import java.util.List;
import java.util.UUID;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import com.book.address.model.AddressBook;
import com.book.address.model.impl.AddressBookImpl;
import com.book.address.service.AddressBookLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;

/**
 * Portlet implementation class AddressBookPortlet
 */
public class AddressBookPortletController extends MVCPortlet {

  @Override
  public void init() throws PortletException {
    
    System.out.println("init AddressBookPortletController");
    viewTemplate = getInitParameter("view-template");

  }
  
  @Override
  public void render(RenderRequest renderRequest, RenderResponse renderResponse)
      throws PortletException, IOException {
    
    try {
      List<AddressBook> addressBooks = AddressBookLocalServiceUtil.getAddressBooks(0, 1000);
      renderRequest.setAttribute("addressBooks", addressBooks);
      long newId = CounterLocalServiceUtil.increment();
      AddressBook addressBook = new AddressBookImpl();
      addressBook = AddressBookLocalServiceUtil.createAddressBook(newId);
      addressBook.setAge(100);
      addressBook.setEmail("mm@hotmail.com");
      addressBook.setMessage("Testing message");
      addressBook.setName("My name");
  
      //AddressBookLocalServiceUtil.addAddressBook(addressBook);
      int count = AddressBookLocalServiceUtil.getAddressBooksCount();
  
      System.out.println("addressBook count: " + count);
  
    } catch (SystemException e) {
      e.printStackTrace();
    }
    
    include(viewTemplate, renderRequest, renderResponse);
    
  }

  @Override
  public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
      throws PortletException, IOException {
    
    System.out.println("processAction");
    
    String actionName = actionRequest.getParameter(ActionRequest.ACTION_NAME);
    
    if ("deleteRecordAction".equals(actionName)) {
        // Handle delete record action
        String addressBookId = actionRequest.getParameter("addressBookId");
        try {
          AddressBookLocalServiceUtil.deleteAddressBook(Long.parseLong(addressBookId));
        } catch (NumberFormatException | PortalException | SystemException e) {
          e.printStackTrace();
        }
    }

    actionResponse.sendRedirect("/");

  }

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

  private static Log _log = LogFactoryUtil.getLog(AddressBookPortletController.class);
  
}


