/**
 */
package pizzeria.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import pizzeria.Pizza;
import pizzeria.PizzeriaPackage;
import pizzeria.Recette;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pizza</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pizzeria.impl.PizzaImpl#isPateMoelleuse <em>Pate Moelleuse</em>}</li>
 *   <li>{@link pizzeria.impl.PizzaImpl#getRecette <em>Recette</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PizzaImpl extends MinimalEObjectImpl.Container implements Pizza {
	/**
	 * The default value of the '{@link #isPateMoelleuse() <em>Pate Moelleuse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPateMoelleuse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PATE_MOELLEUSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPateMoelleuse() <em>Pate Moelleuse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPateMoelleuse()
	 * @generated
	 * @ordered
	 */
	protected boolean pateMoelleuse = PATE_MOELLEUSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecette() <em>Recette</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecette()
	 * @generated
	 * @ordered
	 */
	protected EList<Recette> recette;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PizzaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PizzeriaPackage.Literals.PIZZA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPateMoelleuse() {
		return pateMoelleuse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPateMoelleuse(boolean newPateMoelleuse) {
		boolean oldPateMoelleuse = pateMoelleuse;
		pateMoelleuse = newPateMoelleuse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.PIZZA__PATE_MOELLEUSE, oldPateMoelleuse, pateMoelleuse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Recette> getRecette() {
		if (recette == null) {
			recette = new EObjectContainmentEList<Recette>(Recette.class, this, PizzeriaPackage.PIZZA__RECETTE);
		}
		return recette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PizzeriaPackage.PIZZA__RECETTE:
				return ((InternalEList<?>)getRecette()).basicRemove(otherEnd, msgs);
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
			case PizzeriaPackage.PIZZA__PATE_MOELLEUSE:
				return isPateMoelleuse();
			case PizzeriaPackage.PIZZA__RECETTE:
				return getRecette();
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
			case PizzeriaPackage.PIZZA__PATE_MOELLEUSE:
				setPateMoelleuse((Boolean)newValue);
				return;
			case PizzeriaPackage.PIZZA__RECETTE:
				getRecette().clear();
				getRecette().addAll((Collection<? extends Recette>)newValue);
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
			case PizzeriaPackage.PIZZA__PATE_MOELLEUSE:
				setPateMoelleuse(PATE_MOELLEUSE_EDEFAULT);
				return;
			case PizzeriaPackage.PIZZA__RECETTE:
				getRecette().clear();
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
			case PizzeriaPackage.PIZZA__PATE_MOELLEUSE:
				return pateMoelleuse != PATE_MOELLEUSE_EDEFAULT;
			case PizzeriaPackage.PIZZA__RECETTE:
				return recette != null && !recette.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (pateMoelleuse: ");
		result.append(pateMoelleuse);
		result.append(')');
		return result.toString();
	}

} //PizzaImpl
