package org.aludratest.maven;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * Mojo for executing the AludraTest codechecks. PMD is used to execute these
 * codechecks. The <code>maven-pmd-plugin</code> is <b>not</b> used.
 * 
 * @goal codecheck
 * 
 * @author falbrech
 * 
 */
public class AludraTestCodecheck extends AbstractMojo {

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {

        System.out.println("cowbell");

	}

}
