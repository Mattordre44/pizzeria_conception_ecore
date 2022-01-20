/**
 */
package pizzeria.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pizzeria.Caissier;
import pizzeria.Client;
import pizzeria.Commande;
import pizzeria.Livreur;
import pizzeria.Pizza;
import pizzeria.PizzeriaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commande</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pizzeria.impl.CommandeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link pizzeria.impl.CommandeImpl#getMontant <em>Montant</em>}</li>
 *   <li>{@link pizzeria.impl.CommandeImpl#getPizza <em>Pizza</em>}</li>
 *   <li>{@link pizzeria.impl.CommandeImpl#getLivreur <em>Livreur</em>}</li>
 *   <li>{@link pizzeria.impl.CommandeImpl#isLivrable <em>Livrable</em>}</li>
 *   <li>{@link pizzeria.impl.CommandeImpl#getCaissier <em>Caissier</em>}</li>
 *   <li>{@link pizzeria.impl.CommandeImpl#getClient <em>Client</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandeImpl extends MinimalEObjectImpl.Container implements Commande {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMontant() <em>Montant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMontant()
	 * @generated
	 * @ordered
	 */
	protected static final double MONTANT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMontant() <em>Montant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMontant()
	 * @generated
	 * @ordered
	 */
	protected double montant = MONTANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPizza() <em>Pizza</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPizza()
	 * @generated
	 * @ordered
	 */
	protected EList<Pizza> pizza;

	/**
	 * The cached value of the '{@link #getLivreur() <em>Livreur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLivreur()
	 * @generated
	 * @ordered
	 */
	protected Livreur livreur;

	/**
	 * The default value of the '{@link #isLivrable() <em>Livrable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLivrable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LIVRABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLivrable() <em>Livrable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLivrable()
	 * @generated
	 * @ordered
	 */
	protected boolean livrable = LIVRABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCaissier() <em>Caissier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaissier()
	 * @generated
	 * @ordered
	 */
	protected Caissier caissier;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected Client client;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PizzeriaPackage.Literals.COMMANDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.COMMANDE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMontant(double newMontant) {
		double oldMontant = montant;
		montant = newMontant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.COMMANDE__MONTANT, oldMontant, montant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pizza> getPizza() {
		if (pizza == null) {
			pizza = new EObjectResolvingEList<Pizza>(Pizza.class, this, PizzeriaPackage.COMMANDE__PIZZA);
		}
		return pizza;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Livreur getLivreur() {
		if (livreur != null && livreur.eIsProxy()) {
			InternalEObject oldLivreur = (InternalEObject)livreur;
			livreur = (Livreur)eResolveProxy(oldLivreur);
			if (livreur != oldLivreur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PizzeriaPackage.COMMANDE__LIVREUR, oldLivreur, livreur));
			}
		}
		return livreur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Livreur basicGetLivreur() {
		return livreur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLivreur(Livreur newLivreur, NotificationChain msgs) {
		Livreur oldLivreur = livreur;
		livreur = newLivreur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PizzeriaPackage.COMMANDE__LIVREUR, oldLivreur, newLivreur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLivreur(Livreur newLivreur) {
		if (newLivreur != livreur) {
			NotificationChain msgs = null;
			if (livreur != null)
				msgs = ((InternalEObject)livreur).eInverseRemove(this, PizzeriaPackage.LIVREUR__COMMANDE, Livreur.class, msgs);
			if (newLivreur != null)
				msgs = ((InternalEObject)newLivreur).eInverseAdd(this, PizzeriaPackage.LIVREUR__COMMANDE, Livreur.class, msgs);
			msgs = basicSetLivreur(newLivreur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.COMMANDE__LIVREUR, newLivreur, newLivreur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLivrable() {
		return livrable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLivrable(boolean newLivrable) {
		boolean oldLivrable = livrable;
		livrable = newLivrable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.COMMANDE__LIVRABLE, oldLivrable, livrable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Caissier getCaissier() {
		if (caissier != null && caissier.eIsProxy()) {
			InternalEObject oldCaissier = (InternalEObject)caissier;
			caissier = (Caissier)eResolveProxy(oldCaissier);
			if (caissier != oldCaissier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PizzeriaPackage.COMMANDE__CAISSIER, oldCaissier, caissier));
			}
		}
		return caissier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Caissier basicGetCaissier() {
		return caissier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaissier(Caissier newCaissier, NotificationChain msgs) {
		Caissier oldCaissier = caissier;
		caissier = newCaissier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PizzeriaPackage.COMMANDE__CAISSIER, oldCaissier, newCaissier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaissier(Caissier newCaissier) {
		if (newCaissier != caissier) {
			NotificationChain msgs = null;
			if (caissier != null)
				msgs = ((InternalEObject)caissier).eInverseRemove(this, PizzeriaPackage.CAISSIER__COMMANDE, Caissier.class, msgs);
			if (newCaissier != null)
				msgs = ((InternalEObject)newCaissier).eInverseAdd(this, PizzeriaPackage.CAISSIER__COMMANDE, Caissier.class, msgs);
			msgs = basicSetCaissier(newCaissier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.COMMANDE__CAISSIER, newCaissier, newCaissier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClient(Client newClient, NotificationChain msgs) {
		Client oldClient = client;
		client = newClient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PizzeriaPackage.COMMANDE__CLIENT, oldClient, newClient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(Client newClient) {
		if (newClient != client) {
			NotificationChain msgs = null;
			if (client != null)
				msgs = ((InternalEObject)client).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PizzeriaPackage.COMMANDE__CLIENT, null, msgs);
			if (newClient != null)
				msgs = ((InternalEObject)newClient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PizzeriaPackage.COMMANDE__CLIENT, null, msgs);
			msgs = basicSetClient(newClient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.COMMANDE__CLIENT, newClient, newClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PizzeriaPackage.COMMANDE__LIVREUR:
				if (livreur != null)
					msgs = ((InternalEObject)livreur).eInverseRemove(this, PizzeriaPackage.LIVREUR__COMMANDE, Livreur.class, msgs);
				return basicSetLivreur((Livreur)otherEnd, msgs);
			case PizzeriaPackage.COMMANDE__CAISSIER:
				if (caissier != null)
					msgs = ((InternalEObject)caissier).eInverseRemove(this, PizzeriaPackage.CAISSIER__COMMANDE, Caissier.class, msgs);
				return basicSetCaissier((Caissier)otherEnd, msgs);
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
			case PizzeriaPackage.COMMANDE__LIVREUR:
				return basicSetLivreur(null, msgs);
			case PizzeriaPackage.COMMANDE__CAISSIER:
				return basicSetCaissier(null, msgs);
			case PizzeriaPackage.COMMANDE__CLIENT:
				return basicSetClient(null, msgs);
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
			case PizzeriaPackage.COMMANDE__DATE:
				return getDate();
			case PizzeriaPackage.COMMANDE__MONTANT:
				return getMontant();
			case PizzeriaPackage.COMMANDE__PIZZA:
				return getPizza();
			case PizzeriaPackage.COMMANDE__LIVREUR:
				if (resolve) return getLivreur();
				return basicGetLivreur();
			case PizzeriaPackage.COMMANDE__LIVRABLE:
				return isLivrable();
			case PizzeriaPackage.COMMANDE__CAISSIER:
				if (resolve) return getCaissier();
				return basicGetCaissier();
			case PizzeriaPackage.COMMANDE__CLIENT:
				return getClient();
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
			case PizzeriaPackage.COMMANDE__DATE:
				setDate((Date)newValue);
				return;
			case PizzeriaPackage.COMMANDE__MONTANT:
				setMontant((Double)newValue);
				return;
			case PizzeriaPackage.COMMANDE__PIZZA:
				getPizza().clear();
				getPizza().addAll((Collection<? extends Pizza>)newValue);
				return;
			case PizzeriaPackage.COMMANDE__LIVREUR:
				setLivreur((Livreur)newValue);
				return;
			case PizzeriaPackage.COMMANDE__LIVRABLE:
				setLivrable((Boolean)newValue);
				return;
			case PizzeriaPackage.COMMANDE__CAISSIER:
				setCaissier((Caissier)newValue);
				return;
			case PizzeriaPackage.COMMANDE__CLIENT:
				setClient((Client)newValue);
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
			case PizzeriaPackage.COMMANDE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case PizzeriaPackage.COMMANDE__MONTANT:
				setMontant(MONTANT_EDEFAULT);
				return;
			case PizzeriaPackage.COMMANDE__PIZZA:
				getPizza().clear();
				return;
			case PizzeriaPackage.COMMANDE__LIVREUR:
				setLivreur((Livreur)null);
				return;
			case PizzeriaPackage.COMMANDE__LIVRABLE:
				setLivrable(LIVRABLE_EDEFAULT);
				return;
			case PizzeriaPackage.COMMANDE__CAISSIER:
				setCaissier((Caissier)null);
				return;
			case PizzeriaPackage.COMMANDE__CLIENT:
				setClient((Client)null);
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
			case PizzeriaPackage.COMMANDE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case PizzeriaPackage.COMMANDE__MONTANT:
				return montant != MONTANT_EDEFAULT;
			case PizzeriaPackage.COMMANDE__PIZZA:
				return pizza != null && !pizza.isEmpty();
			case PizzeriaPackage.COMMANDE__LIVREUR:
				return livreur != null;
			case PizzeriaPackage.COMMANDE__LIVRABLE:
				return livrable != LIVRABLE_EDEFAULT;
			case PizzeriaPackage.COMMANDE__CAISSIER:
				return caissier != null;
			case PizzeriaPackage.COMMANDE__CLIENT:
				return client != null;
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
		result.append(" (date: ");
		result.append(date);
		result.append(", montant: ");
		result.append(montant);
		result.append(", livrable: ");
		result.append(livrable);
		result.append(')');
		return result.toString();
	}

} //CommandeImpl
