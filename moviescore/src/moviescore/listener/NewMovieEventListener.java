package moviescore.listener;

import de.hybris.platform.servicelayer.event.events.AfterItemCreationEvent;
import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.servicelayer.model.ModelService;
import moviescore.model.APIModel;
import moviescore.model.MovieModel;

import java.util.Date;

public class NewMovieEventListener extends AbstractEventListener<AfterItemCreationEvent> {
    private static final String NEW_API_HEADLINE = "Movie %s connected with API";
    private static final String NEW_API_CONTENT = "There is a new connector in API, %s. DATE [%s]";
    private ModelService modelService;
    public ModelService getModelService()
    {
        return modelService;
    }
    public void setModelService(final ModelService modelService)
    {
        this.modelService = modelService;
    }
    @Override
    protected void onEvent(final AfterItemCreationEvent event)
    {
        if (event != null && event.getSource() != null)
        {
            final Object object = modelService.get(event.getSource());
            if (object instanceof MovieModel)
            {
                final MovieModel movie = (MovieModel) object;
                final String headline = String.format(NEW_API_HEADLINE, movie.getName());
                final String content = String.format(NEW_API_CONTENT, movie.getName(), new Date());
                final APIModel apiModel = modelService.create(APIModel.class);
                apiModel.setDate(new Date());
                apiModel.setHeadline(headline);
                apiModel.setContent(content);

                System.err.println("[LOG] -" + apiModel.getHeadline());

                modelService.save(apiModel);
            }
        }
    }
}