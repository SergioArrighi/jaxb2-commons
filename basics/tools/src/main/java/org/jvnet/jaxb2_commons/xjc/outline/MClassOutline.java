package org.jvnet.jaxb2_commons.xjc.outline;

import java.util.List;

import org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo;

import com.sun.codemodel.JClass;
import com.sun.codemodel.JDefinedClass;

public interface MClassOutline extends MChildOutline, MPackagedOutline, MTargeted<MClassInfo>{

	public MClassInfo getTarget();

	public MModelOutline getModelOutline();

	public MClassOutline getSuperClassOutline();

	public List<MPropertyOutline> getProperties();

	public List<MPropertyOutline> getDeclaredProperties();

	public JDefinedClass getReferenceCode();
	
	public JDefinedClass getImplementationCode();

	public JClass getImplementationReferenceCode();
}
