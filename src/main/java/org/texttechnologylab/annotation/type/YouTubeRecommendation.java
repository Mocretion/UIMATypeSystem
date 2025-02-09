

   
/* Apache UIMA v3 - First created by JCasGen Sun Feb 09 15:30:08 CET 2025 */

package org.texttechnologylab.annotation.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Sun Feb 09 15:30:08 CET 2025
 * XML source: D:/UniCode/Java/UIMATypeSystem/src/main/resources/desc/type/YouTubeRecommendation.xml
 * @generated */
public class YouTubeRecommendation extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.YouTubeRecommendation";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(YouTubeRecommendation.class);
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
   
  public final static String _FeatName_url = "url";
  public final static String _FeatName_ranking = "ranking";
  public final static String _FeatName_agreement = "agreement";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_url = TypeSystemImpl.createCallSite(YouTubeRecommendation.class, "url");
  private final static MethodHandle _FH_url = _FC_url.dynamicInvoker();
  private final static CallSite _FC_ranking = TypeSystemImpl.createCallSite(YouTubeRecommendation.class, "ranking");
  private final static MethodHandle _FH_ranking = _FC_ranking.dynamicInvoker();
  private final static CallSite _FC_agreement = TypeSystemImpl.createCallSite(YouTubeRecommendation.class, "agreement");
  private final static MethodHandle _FH_agreement = _FC_agreement.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected YouTubeRecommendation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public YouTubeRecommendation(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public YouTubeRecommendation(JCas jcas) {
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
  //* Feature: url

  /** getter for url - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUrl() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_url));
  }
    
  /** setter for url - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUrl(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_url), v);
  }    
    
   
    
  //*--------------*
  //* Feature: ranking

  /** getter for ranking - gets 
   * @generated
   * @return value of the feature 
   */
  public int getRanking() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_ranking));
  }
    
  /** setter for ranking - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRanking(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_ranking), v);
  }    
    
   
    
  //*--------------*
  //* Feature: agreement

  /** getter for agreement - gets 
   * @generated
   * @return value of the feature 
   */
  public float getAgreement() { 
    return _getFloatValueNc(wrapGetIntCatchException(_FH_agreement));
  }
    
  /** setter for agreement - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAgreement(float v) {
    _setFloatValueNfc(wrapGetIntCatchException(_FH_agreement), v);
  }    
    
  }

    