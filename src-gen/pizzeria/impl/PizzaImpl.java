/**
 */
package pizzeria.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
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
	 * The cached value of the '{@link #getRecette() <em>Recette</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecette()
	 * @generated
	 * @ordered
	 */
	protected Recette recette;

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
	public Recette getRecette() {
		if (recette != null && recette.eIsProxy()) {
			InternalEObject oldRecette = (InternalEObject)recette;
			recette = (Recette)eResolveProxy(oldRecette);
			if (recette != oldRecette) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PizzeriaPackage.PIZZA__RECETTE, oldRecette, recette));
			}
		}
		return recette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recette basicGetRecette() {
		return recette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecette(Recette newRecette) {
		Recette oldRecette = recette;
		recette = newRecette;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.PIZZA__RECETTE, oldRecette, recette));
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
				if (resolve) return getRecette();
				return basicGetRecette();
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
				setRecette((Recette)newValue);
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
				setRecette((Recette)null);
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
				return recette != null;
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
