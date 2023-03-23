/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 23 de mar. de 2023 10:10:36                 ---
 * ----------------------------------------------------------------
 */
package moviescore.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import moviescore.constants.MoviescoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem API}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedAPI extends GenericItem
{
	/** Qualifier of the <code>API.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>API.headline</code> attribute **/
	public static final String HEADLINE = "headline";
	/** Qualifier of the <code>API.content</code> attribute **/
	public static final String CONTENT = "content";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(HEADLINE, AttributeMode.INITIAL);
		tmp.put(CONTENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>API.content</code> attribute.
	 * @return the content - Body of requisition
	 */
	public String getContent(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>API.content</code> attribute.
	 * @return the content - Body of requisition
	 */
	public String getContent()
	{
		return getContent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>API.content</code> attribute. 
	 * @param value the content - Body of requisition
	 */
	public void setContent(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>API.content</code> attribute. 
	 * @param value the content - Body of requisition
	 */
	public void setContent(final String value)
	{
		setContent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>API.date</code> attribute.
	 * @return the date - date of new connection item
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>API.date</code> attribute.
	 * @return the date - date of new connection item
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>API.date</code> attribute. 
	 * @param value the date - date of new connection item
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>API.date</code> attribute. 
	 * @param value the date - date of new connection item
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>API.headline</code> attribute.
	 * @return the headline - short headline for the api item
	 */
	public String getHeadline(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HEADLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>API.headline</code> attribute.
	 * @return the headline - short headline for the api item
	 */
	public String getHeadline()
	{
		return getHeadline( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>API.headline</code> attribute. 
	 * @param value the headline - short headline for the api item
	 */
	public void setHeadline(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HEADLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>API.headline</code> attribute. 
	 * @param value the headline - short headline for the api item
	 */
	public void setHeadline(final String value)
	{
		setHeadline( getSession().getSessionContext(), value );
	}
	
}
