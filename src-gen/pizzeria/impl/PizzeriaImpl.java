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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pizzeria.Client;
import pizzeria.Employe;
import pizzeria.Pizzeria;
import pizzeria.PizzeriaPackage;
import pizzeria.Vehicule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pizzeria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pizzeria.impl.PizzeriaImpl#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link pizzeria.impl.PizzeriaImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link pizzeria.impl.PizzeriaImpl#getDateDeCreation <em>Date De Creation</em>}</li>
 *   <li>{@link pizzeria.impl.PizzeriaImpl#getVehicule <em>Vehicule</em>}</li>
 *   <li>{@link pizzeria.impl.PizzeriaImpl#getEmploye <em>Employe</em>}</li>
 *   <li>{@link pizzeria.impl.PizzeriaImpl#getClient <em>Client</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PizzeriaImpl extends MinimalEObjectImpl.Container implements Pizzeria {
	/**
	 * The default value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected String adresse = ADRESSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateDeCreation() <em>Date De Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDeCreation()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_DE_CREATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDeCreation() <em>Date De Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDeCreation()
	 * @generated
	 * @ordered
	 */
	protected Date dateDeCreation = DATE_DE_CREATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVehicule() <em>Vehicule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicule()
	 * @generated
	 * @ordered
	 */
	protected EList<Vehicule> vehicule;

	/**
	 * The cached value of the '{@link #getEmploye() <em>Employe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploye()
	 * @generated
	 * @ordered
	 */
	protected EList<Employe> employe;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected EList<Client> client;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PizzeriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PizzeriaPackage.Literals.PIZZERIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdresse(String newAdresse) {
		String oldAdresse = adresse;
		adresse = newAdresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.PIZZERIA__ADRESSE, oldAdresse, adresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.PIZZERIA__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateDeCreation() {
		return dateDeCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDeCreation(Date newDateDeCreation) {
		Date oldDateDeCreation = dateDeCreation;
		dateDeCreation = newDateDeCreation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.PIZZERIA__DATE_DE_CREATION, oldDateDeCreation, dateDeCreation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vehicule> getVehicule() {
		if (vehicule == null) {
			vehicule = new EObjectContainmentEList<Vehicule>(Vehicule.class, this, PizzeriaPackage.PIZZERIA__VEHICULE);
		}
		return vehicule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employe> getEmploye() {
		if (employe == null) {
			employe = new EObjectContainmentEList<Employe>(Employe.class, this, PizzeriaPackage.PIZZERIA__EMPLOYE);
		}
		return employe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Client> getClient() {
		if (client == null) {
			client = new EObjectContainmentEList<Client>(Client.class, this, PizzeriaPackage.PIZZERIA__CLIENT);
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PizzeriaPackage.PIZZERIA__VEHICULE:
				return ((InternalEList<?>)getVehicule()).basicRemove(otherEnd, msgs);
			case PizzeriaPackage.PIZZERIA__EMPLOYE:
				return ((InternalEList<?>)getEmploye()).basicRemove(otherEnd, msgs);
			case PizzeriaPackage.PIZZERIA__CLIENT:
				return ((InternalEList<?>)getClient()).basicRemove(otherEnd, msgs);
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
			case PizzeriaPackage.PIZZERIA__ADRESSE:
				return getAdresse();
			case PizzeriaPackage.PIZZERIA__NOM:
				return getNom();
			case PizzeriaPackage.PIZZERIA__DATE_DE_CREATION:
				return getDateDeCreation();
			case PizzeriaPackage.PIZZERIA__VEHICULE:
				return getVehicule();
			case PizzeriaPackage.PIZZERIA__EMPLOYE:
				return getEmploye();
			case PizzeriaPackage.PIZZERIA__CLIENT:
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
			case PizzeriaPackage.PIZZERIA__ADRESSE:
				setAdresse((String)newValue);
				return;
			case PizzeriaPackage.PIZZERIA__NOM:
				setNom((String)newValue);
				return;
			case PizzeriaPackage.PIZZERIA__DATE_DE_CREATION:
				setDateDeCreation((Date)newValue);
				return;
			case PizzeriaPackage.PIZZERIA__VEHICULE:
				getVehicule().clear();
				getVehicule().addAll((Collection<? extends Vehicule>)newValue);
				return;
			case PizzeriaPackage.PIZZERIA__EMPLOYE:
				getEmploye().clear();
				getEmploye().addAll((Collection<? extends Employe>)newValue);
				return;
			case PizzeriaPackage.PIZZERIA__CLIENT:
				getClient().clear();
				getClient().addAll((Collection<? extends Client>)newValue);
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
			case PizzeriaPackage.PIZZERIA__ADRESSE:
				setAdresse(ADRESSE_EDEFAULT);
				return;
			case PizzeriaPackage.PIZZERIA__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case PizzeriaPackage.PIZZERIA__DATE_DE_CREATION:
				setDateDeCreation(DATE_DE_CREATION_EDEFAULT);
				return;
			case PizzeriaPackage.PIZZERIA__VEHICULE:
				getVehicule().clear();
				return;
			case PizzeriaPackage.PIZZERIA__EMPLOYE:
				getEmploye().clear();
				return;
			case PizzeriaPackage.PIZZERIA__CLIENT:
				getClient().clear();
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
			case PizzeriaPackage.PIZZERIA__ADRESSE:
				return ADRESSE_EDEFAULT == null ? adresse != null : !ADRESSE_EDEFAULT.equals(adresse);
			case PizzeriaPackage.PIZZERIA__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case PizzeriaPackage.PIZZERIA__DATE_DE_CREATION:
				return DATE_DE_CREATION_EDEFAULT == null ? dateDeCreation != null : !DATE_DE_CREATION_EDEFAULT.equals(dateDeCreation);
			case PizzeriaPackage.PIZZERIA__VEHICULE:
				return vehicule != null && !vehicule.isEmpty();
			case PizzeriaPackage.PIZZERIA__EMPLOYE:
				return employe != null && !employe.isEmpty();
			case PizzeriaPackage.PIZZERIA__CLIENT:
				return client != null && !client.isEmpty();
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
		result.append(" (adresse: ");
		result.append(adresse);
		result.append(", nom: ");
		result.append(nom);
		result.append(", dateDeCreation: ");
		result.append(dateDeCreation);
		result.append(')');
		return result.toString();
	}

} //PizzeriaImpl
