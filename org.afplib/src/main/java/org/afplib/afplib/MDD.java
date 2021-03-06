/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MDD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.MDD#getXmBase <em>Xm Base</em>}</li>
 *   <li>{@link org.afplib.afplib.MDD#getYmBase <em>Ym Base</em>}</li>
 *   <li>{@link org.afplib.afplib.MDD#getXmUnits <em>Xm Units</em>}</li>
 *   <li>{@link org.afplib.afplib.MDD#getYmUnits <em>Ym Units</em>}</li>
 *   <li>{@link org.afplib.afplib.MDD#getXmSize <em>Xm Size</em>}</li>
 *   <li>{@link org.afplib.afplib.MDD#getYmSize <em>Ym Size</em>}</li>
 *   <li>{@link org.afplib.afplib.MDD#getMDDFlgs <em>MDD Flgs</em>}</li>
 *   <li>{@link org.afplib.afplib.MDD#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getMDD()
 * @model
 * @generated
 */
public interface MDD extends SF {
	/**
     * Returns the value of the '<em><b>Xm Base</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xm Base</em>' attribute.
     * @see #setXmBase(Integer)
     * @see org.afplib.afplib.AfplibPackage#getMDD_XmBase()
     * @model required="true"
     * @generated
     */
	Integer getXmBase();

	/**
     * Sets the value of the '{@link org.afplib.afplib.MDD#getXmBase <em>Xm Base</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xm Base</em>' attribute.
     * @see #getXmBase()
     * @generated
     */
	void setXmBase(Integer value);

	/**
     * Returns the value of the '<em><b>Ym Base</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ym Base</em>' attribute.
     * @see #setYmBase(Integer)
     * @see org.afplib.afplib.AfplibPackage#getMDD_YmBase()
     * @model required="true"
     * @generated
     */
	Integer getYmBase();

	/**
     * Sets the value of the '{@link org.afplib.afplib.MDD#getYmBase <em>Ym Base</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ym Base</em>' attribute.
     * @see #getYmBase()
     * @generated
     */
	void setYmBase(Integer value);

	/**
     * Returns the value of the '<em><b>Xm Units</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xm Units</em>' attribute.
     * @see #setXmUnits(Integer)
     * @see org.afplib.afplib.AfplibPackage#getMDD_XmUnits()
     * @model required="true"
     * @generated
     */
	Integer getXmUnits();

	/**
     * Sets the value of the '{@link org.afplib.afplib.MDD#getXmUnits <em>Xm Units</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xm Units</em>' attribute.
     * @see #getXmUnits()
     * @generated
     */
	void setXmUnits(Integer value);

	/**
     * Returns the value of the '<em><b>Ym Units</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ym Units</em>' attribute.
     * @see #setYmUnits(Integer)
     * @see org.afplib.afplib.AfplibPackage#getMDD_YmUnits()
     * @model required="true"
     * @generated
     */
	Integer getYmUnits();

	/**
     * Sets the value of the '{@link org.afplib.afplib.MDD#getYmUnits <em>Ym Units</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ym Units</em>' attribute.
     * @see #getYmUnits()
     * @generated
     */
	void setYmUnits(Integer value);

	/**
     * Returns the value of the '<em><b>Xm Size</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xm Size</em>' attribute.
     * @see #setXmSize(Integer)
     * @see org.afplib.afplib.AfplibPackage#getMDD_XmSize()
     * @model required="true"
     * @generated
     */
	Integer getXmSize();

	/**
     * Sets the value of the '{@link org.afplib.afplib.MDD#getXmSize <em>Xm Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xm Size</em>' attribute.
     * @see #getXmSize()
     * @generated
     */
	void setXmSize(Integer value);

	/**
     * Returns the value of the '<em><b>Ym Size</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ym Size</em>' attribute.
     * @see #setYmSize(Integer)
     * @see org.afplib.afplib.AfplibPackage#getMDD_YmSize()
     * @model required="true"
     * @generated
     */
	Integer getYmSize();

	/**
     * Sets the value of the '{@link org.afplib.afplib.MDD#getYmSize <em>Ym Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ym Size</em>' attribute.
     * @see #getYmSize()
     * @generated
     */
	void setYmSize(Integer value);

	/**
     * Returns the value of the '<em><b>MDD Flgs</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>MDD Flgs</em>' attribute.
     * @see #setMDDFlgs(Integer)
     * @see org.afplib.afplib.AfplibPackage#getMDD_MDDFlgs()
     * @model required="true"
     * @generated
     */
	Integer getMDDFlgs();

	/**
     * Sets the value of the '{@link org.afplib.afplib.MDD#getMDDFlgs <em>MDD Flgs</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>MDD Flgs</em>' attribute.
     * @see #getMDDFlgs()
     * @generated
     */
	void setMDDFlgs(Integer value);

	/**
     * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
     * The list contents are of type {@link org.afplib.base.Triplet}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Triplets</em>' containment reference list.
     * @see org.afplib.afplib.AfplibPackage#getMDD_Triplets()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
	EList<Triplet> getTriplets();

} // MDD
