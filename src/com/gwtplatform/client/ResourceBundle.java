package com.gwtplatform.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.ImageResource;

/**
 * The resource bundle for images, css reosources.
 * 
 * @author Ilya Sviridov
 * 
 */

public interface ResourceBundle extends ClientBundle {
	public static final ResourceBundle INSTANCE = GWT.create(ResourceBundle.class);

	/**
	 * The application css
	 * 
	 */
	@Source("ApplicationStyle.css")
	@CssResource.NotStrict
	public Style css();

	/**
	 * The create new substitution control icon
	 * 
	 */
	@Source("create.gif")
	public ImageResource createIcon();

	/**
	 * The create new substitution control icon as DataResource
	 * 
	 */
	@Source("create.gif")
	public DataResource createIconResource();

	/**
	 * 
	 * Update control icon
	 */
	@Source("update_active_icon.gif")
	public DataResource updateIconResource();

	/**
	 * Update controll icon in disabled state
	 * 
	 */
	@Source("update.gif")
	public DataResource updateIconDisabledResource();

	/**
	 * Delete icon
	 * 
	 */
	@Source("delete_active_icon.gif")
	public DataResource deleteIconResource();
	
	/**
	 * Delete icon
	 * 
	 */
	@Source("logo.png")
	public DataResource LogoResource();

	/**
	 * Delete icon disabled
	 * 
	 */
	@Source("delete.gif")
	public DataResource deleteIconDisabledResource();

	/**
	 * The window icon on substitution management window
	 * 
	 */
	@Source("wind_icon.gif")
	public ImageResource substitutionWindowIcon();

	/**
	 * The window icon on edit substitution window
	 * 
	 */
	@Source("wind_icon2.gif")
	public ImageResource substitutionEditWindowIcon();

	/**
	 * 
	 * The X image
	 */
	@Source("close_btn.gif")
	public ImageResource closeButtonIcon();

	/**
	 * 
	 * The X image as resource
	 * 
	 */
	@Source("close_btn.gif")
	public DataResource closeButtonIconResource();

	/**
	 * 
	 * Window styling corner
	 * 
	 */
	@Source("top_left_corner.png")
	public DataResource topLeftCorner();

	/**
	 * 
	 * Window styling corner
	 * 
	 */
	@Source("top_right_corner.png")
	public DataResource topRightCorner();

	/**
	 * 
	 * Window styling corner
	 * 
	 */
	@Source("bottom_left_corner.png")
	public DataResource bottomLeftCorner();

	/**
	 * 
	 * Window styling corner
	 * 
	 */
	@Source("bottom_right_corner.png")
	public DataResource bottomRightCorner();

	/**
	 * 
	 * Window styling background
	 * 
	 */
	@Source("top_repeat_center.png")
	public DataResource topCenterBackground();

	/**
	 * 
	 * Window styling background
	 * 
	 */
	@Source("left_middle_cen.png")
	public DataResource middleLeftBackground();

	/**
	 * 
	 * Window styling background
	 * 
	 */
	@Source("bottom_repeat_center.png")
	public DataResource bottomCenterBackground();

	/**
	 * 
	 * Window styling background
	 * 
	 */
	@Source("right_middle_cen.png")
	public DataResource middleRightBackground();

	/**
	 * 
	 * The button styling
	 * 
	 */
	@Source("btn_bg_l.png")
	public DataResource buttonLeftBackgroungResource();

	/**
	 * 
	 * The button styling
	 * 
	 */
	@Source("btn_bg_r.png")
	public DataResource buttonRightBackgroungResource();

	/**
	 * 
	 * The button styling
	 * 
	 */
	@Source("btn_bg_c.png")
	public DataResource buttonCenterBackgroungResource();

	/**
	 * 
	 * Cancel button icon resource
	 */
	@Source("cancel_icon.png")
	public DataResource cancelIconResource();

	/**
	 * The tabs styling resource
	 * 
	 */
	@Source("tab_active_bg_l.jpg")
	public DataResource tabActiveBackgroundLeftResource();

	/**
	 * The tabs styling resource
	 * 
	 */
	@Source("tab_active_bg_r.jpg")
	public DataResource tabActiveBackgroundRightResource();

	/**
	 * The tabs styling resource
	 * 
	 */
	@Source("tab_state_bg_l.jpg")
	public DataResource tabBackgroundLeftResource();

	/**
	 * The tabs styling resource
	 * 
	 */
	@Source("tab_state_bg_r.jpg")
	public DataResource tabBackgroundRightResource();

	/**
	 * The tabs styling resource
	 * 
	 */
	@Source("tab_nav_bg.gif")
	public DataResource tabNavigationBackgroundRightResource();

	/**
	 * The background image for control panel
	 * 
	 */
	@Source("control_panel_bg.gif")
	public DataResource controlPanelBackgroundResource();

	/**
	 * 
	 * The date piker icon
	 * 
	 */
	@Source("date_picker.gif")
	public DataResource datePickerIconResource();

	/**
	 * Save button icom
	 * 
	 */
	@Source("save_icon.png")
	public DataResource saveButtonIconResource();

	/**
	 * The CSSResource style class
	 * 
	 * @author Ilya Sviridov
	 * 
	 */
	public interface Style extends CssResource {
		/**
		 * Returns tabTyle
		 */
		String tabStyle();
	}
}
