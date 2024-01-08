package ru.hobbut.fop.zxing.qrcode;

import java.util.Properties;

import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class ConfigurationUtil {

	/**
	 * Read attributes from XML element and returns the configuration properties
	 *
	 * @param Element The DOM element
	 * @return Properties The configuration
	 */
	public static Properties toProperties(final Element element) {
		final NamedNodeMap attributes = element.getAttributes();
		Properties props = new Properties();
		for (int i = 0; i < attributes.getLength(); i++) {
			final Node node = attributes.item(i);
			props.setProperty(node.getNodeName(), node.getNodeValue());
		}

		return props;
	}
}
