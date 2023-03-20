package moviesfacade.facades;

import moviesfacade.data.PlaceData;


public interface PlaceFacade
{
    PlaceData getPlaceDetails(final String tourId);
}