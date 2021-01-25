/*
 *  Filename:  ParameterValidator.java
 *  Creation Date:  Jun 27, 2020
 *  Purpose:   
 *  Author:    <a href="mailto:obed.vazquez@gmail.com">Obed Vazquez</a>
 * 
 *  *** Creative Commons Attribution 4.0 International Public License ***
 *  Web Version: https://creativecommons.org/licenses/by/4.0/legalcode
 * 
 * By exercising the Licensed Rights (defined below), You accept and agree to be bound by the terms and conditions of this Creative Commons Attribution 4.0 International Public License ("Public License"). To the extent this Public License may be interpreted as a contract, You are granted the Licensed Rights in consideration of Your acceptance of these terms and conditions, and the Licensor grants You such rights in consideration of benefits the Licensor receives from making the Licensed Material available under these terms and conditions.
 * 
 * Section 1 – Definitions.
 * 
 * Adapted Material means material subject to Copyright and Similar Rights that is derived from or based upon the Licensed Material and in which the Licensed Material is translated, altered, arranged, transformed, or otherwise modified in a manner requiring permission under the Copyright and Similar Rights held by the Licensor. For purposes of this Public License, where the Licensed Material is a musical work, performance, or sound recording, Adapted Material is always produced where the Licensed Material is synched in timed relation with a moving image.
 * Adapter's License means the license You apply to Your Copyright and Similar Rights in Your contributions to Adapted Material in accordance with the terms and conditions of this Public License.
 * Copyright and Similar Rights means copyright and/or similar rights closely related to copyright including, without limitation, performance, broadcast, sound recording, and Sui Generis Database Rights, without regard to how the rights are labeled or categorized. For purposes of this Public License, the rights specified in Section 2(b)(1)-(2) are not Copyright and Similar Rights.
 * Effective Technological Measures means those measures that, in the absence of proper authority, may not be circumvented under laws fulfilling obligations under Article 11 of the WIPO Copyright Treaty adopted on December 20, 1996, and/or similar international agreements.
 * Exceptions and Limitations means fair use, fair dealing, and/or any other exception or limitation to Copyright and Similar Rights that applies to Your use of the Licensed Material.
 * Licensed Material means the artistic or literary work, database, or other material to which the Licensor applied this Public License.
 * Licensed Rights means the rights granted to You subject to the terms and conditions of this Public License, which are limited to all Copyright and Similar Rights that apply to Your use of the Licensed Material and that the Licensor has authority to license.
 * Licensor means the individual(s) or entity(ies) granting rights under this Public License.
 * Share means to provide material to the public by any means or process that requires permission under the Licensed Rights, such as reproduction, public display, public performance, distribution, dissemination, communication, or importation, and to make material available to the public including in ways that members of the public may access the material from a place and at a time individually chosen by them.
 * Sui Generis Database Rights means rights other than copyright resulting from Directive 96/9/EC of the European Parliament and of the Council of 11 March 1996 on the legal protection of databases, as amended and/or succeeded, as well as other essentially equivalent rights anywhere in the world.
 * You means the individual or entity exercising the Licensed Rights under this Public License. Your has a corresponding meaning.
 * Section 2 – Scope.
 * 
 * License grant.
 * Subject to the terms and conditions of this Public License, the Licensor hereby grants You a worldwide, royalty-free, non-sublicensable, non-exclusive, irrevocable license to exercise the Licensed Rights in the Licensed Material to:
 * reproduce and Share the Licensed Material, in whole or in part; and
 * produce, reproduce, and Share Adapted Material.
 * Exceptions and Limitations. For the avoidance of doubt, where Exceptions and Limitations apply to Your use, this Public License does not apply, and You do not need to comply with its terms and conditions.
 * Term. The term of this Public License is specified in Section 6(a).
 * Media and formats; technical modifications allowed. The Licensor authorizes You to exercise the Licensed Rights in all media and formats whether now known or hereafter created, and to make technical modifications necessary to do so. The Licensor waives and/or agrees not to assert any right or authority to forbid You from making technical modifications necessary to exercise the Licensed Rights, including technical modifications necessary to circumvent Effective Technological Measures. For purposes of this Public License, simply making modifications authorized by this Section 2(a)(4) never produces Adapted Material.
 * Downstream recipients.
 * Offer from the Licensor – Licensed Material. Every recipient of the Licensed Material automatically receives an offer from the Licensor to exercise the Licensed Rights under the terms and conditions of this Public License.
 * No downstream restrictions. You may not offer or impose any additional or different terms or conditions on, or apply any Effective Technological Measures to, the Licensed Material if doing so restricts exercise of the Licensed Rights by any recipient of the Licensed Material.
 * No endorsement. Nothing in this Public License constitutes or may be construed as permission to assert or imply that You are, or that Your use of the Licensed Material is, connected with, or sponsored, endorsed, or granted official status by, the Licensor or others designated to receive attribution as provided in Section 3(a)(1)(A)(i).
 * Other rights.
 * 
 * Moral rights, such as the right of integrity, are not licensed under this Public License, nor are publicity, privacy, and/or other similar personality rights; however, to the extent possible, the Licensor waives and/or agrees not to assert any such rights held by the Licensor to the limited extent necessary to allow You to exercise the Licensed Rights, but not otherwise.
 * Patent and trademark rights are not licensed under this Public License.
 * To the extent possible, the Licensor waives any right to collect royalties from You for the exercise of the Licensed Rights, whether directly or through a collecting society under any voluntary or waivable statutory or compulsory licensing scheme. In all other cases the Licensor expressly reserves any right to collect such royalties.
 * Section 3 – License Conditions.
 * 
 * Your exercise of the Licensed Rights is expressly made subject to the following conditions.
 * 
 * Attribution.
 * 
 * If You Share the Licensed Material (including in modified form), You must:
 * 
 * retain the following if it is supplied by the Licensor with the Licensed Material:
 * identification of the creator(s) of the Licensed Material and any others designated to receive attribution, in any reasonable manner requested by the Licensor (including by pseudonym if designated);
 * a copyright notice;
 * a notice that refers to this Public License;
 * a notice that refers to the disclaimer of warranties;
 * a URI or hyperlink to the Licensed Material to the extent reasonably practicable;
 * indicate if You modified the Licensed Material and retain an indication of any previous modifications; and
 * indicate the Licensed Material is licensed under this Public License, and include the text of, or the URI or hyperlink to, this Public License.
 * You may satisfy the conditions in Section 3(a)(1) in any reasonable manner based on the medium, means, and context in which You Share the Licensed Material. For example, it may be reasonable to satisfy the conditions by providing a URI or hyperlink to a resource that includes the required information.
 * If requested by the Licensor, You must remove any of the information required by Section 3(a)(1)(A) to the extent reasonably practicable.
 * If You Share Adapted Material You produce, the Adapter's License You apply must not prevent recipients of the Adapted Material from complying with this Public License.
 * Section 4 – Sui Generis Database Rights.
 * 
 * Where the Licensed Rights include Sui Generis Database Rights that apply to Your use of the Licensed Material:
 * 
 * for the avoidance of doubt, Section 2(a)(1) grants You the right to extract, reuse, reproduce, and Share all or a substantial portion of the contents of the database;
 * if You include all or a substantial portion of the database contents in a database in which You have Sui Generis Database Rights, then the database in which You have Sui Generis Database Rights (but not its individual contents) is Adapted Material; and
 * You must comply with the conditions in Section 3(a) if You Share all or a substantial portion of the contents of the database.
 * For the avoidance of doubt, this Section 4 supplements and does not replace Your obligations under this Public License where the Licensed Rights include other Copyright and Similar Rights.
 * Section 5 – Disclaimer of Warranties and Limitation of Liability.
 * 
 * Unless otherwise separately undertaken by the Licensor, to the extent possible, the Licensor offers the Licensed Material as-is and as-available, and makes no representations or warranties of any kind concerning the Licensed Material, whether express, implied, statutory, or other. This includes, without limitation, warranties of title, merchantability, fitness for a particular purpose, non-infringement, absence of latent or other defects, accuracy, or the presence or absence of errors, whether or not known or discoverable. Where disclaimers of warranties are not allowed in full or in part, this disclaimer may not apply to You.
 * To the extent possible, in no event will the Licensor be liable to You on any legal theory (including, without limitation, negligence) or otherwise for any direct, special, indirect, incidental, consequential, punitive, exemplary, or other losses, costs, expenses, or damages arising out of this Public License or use of the Licensed Material, even if the Licensor has been advised of the possibility of such losses, costs, expenses, or damages. Where a limitation of liability is not allowed in full or in part, this limitation may not apply to You.
 * The disclaimer of warranties and limitation of liability provided above shall be interpreted in a manner that, to the extent possible, most closely approximates an absolute disclaimer and waiver of all liability.
 * Section 6 – Term and Termination.
 * 
 * This Public License applies for the term of the Copyright and Similar Rights licensed here. However, if You fail to comply with this Public License, then Your rights under this Public License terminate automatically.
 * Where Your right to use the Licensed Material has terminated under Section 6(a), it reinstates:
 * 
 * automatically as of the date the violation is cured, provided it is cured within 30 days of Your discovery of the violation; or
 * upon express reinstatement by the Licensor.
 * For the avoidance of doubt, this Section 6(b) does not affect any right the Licensor may have to seek remedies for Your violations of this Public License.
 * For the avoidance of doubt, the Licensor may also offer the Licensed Material under separate terms or conditions or stop distributing the Licensed Material at any time; however, doing so will not terminate this Public License.
 * Sections 1, 5, 6, 7, and 8 survive termination of this Public License.
 * Section 7 – Other Terms and Conditions.
 * 
 * The Licensor shall not be bound by any additional or different terms or conditions communicated by You unless expressly agreed.
 * Any arrangements, understandings, or agreements regarding the Licensed Material not stated herein are separate from and independent of the terms and conditions of this Public License.
 * Section 8 – Interpretation.
 * 
 * For the avoidance of doubt, this Public License does not, and shall not be interpreted to, reduce, limit, restrict, or impose conditions on any use of the Licensed Material that could lawfully be made without permission under this Public License.
 * To the extent possible, if any provision of this Public License is deemed unenforceable, it shall be automatically reformed to the minimum extent necessary to make it enforceable. If the provision cannot be reformed, it shall be severed from this Public License without affecting the enforceability of the remaining terms and conditions.
 * No term or condition of this Public License will be waived and no failure to comply consented to unless expressly agreed to by the Licensor.
 * Nothing in this Public License constitutes or may be interpreted as a limitation upon, or waiver of, any privileges and immunities that apply to the Licensor or You, including from the legal processes of any jurisdiction or authority.
 * Creative Commons is not a party to its public licenses. Notwithstanding, Creative Commons may elect to apply one of its public licenses to material it publishes and in those instances will be considered the “Licensor.” The text of the Creative Commons public licenses is dedicated to the public domain under the CC0 Public Domain Dedication. Except for the limited purpose of indicating that material is shared under a Creative Commons public license or as otherwise permitted by the Creative Commons policies published at creativecommons.org/policies, Creative Commons does not authorize the use of the trademark “Creative Commons” or any other trademark or logo of Creative Commons without its prior written consent including, without limitation, in connection with any unauthorized modifications to any of its public licenses or any other arrangements, understandings, or agreements concerning use of licensed material. For the avoidance of doubt, this paragraph does not form part of the public licenses.
 * 
 * Creative Commons may be contacted at creativecommons.org.
 */
