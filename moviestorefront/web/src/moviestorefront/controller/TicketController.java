package moviestorefront.controller;

import de.hybris.platform.catalog.CatalogVersionService;
import moviesfacade.data.PlaceData;
import moviesfacade.facades.PlaceFacade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@Controller
public class TicketController
{
    private static final String CATALOG_ID = "moviesProductCatalog";
    private static final String CATALOG_VERSION_NAME = "Online";
    private CatalogVersionService catalogVersionService;
    private PlaceFacade ticketFacade;
    @RequestMapping(value = "/ticket/{ticketId}")
    public String showPlaceDetails(@PathVariable final String ticketId, final Model model) throws UnsupportedEncodingException
    {
        catalogVersionService.setSessionCatalogVersion(CATALOG_ID, CATALOG_VERSION_NAME);
        final String decodedTourId = URLDecoder.decode(ticketId, "UTF-8");
        final PlaceData ticket = ticketFacade.getPlaceDetails(decodedTourId);
        model.addAttribute("ticket", ticket);
        return "PlaceDetails";
    }
    @Autowired
    public void setCatalogVersionService(final CatalogVersionService catalogVersionServiceService)
    {
        this.catalogVersionService = catalogVersionServiceService;
    }
    @Autowired
    public void setFacade(final PlaceFacade facade)
    {
        this.ticketFacade = facade;
    }
}