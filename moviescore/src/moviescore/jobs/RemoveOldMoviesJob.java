package moviescore.jobs;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.util.mail.MailUtils;
import moviescore.model.MovieModel;
import moviescore.service.MovieService;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class RemoveOldMoviesJob extends AbstractJobPerformable<CronJobModel> {

    private static final String LimitYear = "movies.removeOldMoviesjob.date";
    private static final Logger LOG = Logger.getLogger(MovieModel.class);

    private ModelService service;
    private MovieService movieService;
    private ConfigurationService configurationService;
    @Required
    public ConfigurationService getConfigurationService()
    {
        return configurationService;
    }
    @Required
    public void setConfigurationService(final ConfigurationService configurationService)
    {
        this.configurationService = configurationService;
    }
    @Required
    public MovieService getMovieService() {
        return movieService;
    }
    @Required
    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    public PerformResult perform(final CronJobModel cronJob)
    {

        Date date = new Date(LimitYear);
        date.toString();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        String year = String.valueOf(calendar.get(Calendar.YEAR));


        LOG.info("Removing old movies from records.");
        final List<MovieModel> oldMovies = getMovieService().getMoviesUntilYear(year);

        if (oldMovies.isEmpty())
        {
            LOG.info("No movie items for today, skipping method");
            return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
        }
        try
        {
            service.removeAll(oldMovies);
        }
        catch (final Exception e)
        {
            LOG.error("Problem removing movies.");
            LOG.error("Problem removing the list of movies.", e);
            return new PerformResult(CronJobResult.FAILURE, CronJobStatus.FINISHED);
        }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}