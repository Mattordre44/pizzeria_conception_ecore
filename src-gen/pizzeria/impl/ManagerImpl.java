/**
 */
package pizzeria.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pizzeria.Employe;
import pizzeria.Manager;
import pizzeria.PizzeriaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pizzeria.impl.ManagerImpl#getEmploye <em>Employe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManagerImpl extends EmployeImpl implements Manager {
	/**
	 * The cached value of the '{@link #getEmploye() <em>Employe</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploye()
	 * @generated
	 * @ordered
	 */
	protected EList<Employe> employe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PizzeriaPackage.Literals.MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employe> getEmploye() {
		if (employe == null) {
			employe = new EObjectWithInverseResolvingEList<Employe>(Employe.class, this,
					PizzeriaPackage.MANAGER__EMPLOYE, PizzeriaPackage.EMPLOYE__MANAGER);
		}
		return employe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PizzeriaPackage.MANAGER__EMPLOYE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEmploye()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PizzeriaPackage.MANAGER__EMPLOYE:
			return ((InternalEList<?>) getEmploye()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PizzeriaPackage.MANAGER__EMPLOYE:
			return getEmploye();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PizzeriaPackage.MANAGER__EMPLOYE:
			getEmploye().clear();
			getEmploye().addAll((Collection<? extends Employe>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PizzeriaPackage.MANAGER__EMPLOYE:
			getEmploye().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PizzeriaPackage.MANAGER__EMPLOYE:
			return employe != null && !employe.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ManagerImpl
