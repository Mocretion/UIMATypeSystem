
/* First created by JCasGen Fri Mar 20 09:15:06 CET 2020 */
package org.texttechnologylab.annotation.type.concept;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologylab.annotation.AbstractNamedEntity_Type;

/** 
 * Updated by JCasGen Fri Mar 20 09:15:08 CET 2020
 * @generated */
public class State_Condition_Type extends AbstractNamedEntity_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = State_Condition.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.concept.State_Condition");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public State_Condition_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    