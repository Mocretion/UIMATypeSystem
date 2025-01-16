

   
/* Apache UIMA v3 - First created by JCasGen Thu Jan 16 21:08:43 CET 2025 */

package org.texttechnologylab.annotation.bundestag;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Thu Jan 16 21:08:43 CET 2025
 * XML source: D:/UniCode/Java/UIMATypeSystem/src/main/resources/desc/type/BundestagProtocol.xml
 * @generated */
public class Agenda extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.bundestag.Agenda";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Agenda.class);
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
   
  public final static String _FeatName_title = "title";
  public final static String _FeatName_index = "index";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_title = TypeSystemImpl.createCallSite(Agenda.class, "title");
  private final static MethodHandle _FH_title = _FC_title.dynamicInvoker();
  private final static CallSite _FC_index = TypeSystemImpl.createCallSite(Agenda.class, "index");
  private final static MethodHandle _FH_index = _FC_index.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Agenda() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Agenda(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Agenda(JCas jcas) {
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
  //* Feature: title

  /** getter for title - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTitle() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_title));
  }
    
  /** setter for title - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTitle(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_title), v);
  }    
    
   
    
  //*--------------*
  //* Feature: index

  /** getter for index - gets 
   * @generated
   * @return value of the feature 
   */
  public int getIndex() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_index));
  }
    
  /** setter for index - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIndex(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_index), v);
  }    
    
  }

    