
/* First created by JCasGen Fri Mar 20 09:14:29 CET 2020 */
package de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.tweet;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.O_Type;

/** proper noun + verbal
 * Updated by JCasGen Fri Mar 20 09:14:29 CET 2020
 * @generated */
public class INT_Type extends O_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = INT.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.tweet.INT");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public INT_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    