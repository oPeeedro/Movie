/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package moviestorefront.setup;

import static moviestorefront.constants.MoviestorefrontConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import moviestorefront.constants.MoviestorefrontConstants;
import moviestorefront.service.MoviestorefrontService;


@SystemSetup(extension = MoviestorefrontConstants.EXTENSIONNAME)
public class MoviestorefrontSystemSetup
{
	private final MoviestorefrontService moviestorefrontService;

	public MoviestorefrontSystemSetup(final MoviestorefrontService moviestorefrontService)
	{
		this.moviestorefrontService = moviestorefrontService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		moviestorefrontService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return MoviestorefrontSystemSetup.class.getResourceAsStream("/moviestorefront/sap-hybris-platform.png");
	}
}
