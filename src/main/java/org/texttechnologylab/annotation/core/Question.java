

   
/* Apache UIMA v3 - First created by JCasGen Tue Feb 27 21:02:41 CET 2024 */

package org.texttechnologylab.annotation.core;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** Generic Question type
 * Updated by JCasGen Tue Feb 27 21:02:41 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Question extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.core.Question";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
   
  public final static String _FeatName_key = "key";
  public final static String _FeatName_description = "description";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_key = TypeSystemImpl.createCallSite(Question.class, "key");
  private final static MethodHandle _FH_key = _FC_key.dynamicInvoker();
  private final static CallSite _FC_description = TypeSystemImpl.createCallSite(Question.class, "description");
  private final static MethodHandle _FH_description = _FC_description.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Question(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Question(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
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
  //* Feature: key

  /** getter for key - gets 
   * @generated
   * @return value of the feature 
   */
  public String getKey() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_key));
  }
    
  /** setter for key - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setKey(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_key), v);
  }    
    
   
    
  //*--------------*
  //* Feature: description

  /** getter for description - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDescription() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_description));
  }
    
  /** setter for description - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDescription(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_description), v);
  }    
    
  }

    