

   
/* Apache UIMA v3 - First created by JCasGen Thu May 16 17:29:53 CEST 2024 */

package org.texttechnologylab.annotation.type;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.*;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;




/**
 * Updated by JCasGen Thu May 16 17:29:53 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class AudioToken extends MultimediaElement {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.AudioToken";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AudioToken.class);
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
   
  public final static String _FeatName_value = "value";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_value = TypeSystemImpl.createCallSite(AudioToken.class, "value");
  private final static MethodHandle _FH_value = _FC_value.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected AudioToken() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public AudioToken(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AudioToken(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AudioToken(JCas jcas, int begin, int end) {
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
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_value));
  }
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_value), v);
  }

  public byte[] getCoveredMultimedia(String encodedBase64Audio){

    byte[] result = null;
    AudioInputStream inputStream = null;
    AudioInputStream cutStream = null;
    try {
      byte[] audioData = org.apache.commons.codec.binary.Base64.decodeBase64(encodedBase64Audio);

      InputStream targetStream = new ByteArrayInputStream(audioData);
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(targetStream);

      AudioFileFormat fileFormat = AudioSystem.getAudioFileFormat(audioStream);
      AudioFormat audioFormat = fileFormat.getFormat();

      inputStream = AudioSystem.getAudioInputStream(audioStream);

      float bytesPerSecond = audioFormat.getFrameRate() * audioFormat.getFrameSize();

      inputStream.skip((int)(getTimeStart() * bytesPerSecond));

      long audioFramesToCopy = (int)Math.ceil((getTimeEnd() - getTimeStart()) * audioFormat.getFrameRate());

      cutStream = new AudioInputStream(inputStream, audioFormat, audioFramesToCopy);

      ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
      AudioSystem.write(cutStream, fileFormat.getType(), byteOutput);
      result = byteOutput.toByteArray();

    } catch (Exception e) {
      e.printStackTrace();
    }


    if (inputStream != null)
      try {
        inputStream.close();
      } catch (Exception e) {
        e.printStackTrace();
      }

    if (cutStream != null)
      try {
        cutStream.close();
      } catch (Exception e) {
        e.printStackTrace();
      }

    return result;}

  }

    