package org.white_sdev.white_validations.parameters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import lombok.extern.slf4j.Slf4j;
import org.white_sdev.white_validations.exceptions.White_ValidationsException;
import org.white_sdev.white_validations.exceptions.White_ValidationsIllegalArgumentException;

/**
 * This is the main class of the library providing validation for the parameters in external code.
 * The caller can just import all the validations on to its classes with a static import and use them as local. 
 * For example:<br>
 * <pre>
 *	void myMethod(String myParam){<br>
 *	    notNullValidation(myParam,"This parameter must not be null because is vital to complete my process");<br>
 *	    //My process definition<br>
 *	}<br>
 * </pre>
 * @author <a href="mailto:obed.vazquez@gmail.com">Obed Vazquez</a>
 * @since Jun 27, 2020
 */
@Slf4j
public class ParameterValidator {
    
    //<editor-fold defaultstate="collapsed" desc="notNullValidation Methods">
    
    //<editor-fold defaultstate="collapsed" desc="no Message,No exception Class">
    
    /**
     * Validates that the given array of {@link Object} parameters and checks if the instance or the elements inside are not null.
     * If the any of the parameters or the object itself is null will throw an {@link IllegalArgumentException} using the 
     * defaulted message: "The provided parameter should not be {@code null}, make sure it is initialized before the call."
     * intended for the second hand caller (the code that is calling the method calling this one).
     * This method uses the {@link #notNullValidation(java.lang.String, java.lang.Class, java.util.Collection)} element for the validation.
     * 
     * @author <a href='mailto:obed.vazquez@gmail.com'>Obed Vazquez</a>
     * @since 2020-07-15
     * @param parameters array of {@link Object objects} to validate whether it is or have any null values or not.
     * @throws IllegalArgumentException - if the provided parameter is null and the class {@code T} is not provided.
     */
    public static void notNullValidation(Object...parameters) {
	log.trace("::notNullValidation(parameters) - Start: Bridging");
	ArrayList<Object> parameterList=null;
	try{
	    parameterList=new ArrayList<>();
	    parameterList.addAll(Arrays.asList(parameters));
	}catch(Exception ex){
	    throw new White_ValidationsException("Impossible transform the given parameters into a List due to an unexpected internal error. Please report this exception.", ex);
	}
	notNullValidation((String)null,(Class<RuntimeException>)null,parameterList);
	log.trace("::notNullValidation(parameters) - Finish: Bridged");
    }
    
