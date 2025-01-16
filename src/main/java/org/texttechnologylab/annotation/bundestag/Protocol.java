

   
/* Apache UIMA v3 - First created by JCasGen Thu Jan 16 20:47:10 CET 2025 */

package org.texttechnologylab.annotation.bundestag;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Thu Jan 16 20:47:10 CET 2025
 * XML source: D:/UniCode/Java/UIMATypeSystem/src/main/resources/desc/type/BundestagProtocol.xml
 * @generated */
public class Protocol extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.bundestag.Protocol";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Protocol.class);
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
   
  public final static String _FeatName_agendas = "agendas";
  public final static String _FeatName_electionPeriod = "electionPeriod";
  public final static String _FeatName_sessionNumber = "sessionNumber";
  public final static String _FeatName_date = "date";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_agendas = TypeSystemImpl.createCallSite(Protocol.class, "agendas");
  private final static MethodHandle _FH_agendas = _FC_agendas.dynamicInvoker();
  private final static CallSite _FC_electionPeriod = TypeSystemImpl.createCallSite(Protocol.class, "electionPeriod");
  private final static MethodHandle _FH_electionPeriod = _FC_electionPeriod.dynamicInvoker();
  private final static CallSite _FC_sessionNumber = TypeSystemImpl.createCallSite(Protocol.class, "sessionNumber");
  private final static MethodHandle _FH_sessionNumber = _FC_sessionNumber.dynamicInvoker();
  private final static CallSite _FC_date = TypeSystemImpl.createCallSite(Protocol.class, "date");
  private final static MethodHandle _FH_date = _FC_date.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Protocol() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Protocol(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Protocol(JCas jcas) {
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
  //* Feature: agendas

  /** getter for agendas - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<Agenda> getAgendas() { 
    return (FSArray<Agenda>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_agendas)));
  }
    
  /** setter for agendas - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAgendas(FSArray<Agenda> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_agendas), v);
  }    
    
    
  /** indexed getter for agendas - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public Agenda getAgendas(int i) {
     return (Agenda)(((FSArray<Agenda>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_agendas)))).get(i));
  } 

  /** indexed setter for agendas - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setAgendas(int i, Agenda v) {
    ((FSArray<Agenda>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_agendas)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: electionPeriod

  /** getter for electionPeriod - gets 
   * @generated
   * @return value of the feature 
   */
  public int getElectionPeriod() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_electionPeriod));
  }
    
  /** setter for electionPeriod - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setElectionPeriod(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_electionPeriod), v);
  }    
    
   
    
  //*--------------*
  //* Feature: sessionNumber

  /** getter for sessionNumber - gets 
   * @generated
   * @return value of the feature 
   */
  public int getSessionNumber() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_sessionNumber));
  }
    
  /** setter for sessionNumber - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSessionNumber(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_sessionNumber), v);
  }    
    
   
    
  //*--------------*
  //* Feature: date

  /** getter for date - gets 
   * @generated
   * @return value of the feature 
   */
  public double getDate() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_date));
  }
    
  /** setter for date - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDate(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_date), v);
  }    
    
  }

    