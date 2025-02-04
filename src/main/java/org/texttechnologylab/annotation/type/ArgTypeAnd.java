

   
/* Apache UIMA v3 - First created by JCasGen Thu May 16 17:29:53 CEST 2024 */

package org.texttechnologylab.annotation.type;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.FSArray;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;


/**
 * Updated by JCasGen Thu May 16 17:29:53 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class ArgTypeAnd extends ArgType {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.ArgTypeAnd";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ArgTypeAnd.class);
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
   
  public final static String _FeatName_data2 = "data2";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_data2 = TypeSystemImpl.createCallSite(ArgTypeAnd.class, "data2");
  private final static MethodHandle _FH_data2 = _FC_data2.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected ArgTypeAnd() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public ArgTypeAnd(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ArgTypeAnd(JCas jcas) {
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
  //* Feature: data2

  /** getter for data2 - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<ArgTextSegment> getData2() { 
    return (FSArray<ArgTextSegment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_data2)));
  }
    
  /** setter for data2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setData2(FSArray<ArgTextSegment> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_data2), v);
  }    
    
    
  /** indexed getter for data2 - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public ArgTextSegment getData2(int i) {
     return (ArgTextSegment)(((FSArray<ArgTextSegment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_data2)))).get(i));
  } 

  /** indexed setter for data2 - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setData2(int i, ArgTextSegment v) {
    ((FSArray<ArgTextSegment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_data2)))).set(i, v);
  }  
  }

    