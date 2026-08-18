package org.nasdanika.models.requirements.capability;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.capability.emf.EPackageCapabilityFactory;
import org.nasdanika.models.requirements.RequirementsPackage;

public class RequirementsEPackageResourceSetCapabilityFactory extends EPackageCapabilityFactory {

	@Override
	protected EPackage getEPackage() {
		return RequirementsPackage.eINSTANCE;
	}

	@Override
	protected URI getDocumentationURI() {
		return URI.createURI("https://requirements.models.nasdanika.org/");
	}

}
