package moviescore.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import moviescore.constants.MoviescoreConstants;
import org.apache.log4j.Logger;

public class MoviescoreManager extends GeneratedMoviescoreManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( MoviescoreManager.class.getName() );
	
	public static final MoviescoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (MoviescoreManager) em.getExtension(MoviescoreConstants.EXTENSIONNAME);
	}
	
}
