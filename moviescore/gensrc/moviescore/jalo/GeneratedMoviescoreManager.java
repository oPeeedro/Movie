/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 21 de mar. de 2023 10:58:49                 ---
 * ----------------------------------------------------------------
 */
package moviescore.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import moviescore.constants.MoviescoreConstants;
import moviescore.jalo.Movie;
import moviescore.jalo.Ticket;

/**
 * Generated class for type <code>MoviescoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMoviescoreManager extends Extension
{
	/** Relation ordering override parameter constants for Movie2GenreType from ((moviescore))*/
	protected static String MOVIE2GENRETYPE_SRC_ORDERED = "relation.Movie2GenreType.source.ordered";
	protected static String MOVIE2GENRETYPE_TGT_ORDERED = "relation.Movie2GenreType.target.ordered";
	/** Relation disable markmodifed parameter constants for Movie2GenreType from ((moviescore))*/
	protected static String MOVIE2GENRETYPE_MARKMODIFIED = "relation.Movie2GenreType.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("hashtag", AttributeMode.INITIAL);
		tmp.put("movie", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public Movie createMovie(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MoviescoreConstants.TC.MOVIE );
			return (Movie)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Movie : "+e.getMessage(), 0 );
		}
	}
	
	public Movie createMovie(final Map attributeValues)
	{
		return createMovie( getSession().getSessionContext(), attributeValues );
	}
	
	public Ticket createTicket(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MoviescoreConstants.TC.TICKET );
			return (Ticket)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Ticket : "+e.getMessage(), 0 );
		}
	}
	
	public Ticket createTicket(final Map attributeValues)
	{
		return createTicket( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return MoviescoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.hashtag</code> attribute.
	 * @return the hashtag - hashtag of concert tour for social media
	 */
	public String getHashtag(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, MoviescoreConstants.Attributes.Product.HASHTAG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.hashtag</code> attribute.
	 * @return the hashtag - hashtag of concert tour for social media
	 */
	public String getHashtag(final Product item)
	{
		return getHashtag( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.hashtag</code> attribute. 
	 * @param value the hashtag - hashtag of concert tour for social media
	 */
	public void setHashtag(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, MoviescoreConstants.Attributes.Product.HASHTAG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.hashtag</code> attribute. 
	 * @param value the hashtag - hashtag of concert tour for social media
	 */
	public void setHashtag(final Product item, final String value)
	{
		setHashtag( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.movie</code> attribute.
	 * @return the movie
	 */
	public Movie getMovie(final SessionContext ctx, final Product item)
	{
		return (Movie)item.getProperty( ctx, MoviescoreConstants.Attributes.Product.MOVIE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.movie</code> attribute.
	 * @return the movie
	 */
	public Movie getMovie(final Product item)
	{
		return getMovie( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.movie</code> attribute. 
	 * @param value the movie
	 */
	public void setMovie(final SessionContext ctx, final Product item, final Movie value)
	{
		item.setProperty(ctx, MoviescoreConstants.Attributes.Product.MOVIE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.movie</code> attribute. 
	 * @param value the movie
	 */
	public void setMovie(final Product item, final Movie value)
	{
		setMovie( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MovieType.movies</code> attribute.
	 * @return the movies
	 */
	public Set<Movie> getMovies(final SessionContext ctx, final EnumerationValue item)
	{
		final List<Movie> items = item.getLinkedItems( 
			ctx,
			false,
			MoviescoreConstants.Relations.MOVIE2GENRETYPE,
			"Movie",
			null,
			false,
			false
		);
		return new LinkedHashSet<Movie>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MovieType.movies</code> attribute.
	 * @return the movies
	 */
	public Set<Movie> getMovies(final EnumerationValue item)
	{
		return getMovies( getSession().getSessionContext(), item );
	}
	
	public long getMoviesCount(final SessionContext ctx, final EnumerationValue item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			MoviescoreConstants.Relations.MOVIE2GENRETYPE,
			"Movie",
			null
		);
	}
	
	public long getMoviesCount(final EnumerationValue item)
	{
		return getMoviesCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MovieType.movies</code> attribute. 
	 * @param value the movies
	 */
	public void setMovies(final SessionContext ctx, final EnumerationValue item, final Set<Movie> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			MoviescoreConstants.Relations.MOVIE2GENRETYPE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(MOVIE2GENRETYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MovieType.movies</code> attribute. 
	 * @param value the movies
	 */
	public void setMovies(final EnumerationValue item, final Set<Movie> value)
	{
		setMovies( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to movies. 
	 * @param value the item to add to movies
	 */
	public void addToMovies(final SessionContext ctx, final EnumerationValue item, final Movie value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			MoviescoreConstants.Relations.MOVIE2GENRETYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MOVIE2GENRETYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to movies. 
	 * @param value the item to add to movies
	 */
	public void addToMovies(final EnumerationValue item, final Movie value)
	{
		addToMovies( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from movies. 
	 * @param value the item to remove from movies
	 */
	public void removeFromMovies(final SessionContext ctx, final EnumerationValue item, final Movie value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			MoviescoreConstants.Relations.MOVIE2GENRETYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MOVIE2GENRETYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from movies. 
	 * @param value the item to remove from movies
	 */
	public void removeFromMovies(final EnumerationValue item, final Movie value)
	{
		removeFromMovies( getSession().getSessionContext(), item, value );
	}
	
}
