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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import pizzeria.Commande;
import pizzeria.Livreur;
import pizzeria.PizzeriaPackage;
import pizzeria.Vehicule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Livreur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pizzeria.impl.LivreurImpl#getCommande <em>Commande</em>}</li>
 *   <li>{@link pizzeria.impl.LivreurImpl#getVehicule <em>Vehicule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LivreurImpl extends EmployeImpl implements Livreur {
	/**
	 * The cached value of the '{@link #getCommande() <em>Commande</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommande()
	 * @generated
	 * @ordered
	 */
	protected EList<Commande> commande;
	/**
	 * The cached value of the '{@link #getVehicule() <em>Vehicule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicule()
	 * @generated
	 * @ordered
	 */
	protected Vehicule vehicule;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LivreurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PizzeriaPackage.Literals.LIVREUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Commande> getCommande() {
		if (commande == null) {
			commande = new EObjectWithInverseResolvingEList<Commande>(Commande.class, this, PizzeriaPackage.LIVREUR__COMMANDE, PizzeriaPackage.COMMANDE__LIVREUR);
		}
		return commande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicule getVehicule() {
		if (vehicule != null && vehicule.eIsProxy()) {
			InternalEObject oldVehicule = (InternalEObject)vehicule;
			vehicule = (Vehicule)eResolveProxy(oldVehicule);
			if (vehicule != oldVehicule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PizzeriaPackage.LIVREUR__VEHICULE, oldVehicule, vehicule));
			}
		}
		return vehicule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicule basicGetVehicule() {
		return vehicule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVehicule(Vehicule newVehicule, NotificationChain msgs) {
		Vehicule oldVehicule = vehicule;
		vehicule = newVehicule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PizzeriaPackage.LIVREUR__VEHICULE, oldVehicule, newVehicule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicule(Vehicule newVehicule) {
		if (newVehicule != vehicule) {
			NotificationChain msgs = null;
			if (vehicule != null)
				msgs = ((InternalEObject)vehicule).eInverseRemove(this, PizzeriaPackage.VEHICULE__LIVREUR, Vehicule.class, msgs);
			if (newVehicule != null)
				msgs = ((InternalEObject)newVehicule).eInverseAdd(this, PizzeriaPackage.VEHICULE__LIVREUR, Vehicule.class, msgs);
			msgs = basicSetVehicule(newVehicule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.LIVREUR__VEHICULE, newVehicule, newVehicule));
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
			case PizzeriaPackage.LIVREUR__COMMANDE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommande()).basicAdd(otherEnd, msgs);
			case PizzeriaPackage.LIVREUR__VEHICULE:
				if (vehicule != null)
					msgs = ((InternalEObject)vehicule).eInverseRemove(this, PizzeriaPackage.VEHICULE__LIVREUR, Vehicule.class, msgs);
				return basicSetVehicule((Vehicule)otherEnd, msgs);
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
			case PizzeriaPackage.LIVREUR__COMMANDE:
				return ((InternalEList<?>)getCommande()).basicRemove(otherEnd, msgs);
			case PizzeriaPackage.LIVREUR__VEHICULE:
				return basicSetVehicule(null, msgs);
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
			case PizzeriaPackage.LIVREUR__COMMANDE:
				return getCommande();
			case PizzeriaPackage.LIVREUR__VEHICULE:
				if (resolve) return getVehicule();
				return basicGetVehicule();
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
			case PizzeriaPackage.LIVREUR__COMMANDE:
				getCommande().clear();
				getCommande().addAll((Collection<? extends Commande>)newValue);
				return;
			case PizzeriaPackage.LIVREUR__VEHICULE:
				setVehicule((Vehicule)newValue);
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
			case PizzeriaPackage.LIVREUR__COMMANDE:
				getCommande().clear();
				return;
			case PizzeriaPackage.LIVREUR__VEHICULE:
				setVehicule((Vehicule)null);
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
			case PizzeriaPackage.LIVREUR__COMMANDE:
				return commande != null && !commande.isEmpty();
			case PizzeriaPackage.LIVREUR__VEHICULE:
				return vehicule != null;
		}
		return super.eIsSet(featureID);
	}

} //LivreurImpl
