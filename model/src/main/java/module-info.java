import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.requirements.capability.RequirementsEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.requirements {
	
	exports org.nasdanika.models.requirements;
	exports org.nasdanika.models.requirements.impl;
	exports org.nasdanika.models.requirements.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.work;
	
	provides CapabilityFactory with 
		RequirementsEPackageResourceSetCapabilityFactory;
	
}