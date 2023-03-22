package moviescore.handler;

import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;
import moviescore.model.MovieModel;
import org.springframework.stereotype.Component;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@Component
public class MovieAgeAttributeHandler extends AbstractDynamicAttributeHandler<Long, MovieModel> {
    @Override
    public Long get(final MovieModel model)
    {
        if (model.getReleaseYear() == null)
        {
            return null;
        }
        final Integer releaseYear = model.getReleaseYear().toInstant().atZone(ZoneId.systemDefault()).getYear();
        final Integer now = ZonedDateTime.now().getYear();
        if (releaseYear.equals(now))
        {
            return Long.valueOf(0L);
        }
        return Long.valueOf(now - releaseYear);
    }
}
