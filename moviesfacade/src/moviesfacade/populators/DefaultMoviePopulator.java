package moviesfacade.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.media.MediaContainerModel;
import de.hybris.platform.core.model.media.MediaFormatModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.media.MediaService;
import moviescore.enums.MovieType;
import moviescore.model.MovieModel;
import moviesfacade.data.ExhibitionSummaryData;
import moviesfacade.data.MovieData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;


public class DefaultMoviePopulator implements Populator<MovieModel, MovieData> {

    public static final String BAND_LIST_FORMAT = "movie.list.format.name";

    private static final String BAND_DETAIL_FORMAT = "movie.detail.format.name";

    private ConfigurationService configService;
    private MediaService mediaService;

    @Override
    public void populate(MovieModel source, MovieData target) throws ConversionException {

        //final String mediaFormatName = configService.getConfiguration().getString(BAND_LIST_FORMAT);
        //final MediaFormatModel format = mediaService.getFormat(mediaFormatName);

        target.setCode(source.getCode());
        target.setName(source.getName());
        target.setSynopsis(source.getSynopsis(Locale.ENGLISH));
        target.setReleaseYear(source.getReleaseYear());


        target.setTypes(getGenres(source));
        //target.setImageURL(getImageURL(source, format));
    }

    protected String getImageURL(final MovieModel sm, final MediaFormatModel format) {
        final MediaContainerModel container = sm.getImage();
        if (container != null) {
            return mediaService.getMediaByFormat(container, format).getDownloadURL();
        }
        return null;
    }

    private List<ExhibitionSummaryData> getExhibitionHistory(MovieModel source) {
        final List<ExhibitionSummaryData> exhibitionData = new ArrayList<>();
        if (source.getTickets() != null) {
            for (final ProductModel model : source.getTickets()) {
                final ExhibitionSummaryData summary = new ExhibitionSummaryData();
                summary.setId(model.getCode());
                summary.setName(model.getName(Locale.ENGLISH));
                summary.setNumberOfTickets(Integer.toString(model.getVariants().size()));
                exhibitionData.add(summary);
            }
        } return exhibitionData;
    }

    private List<String> getGenres(MovieModel source) {
        final List<String> genres = new ArrayList<>();
        if (source.getTypes() != null) {
            for (final MovieType movieType : source.getTypes()) {
                genres.add(movieType.getCode());
            }
        }
        return genres;
    }

    public MediaService getMediaService() {
        return mediaService;
    }

    public void setMediaService(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    public ConfigurationService getConfigurationService() {
        return configService;
    }

    public void setConfigurationService(ConfigurationService configurationService) {
        this.configService = configurationService;
    }
}
