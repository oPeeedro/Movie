/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 20 de mar. de 2023 11:20:51                 ---
 * ----------------------------------------------------------------
 */
package moviescore.jalo;

import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.MediaContainer;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import moviescore.constants.MoviescoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Movie}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMovie extends GenericItem
{
	/** Qualifier of the <code>Movie.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Movie.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Movie.synopsis</code> attribute **/
	public static final String SYNOPSIS = "synopsis";
	/** Qualifier of the <code>Movie.releaseYear</code> attribute **/
	public static final String RELEASEYEAR = "releaseYear";
	/** Qualifier of the <code>Movie.image</code> attribute **/
	public static final String IMAGE = "image";
	/** Qualifier of the <code>Movie.tickets</code> attribute **/
	public static final String TICKETS = "tickets";
	/** Qualifier of the <code>Movie.types</code> attribute **/
	public static final String TYPES = "types";
	/** Relation ordering override parameter constants for Movie2GenreType from ((moviescore))*/
	protected static String MOVIE2GENRETYPE_SRC_ORDERED = "relation.Movie2GenreType.source.ordered";
	protected static String MOVIE2GENRETYPE_TGT_ORDERED = "relation.Movie2GenreType.target.ordered";
	/** Relation disable markmodifed parameter constants for Movie2GenreType from ((moviescore))*/
	protected static String MOVIE2GENRETYPE_MARKMODIFIED = "relation.Movie2GenreType.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n TICKETS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Product> TICKETSHANDLER = new OneToManyHandler<Product>(
	CoreConstants.TC.PRODUCT,
	false,
	"movie",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(SYNOPSIS, AttributeMode.INITIAL);
		tmp.put(RELEASEYEAR, AttributeMode.INITIAL);
		tmp.put(IMAGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.code</code> attribute.
	 * @return the code - short unique code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.code</code> attribute.
	 * @return the code - short unique code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.code</code> attribute. 
	 * @param value the code - short unique code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.code</code> attribute. 
	 * @param value the code - short unique code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.image</code> attribute.
	 * @return the image - picture of band in different formats
	 */
	public MediaContainer getImage(final SessionContext ctx)
	{
		return (MediaContainer)getProperty( ctx, IMAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.image</code> attribute.
	 * @return the image - picture of band in different formats
	 */
	public MediaContainer getImage()
	{
		return getImage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.image</code> attribute. 
	 * @param value the image - picture of band in different formats
	 */
	public void setImage(final SessionContext ctx, final MediaContainer value)
	{
		setProperty(ctx, IMAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.image</code> attribute. 
	 * @param value the image - picture of band in different formats
	 */
	public void setImage(final MediaContainer value)
	{
		setImage( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("MovieType");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(MOVIE2GENRETYPE_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.name</code> attribute.
	 * @return the name - Title of movie
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMovie.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.name</code> attribute.
	 * @return the name - Title of movie
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.name</code> attribute. 
	 * @return the localized name - Title of movie
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.name</code> attribute. 
	 * @return the localized name - Title of movie
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.name</code> attribute. 
	 * @param value the name - Title of movie
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMovie.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.name</code> attribute. 
	 * @param value the name - Title of movie
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.name</code> attribute. 
	 * @param value the name - Title of movie
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.name</code> attribute. 
	 * @param value the name - Title of movie
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.releaseYear</code> attribute.
	 * @return the releaseYear - The year that movie released
	 */
	public Date getReleaseYear(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RELEASEYEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.releaseYear</code> attribute.
	 * @return the releaseYear - The year that movie released
	 */
	public Date getReleaseYear()
	{
		return getReleaseYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.releaseYear</code> attribute. 
	 * @param value the releaseYear - The year that movie released
	 */
	public void setReleaseYear(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RELEASEYEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.releaseYear</code> attribute. 
	 * @param value the releaseYear - The year that movie released
	 */
	public void setReleaseYear(final Date value)
	{
		setReleaseYear( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.synopsis</code> attribute.
	 * @return the synopsis - Description of the movie
	 */
	public String getSynopsis(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMovie.getSynopsis requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, SYNOPSIS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.synopsis</code> attribute.
	 * @return the synopsis - Description of the movie
	 */
	public String getSynopsis()
	{
		return getSynopsis( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.synopsis</code> attribute. 
	 * @return the localized synopsis - Description of the movie
	 */
	public Map<Language,String> getAllSynopsis(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,SYNOPSIS,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.synopsis</code> attribute. 
	 * @return the localized synopsis - Description of the movie
	 */
	public Map<Language,String> getAllSynopsis()
	{
		return getAllSynopsis( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.synopsis</code> attribute. 
	 * @param value the synopsis - Description of the movie
	 */
	public void setSynopsis(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMovie.setSynopsis requires a session language", 0 );
		}
		setLocalizedProperty(ctx, SYNOPSIS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.synopsis</code> attribute. 
	 * @param value the synopsis - Description of the movie
	 */
	public void setSynopsis(final String value)
	{
		setSynopsis( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.synopsis</code> attribute. 
	 * @param value the synopsis - Description of the movie
	 */
	public void setAllSynopsis(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,SYNOPSIS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.synopsis</code> attribute. 
	 * @param value the synopsis - Description of the movie
	 */
	public void setAllSynopsis(final Map<Language,String> value)
	{
		setAllSynopsis( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.tickets</code> attribute.
	 * @return the tickets
	 */
	public Set<Product> getTickets(final SessionContext ctx)
	{
		return (Set<Product>)TICKETSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.tickets</code> attribute.
	 * @return the tickets
	 */
	public Set<Product> getTickets()
	{
		return getTickets( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.tickets</code> attribute. 
	 * @param value the tickets
	 */
	public void setTickets(final SessionContext ctx, final Set<Product> value)
	{
		TICKETSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.tickets</code> attribute. 
	 * @param value the tickets
	 */
	public void setTickets(final Set<Product> value)
	{
		setTickets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to tickets. 
	 * @param value the item to add to tickets
	 */
	public void addToTickets(final SessionContext ctx, final Product value)
	{
		TICKETSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to tickets. 
	 * @param value the item to add to tickets
	 */
	public void addToTickets(final Product value)
	{
		addToTickets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from tickets. 
	 * @param value the item to remove from tickets
	 */
	public void removeFromTickets(final SessionContext ctx, final Product value)
	{
		TICKETSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from tickets. 
	 * @param value the item to remove from tickets
	 */
	public void removeFromTickets(final Product value)
	{
		removeFromTickets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.types</code> attribute.
	 * @return the types
	 */
	public Collection<EnumerationValue> getTypes(final SessionContext ctx)
	{
		final List<EnumerationValue> items = getLinkedItems( 
			ctx,
			true,
			MoviescoreConstants.Relations.MOVIE2GENRETYPE,
			"MovieType",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Movie.types</code> attribute.
	 * @return the types
	 */
	public Collection<EnumerationValue> getTypes()
	{
		return getTypes( getSession().getSessionContext() );
	}
	
	public long getTypesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			MoviescoreConstants.Relations.MOVIE2GENRETYPE,
			"MovieType",
			null
		);
	}
	
	public long getTypesCount()
	{
		return getTypesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.types</code> attribute. 
	 * @param value the types
	 */
	public void setTypes(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setLinkedItems( 
			ctx,
			true,
			MoviescoreConstants.Relations.MOVIE2GENRETYPE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(MOVIE2GENRETYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Movie.types</code> attribute. 
	 * @param value the types
	 */
	public void setTypes(final Collection<EnumerationValue> value)
	{
		setTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to types. 
	 * @param value the item to add to types
	 */
	public void addToTypes(final SessionContext ctx, final EnumerationValue value)
	{
		addLinkedItems( 
			ctx,
			true,
			MoviescoreConstants.Relations.MOVIE2GENRETYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MOVIE2GENRETYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to types. 
	 * @param value the item to add to types
	 */
	public void addToTypes(final EnumerationValue value)
	{
		addToTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from types. 
	 * @param value the item to remove from types
	 */
	public void removeFromTypes(final SessionContext ctx, final EnumerationValue value)
	{
		removeLinkedItems( 
			ctx,
			true,
			MoviescoreConstants.Relations.MOVIE2GENRETYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MOVIE2GENRETYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from types. 
	 * @param value the item to remove from types
	 */
	public void removeFromTypes(final EnumerationValue value)
	{
		removeFromTypes( getSession().getSessionContext(), value );
	}
	
}
