

   
/* Apache UIMA v3 - First created by JCasGen Fri Feb 07 15:41:08 CET 2025 */

package org.texttechnologylab.annotation.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.uima.type.Embedding;


/** 
 * Updated by JCasGen Fri Feb 07 15:41:08 CET 2025
 * XML source: D:/UniCode/Java/UIMATypeSystem/src/main/resources/desc/type/SourceEmbedding.xml
 * @generated */
public class SourceEmbedding extends Embedding {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.SourceEmbedding";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SourceEmbedding.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_source = "source";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_source = TypeSystemImpl.createCallSite(SourceEmbedding.class, "source");
  private final static MethodHandle _FH_source = _FC_source.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected SourceEmbedding() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public SourceEmbedding(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SourceEmbedding(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSource() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_source));
  }
    
  /** setter for source - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_source), v);
  }    
    
  }

    