    /**
     * Validates that the given {@link Collection} of parameters  and checks if the element or the elements inside are not null.
     * If the any of the parameters or the object itself is null will throw an {@link IllegalArgumentException} using the 
     * defaulted message: "The provided parameter should not be {@code null}, make sure it is initialized before the call."
     * intended for the second hand caller (the code that is calling the method calling this one).
     * This method uses the {@link #notNullValidation(java.lang.String, java.lang.Class, java.util.Collection)} element for the validation.
     * 
     * @author <a href='mailto:obed.vazquez@gmail.com'>Obed Vazquez</a>
     * @since 2020-07-15
     * @param parameters {@link Collection} of {@link Object objects} to validate whether it is or have any {@code null} values or not.
     * @throws IllegalArgumentException - if the provided parameter is {@code null}.
     */
    public static void notNullValidation(Collection<Object> parameters) {
	log.trace("::notNullValidation(Collection<Object>) - Start: Bridging");
	notNullValidation((String)null,null,parameters);
	log.trace("::notNullValidation(Collection<Object>) - Finish: Bridged");
    }
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="No exception Class">
    
    /**
     * Validates that the given array of {@link Object} parameters and checks if the instance or the elements inside are not null.
     * If the any of the parameters or the object itself is null will throw an {@link IllegalArgumentException} 
     * intended for the second hand caller (the code that is calling the method calling this one).
     * This method uses the {@link #notNullValidation(java.lang.String, java.lang.Class, java.util.Collection)} element for the validation.
     * 
     * @author <a href='mailto:obed.vazquez@gmail.com'>Obed Vazquez</a>
     * @since 2020-07-15
     * @param parameters array of {@link Object objects} to validate whether it is or have any null values or not.
     * @param errorMessage {@link String message} to add to the exception as a description in case the parameter is in fact null. 
     *			    If this is null the defaulted message will be used: "The provided parameter should not be null, make sure it is initialized before the call."
     * @throws IllegalArgumentException - if the provided parameter is null and the class {@code T} is not provided.
     */
    public static void notNullValidation(String errorMessage,Object...parameters) {
	log.trace("::notNullValidation(parameters, errorMessage) - Start: Bridged");
	ArrayList<Object> parameterList=null;
	try{
	    parameterList=new ArrayList<>();
	    parameterList.addAll(Arrays.asList(parameters));
	}catch(Exception ex){
	    throw new White_ValidationsException("Impossible transform the given parameters into a List due to an unexpected internal error. Please report this exception.", ex);
	}
	notNullValidation(errorMessage, (Class<RuntimeException>) null,parameterList);
	log.trace("::notNullValidation(parameters, errorMessage) - Finish: Bridged");
        
    }
    
