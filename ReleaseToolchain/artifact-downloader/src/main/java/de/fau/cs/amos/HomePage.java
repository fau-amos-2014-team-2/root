package de.fau.cs.amos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Properties;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.DownloadLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HomePage extends WebPage {

	private static final long serialVersionUID = 1L;

	private static final String ARTIFACT_INFO = "/artifact-info.properties";

	public HomePage(final PageParameters parameters) throws IOException {
		super(parameters);

		Properties info = new Properties();
		{
			InputStream is = getClass().getResourceAsStream(ARTIFACT_INFO);
			if (is == null)
				throw new FileNotFoundException("Resource `" + ARTIFACT_INFO
						+ "' not found.");

			info.load(is);
			is.close();
		}

		String artifactPath = info.getProperty("artifact");
		if (artifactPath == null)
			throw new IllegalArgumentException(
					"Missing key `artifact' in resource `" + ARTIFACT_INFO
							+ "'.");

		String teamName = info.getProperty("teamName");
		if (teamName == null)
			throw new IllegalArgumentException(
					"Missing key `teamName' in resource `" + ARTIFACT_INFO
							+ "'.");

		add(new Label("team-name", teamName));

		File file;
		{
			URL url = getClass().getResource(artifactPath);
			if (url == null)
				throw new FileNotFoundException("Resource `" + artifactPath
						+ "' not found.");
			file = new File(URLDecoder.decode(url.getFile(), "UTF8"));
		}

		DownloadLink dl = new DownloadLink("artifact-download", file);
		add(dl);

		String artifactName = file.getName();
		{
			int i = artifactName.lastIndexOf('/');
			if (i != -1)
				artifactName = artifactName.substring(i + 1);
		}

		dl.add(new Label("name", artifactName));
	}
}
