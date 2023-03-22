/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 21 de mar. de 2023 14:19:33                 ---
 * ----------------------------------------------------------------
 */
package moviescore.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.variants.jalo.VariantProduct;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import moviescore.constants.MoviescoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.variants.jalo.VariantProduct Ticket}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTicket extends VariantProduct
{
	/** Qualifier of the <code>Ticket.venue</code> attribute **/
	public static final String VENUE = "venue";
	/** Qualifier of the <code>Ticket.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>Ticket.ticketType</code> attribute **/
	public static final String TICKETTYPE = "ticketType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(VariantProduct.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(VENUE, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(TICKETTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ticket.date</code> attribute.
	 * @return the date - Date of movie
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ticket.date</code> attribute.
	 * @return the date - Date of movie
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ticket.date</code> attribute. 
	 * @param value the date - Date of movie
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ticket.date</code> attribute. 
	 * @param value the date - Date of movie
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ticket.ticketType</code> attribute.
	 * @return the ticketType - Type of movie exhibitor
	 */
	public EnumerationValue getTicketType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TICKETTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ticket.ticketType</code> attribute.
	 * @return the ticketType - Type of movie exhibitor
	 */
	public EnumerationValue getTicketType()
	{
		return getTicketType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ticket.ticketType</code> attribute. 
	 * @param value the ticketType - Type of movie exhibitor
	 */
	public void setTicketType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TICKETTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ticket.ticketType</code> attribute. 
	 * @param value the ticketType - Type of movie exhibitor
	 */
	public void setTicketType(final EnumerationValue value)
	{
		setTicketType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ticket.venue</code> attribute.
	 * @return the venue - Venue of ticket
	 */
	public String getVenue(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTicket.getVenue requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, VENUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ticket.venue</code> attribute.
	 * @return the venue - Venue of ticket
	 */
	public String getVenue()
	{
		return getVenue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ticket.venue</code> attribute. 
	 * @return the localized venue - Venue of ticket
	 */
	public Map<Language,String> getAllVenue(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,VENUE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ticket.venue</code> attribute. 
	 * @return the localized venue - Venue of ticket
	 */
	public Map<Language,String> getAllVenue()
	{
		return getAllVenue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ticket.venue</code> attribute. 
	 * @param value the venue - Venue of ticket
	 */
	public void setVenue(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTicket.setVenue requires a session language", 0 );
		}
		setLocalizedProperty(ctx, VENUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ticket.venue</code> attribute. 
	 * @param value the venue - Venue of ticket
	 */
	public void setVenue(final String value)
	{
		setVenue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ticket.venue</code> attribute. 
	 * @param value the venue - Venue of ticket
	 */
	public void setAllVenue(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,VENUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ticket.venue</code> attribute. 
	 * @param value the venue - Venue of ticket
	 */
	public void setAllVenue(final Map<Language,String> value)
	{
		setAllVenue( getSession().getSessionContext(), value );
	}
	
}
