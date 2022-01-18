/**
 */
package pizzeria.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pizzeria.Ingredient;
import pizzeria.PizzeriaPackage;
import pizzeria.Recette;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recette</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pizzeria.impl.RecetteImpl#getDuree <em>Duree</em>}</li>
 *   <li>{@link pizzeria.impl.RecetteImpl#getIngredient <em>Ingredient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecetteImpl extends MinimalEObjectImpl.Container implements Recette {
	/**
	 * The default value of the '{@link #getDuree() <em>Duree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuree()
	 * @generated
	 * @ordered
	 */
	protected static final String DUREE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuree() <em>Duree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuree()
	 * @generated
	 * @ordered
	 */
	protected String duree = DUREE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIngredient() <em>Ingredient</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredient()
	 * @generated
	 * @ordered
	 */
	protected EList<Ingredient> ingredient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecetteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PizzeriaPackage.Literals.RECETTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuree() {
		return duree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuree(String newDuree) {
		String oldDuree = duree;
		duree = newDuree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.RECETTE__DUREE, oldDuree, duree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ingredient> getIngredient() {
		if (ingredient == null) {
			ingredient = new EObjectResolvingEList<Ingredient>(Ingredient.class, this,
					PizzeriaPackage.RECETTE__INGREDIENT);
		}
		return ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PizzeriaPackage.RECETTE__DUREE:
			return getDuree();
		case PizzeriaPackage.RECETTE__INGREDIENT:
			return getIngredient();
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
		case PizzeriaPackage.RECETTE__DUREE:
			setDuree((String) newValue);
			return;
		case PizzeriaPackage.RECETTE__INGREDIENT:
			getIngredient().clear();
			getIngredient().addAll((Collection<? extends Ingredient>) newValue);
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
		case PizzeriaPackage.RECETTE__DUREE:
			setDuree(DUREE_EDEFAULT);
			return;
		case PizzeriaPackage.RECETTE__INGREDIENT:
			getIngredient().clear();
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
		case PizzeriaPackage.RECETTE__DUREE:
			return DUREE_EDEFAULT == null ? duree != null : !DUREE_EDEFAULT.equals(duree);
		case PizzeriaPackage.RECETTE__INGREDIENT:
			return ingredient != null && !ingredient.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (duree: ");
		result.append(duree);
		result.append(')');
		return result.toString();
	}

} //RecetteImpl