    /**
     * Validates that the given {@link Collection} of parameters  and checks if the element or the elements inside are not null.
     * If the any of the parameters or the object itself is null will throw an {@link IllegalArgumentException} 
     * intended for the second hand caller (the code that is calling the method calling this one).
     * This method uses the {@link #notNullValidation(java.lang.String, java.lang.Class, java.util.Collection)} element for the validation.
     * 
     * @author <a href='mailto:obed.vazquez@gmail.com'>Obed Vazquez</a>
     * @since 2020-07-15
     * @param parameters {@link Collection} of {@link Object objects} to validate whether it is or have any {@code null} values or not.
     * @param errorMessage {@link String message} to add to the exception as a description in case the parameter is in fact {@code null}. 
     *			    If this is {@code null} the defaulted message will be used: "The provided parameter should not be {@code null}, make sure it is initialized before the call."
     * @throws IllegalArgumentException - if the provided parameter is {@code null}.
     */
    public static void notNullValidation(String errorMessage,Collection<Object> parameters) {
	log.trace("::notNullValidation(Collection<Object>,String) - Start: Bridging");
	notNullValidation(errorMessage,null,parameters);
	log.trace("::notNullValidation(Collection<Object>,String) - Finish: Bridged");
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="full parameters">
    
    /**
     * Validates that the given {@link Object} and checks if the instance is not {@code null}.If the object itself is {@code null} will throw an {@link IllegalArgumentException} embedded on the given 
    {@link T exception} {@link Class clazz} intended for the second hand caller (the code that is calling the method calling this one).
     * This method uses the {@link #notNullValidation(java.lang.String, java.lang.Class, java.util.Collection)} element for the validation.
     * 
     * @author <a href='mailto:obed.vazquez@gmail.com'>Obed Vazquez</a>
     * @since 2020-07-15
     * @param parameters    {@code varargs} of {@link Object objects} to validate whether it is or have any {@code null} values or not.
     * @param errorMessage  {@link String message} to add to the exception as a description in case the parameter is in fact {@code null}. 
     *			    If this is {@code null} the defaulted message will be used: "The provided parameter should not be {@code null}, make sure it is initialized before the call."
     * @param exceptionClazz A custom {@link RuntimeException} configured by the user/caller to wrap the exception under it. The method uses Generics for this purpose;
     *			    in case this is {@code null} a simple {@link IllegalArgumentException} will be used instead.
     * @param <T> The {@link Class} of the parameter to wrap the {@link IllegalArgumentException} under in case it is thrown.
     * @throws IllegalArgumentException - if the provided parameter is {@code null} and the class {@code T} is not provided.
     * @throws T if provided and the parameter is {@code null}.
     */
    public static <T extends RuntimeException> void notNullValidation(String errorMessage,Class<T> exceptionClazz,Object...parameters) {
	log.trace("::notNullValidation(errorMessage,exceptionClazz,...parameters) - Start:");
	ArrayList<Object> parametersList=null;
	
	if(exceptionClazz==null){
	    log.warn("::notNullValidation(errorMessage,exceptionClazz,...parameters): Java did not recognize correctly the first parameter. "
		+ "White_Validations is assuming the first parameter is null and a Custom Exception Class was not provided for this validation, "
		+ "redirecting to the correct method");
	    ArrayList<Object> parameterList=null;
	    try{
		parameterList=new ArrayList<Object>(){{add(exceptionClazz);}};
		parameterList.addAll(Arrays.asList(parameters));
		if(parameterList==null)
		    throw new White_ValidationsException("Unable to combine parameters with null Exception Class");
	    }catch(Exception e){
		throw new White_ValidationsException("Impossible transform the given parameters into a List due to an unexpected internal error. Please report this exception.", e);
	    }
	    notNullValidation(errorMessage, (Class<RuntimeException>) null,parameterList);
	}
	
	try{
	    
	    log.trace("::notNullValidation(errorMessage,exceptionClazz,...parameters): Bridging");
	    parametersList=parameters!=null?new ArrayList<>(Arrays.asList(parameters)):null;
	    
	    log.trace("::notNullValidation(parameter,errorMessage,exceptionClazz) - Finish: Bridging");
	} catch (Exception e) {
	    throw new White_ValidationsException("Impossible transform the given parameters into a List due to an unexpected internal error. Please report this exception.", e);
        }
	notNullValidation(errorMessage,exceptionClazz,parametersList);
    }
    
    /**
     * Validates that the given {@link Collection} of parameters  and checks if the element or the elements inside are not {@code null}.
     * If the any of the parameters or the object itself is {@code null} will throw an {@link IllegalArgumentException} 
     * embedded on the given {@link T exception} {@link Class clazz}. Core method of the series intended for the second hand caller 
     * (the code that is calling the method calling this one).
     * 
     * @author <a href='mailto:obed.vazquez@gmail.com'>Obed Vazquez</a>
     * @since 2020-07-15
     * @param parameters {@link Collection} of {@link Object objects} to validate whether it is or have any {@code null} values or not.
     * @param errorMessage {@link String message} to add to the exception as a description in case the parameter is in fact {@code null}. 
     *			    If this is {@code null} the defaulted message will be used: "The provided parameter should not be {@code null}, make sure it is initialized before the call."
     * @param exceptionClazz A custom {@link RuntimeException} configured by the user/caller to wrap the exception under it. The method uses Generics for this purpose;
     *			    in case this is {@code null} a simple {@link IllegalArgumentException} will be used instead.
     * @param <T> The {@link Class} of the parameter to wrap the {@link IllegalArgumentException} under in case it is thrown.
     * @throws IllegalArgumentException - if the provided parameter is {@code null} and the class {@code T} is not provided.
     * @throws T if provided and the parameter is {@code null}.
     */
    public static <T extends RuntimeException> void notNullValidation(String errorMessage,Class<T> exceptionClazz,Collection<Object> parameters) {
	if ( parameters==null || parameters.size()<1 ) throw new White_ValidationsIllegalArgumentException("The provided parameters to validate should not be null, "
		+ "please provide at least 1 parameter to validate if they are null.");
	try{
	    log.trace("::notNullValidation(Collection<Object>,String ,Class<T>) - Start: ");
	    if (errorMessage==null) errorMessage="The provided parameter(s) should not be null, make sure the provided parameter(s) is/are initialized before calling this method.";
	    //The scenario where the ExceptionClass is null is managed inside the for loop
	    
	    for(Object parameter:parameters)
		if ( parameter==null ) 
		    throw exceptionClazz==null?
			    new IllegalArgumentException(errorMessage):
			    SimpleValidationUtils.createException(errorMessage, new IllegalArgumentException(errorMessage), exceptionClazz); 
		
	    
	    
	    log.trace("::notNullValidation(Collection<Object>,String ,Class<T>) - Finish: Not nulls found");
	} catch (IllegalArgumentException e) {
	    log.trace("::notNullValidation(Collection<Object>,String ,Class<T>) - Finish: ");
	    throw e;
        } catch (Exception e) {
	    log.debug("::notNullValidation(Collection<Object>,String ,Class<T>) - Exception: "+e);
            if(e instanceof White_ValidationsException || e instanceof White_ValidationsIllegalArgumentException){
	      throw new White_ValidationsException("Impossible to validate the parameter(s) collection due to an unexpected internal error.", e);
	    }  
	    throw e;
        }
    }
    //</editor-fold>
    
    //</editor-fold>
   
}