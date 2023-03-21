/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package moviestorefront.controller;

import static moviestorefront.constants.MoviestorefrontConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import moviestorefront.service.MoviestorefrontService;


@Controller
public class MoviestorefrontHelloController
{
	@Autowired
	private MoviestorefrontService moviestorefrontService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", moviestorefrontService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}
