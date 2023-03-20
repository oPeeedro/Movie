package moviesfacade.facades.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.variants.model.VariantProductModel;
import moviescore.model.TicketModel;
import moviesfacade.data.PlaceData;
import moviesfacade.data.TicketSummaryData;
import moviesfacade.facades.PlaceFacade;
import org.springframework.beans.factory.annotation.Required;

import java.util.ArrayList;
import java.util.List;

public class DefaultPlaceFacade implements PlaceFacade
{
    private ProductService productService;
    @Override
    public PlaceData getPlaceDetails(final String placeId)
    {
        if (placeId == null)
        {
            throw new IllegalArgumentException("Place id cannot be null");
        }
        final ProductModel product = productService.getProductForCode(placeId);
        if (product == null)
        {
            return null;
        }
        // Create a list of ConcertSummaryData from the matches
        final List<TicketSummaryData> ticketSummaryData = new ArrayList<>();
        if (product.getVariants() != null)
        {
            for (final VariantProductModel variant : product.getVariants())
            {
                if (variant instanceof TicketModel)
                {
                    final TicketModel ticket = (TicketModel) variant;
                    final TicketSummaryData summary = new TicketSummaryData();
                    summary.setQuantity(ticket.getOrderQuantityInterval());
                    summary.setDate(ticket.getDate());
                    summary.setVenue(ticket.getVenue());
                    summary.setType(String.valueOf(ticket.getTicketType()));
                    ticketSummaryData.add(summary);
                }
            }
        }
        // Now we can create the TourData transfer object
        final PlaceData place = new PlaceData();
        place.setId(product.getCode());
        place.setPlaceName(product.getName());
        place.setDescription(product.getDescription());
        place.setTickets(ticketSummaryData);
        return place;
    }
    @Required
    public void setProductService(final ProductService productService)
    {
        this.productService = productService;
    }
}